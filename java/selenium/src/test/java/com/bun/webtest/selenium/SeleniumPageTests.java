package com.bun.webtest.selenium;

import com.bun.webtest.selenium.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPageTests {

    @Test
    public void test_selenium(){

        WebDriver driver = SeleniumUtils.createDriver(SeleniumUtils.DriverEnum.EDGE);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement element = driver.findElement(By.name("my-readonly"));

        String value = element.getAttribute("value");
        Assert.assertTrue(value.contains("Readonly"),"actual is " + value);

        driver.close();
    }


    @Test
    public void test_selenium_2(){

        WebDriver driver = SeleniumUtils.createDriver(SeleniumUtils.DriverEnum.EDGE);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement element = driver.findElement(By.name("my-readonly"));

        String value = element.getAttribute("value");
        Assert.assertTrue(value.contains("Readonly1"),"actual is " + value);

        driver.close();
    }
}
