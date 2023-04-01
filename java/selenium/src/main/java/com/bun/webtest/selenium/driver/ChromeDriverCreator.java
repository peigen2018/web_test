package com.bun.webtest.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverCreator implements DriverCreator{

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\dirver\\chromedriver.exe");

        System.setProperty("webdriver.chrome.whitelistedIps", "");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(options);
    }
}
