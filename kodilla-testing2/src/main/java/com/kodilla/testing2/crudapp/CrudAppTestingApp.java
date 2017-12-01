package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.ebay.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static final String XPATH_INPUT = "/html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "/html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_SELECT = "//div[contains(@class, \"section-wrapper\")]/fieldset[2]/select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://rafal-kodilla.github.io/");

        WebElement element = driver.findElement(By.xpath(XPATH_INPUT));
        element.sendKeys("New robotic task");

        WebElement element2 = driver.findElement(By.xpath(XPATH_TEXTAREA));
        element2.sendKeys("New robotic content");

        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());
        WebElement element3 = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(element3);
        selectBoard.selectByIndex(1);

    }
}
