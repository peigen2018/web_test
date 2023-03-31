package com.bun.webtest.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\dirver\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\dirver\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.whitelistedIps", "");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.baidu.com/");



        WebDriver edgedriver = new EdgeDriver();
        String pageSource = edgedriver.getPageSource();

//                String pageSource = driver.getPageSource();
//        WebElement element = driver.findElement(By.id("s_fm"));
//
//        String text = element.getText();

        System.out.println(pageSource);

    }
}
