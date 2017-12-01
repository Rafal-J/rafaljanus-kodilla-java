package com.kodilla.testing2.facebook;

import com.kodilla.testing2.ebay.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
    public static final String XPATH = "//span[contains(@class, \"5k_4\")]/span/select";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement day = driver.findElement(By.xpath(XPATH + "[1]"));
        day.sendKeys("20");

        WebElement month = driver.findElement(By.xpath(XPATH + "[2]"));
        month.sendKeys("5");

        WebElement year = driver.findElement(By.xpath(XPATH + "[3]"));
        year.sendKeys("1998");
    }
}
