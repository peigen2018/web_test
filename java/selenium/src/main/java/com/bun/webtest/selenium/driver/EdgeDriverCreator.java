package com.bun.webtest.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverCreator implements DriverCreator {
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.edge.driver", "src\\main\\resources\\dirver\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--remote-allow-origins=*");
        return new EdgeDriver(options);
    }
}
