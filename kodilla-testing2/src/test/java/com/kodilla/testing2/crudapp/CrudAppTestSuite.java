package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    public final String BASE_URL = "https://rafal-kodilla.github.io/";
    public final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
    public final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
    public final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
    public final String TRELLOURL = "https://trello.com/login";

    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    public String createTestTask() throws InterruptedException {

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement button = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        button.click();
        Thread.sleep(3000);
        return taskName;
    }

    public void sendTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(4000);
        driver.close();
    }

    private void deleteTask(String taskName) throws InterruptedException {
        WebDriver deleteDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        deleteDriver.get(BASE_URL);
        Thread.sleep(4000);

        deleteDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(form -> form.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(form -> {
                    form.findElement(By.xpath("./div/fieldset[1]/button[4]")).click();
                });

        /*
        deleteDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(form -> form.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(form -> {
                    deleteDriver.findElements(By.xpath(".//button")).stream()
                            .filter(button -> button.getText().equals("Delete"))
                            .forEach(button -> button.click());
                });

                */

    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException, StaleElementReferenceException {
        boolean result = false;
        WebDriver trelloDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        trelloDriver.get(TRELLOURL);

        trelloDriver.findElement(By.id("user")).sendKeys("rjanus@wip.pl");
        trelloDriver.findElement(By.id("password")).sendKeys("P0dl0tek");
        trelloDriver.findElement(By.id("login")).click();

        Thread.sleep(5000);

        trelloDriver.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(3000);

        List<WebElement> results = trelloDriver.findElements(By.xpath("//span"));
        for(WebElement element : results) {
            try{
                if(element.getText().contains(taskName)) {
                return true;
                }
            } catch(StaleElementReferenceException e) {
                return false;
                }
            }
        /*
        result = results.stream()
                .filter(s -> s.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;
*/

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createTestTask();
        sendTaskToTrello(taskName);
        deleteTask(taskName);
        assertEquals(true, checkTaskExistsInTrello(taskName));

    }
}