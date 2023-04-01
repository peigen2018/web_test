package com.bun.webtest.selenium;

import com.bun.webtest.selenium.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    public static void main(String[] args) {


        WebDriver driver = SeleniumUtils.createDriver(SeleniumUtils.DriverEnum.EDGE);
        driver.get("https://www.baidu.com/");


        String pageSource = driver.getPageSource();


        WebElement element = driver.findElement(By.id("s-hotsearch-wrapper"));



        String text = element.getText();

        System.out.println(pageSource);
        System.out.println(text);

    }
}
