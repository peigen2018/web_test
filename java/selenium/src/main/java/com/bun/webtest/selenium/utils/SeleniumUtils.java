package com.bun.webtest.selenium.utils;

import com.bun.webtest.selenium.driver.ChromeDriverCreator;
import com.bun.webtest.selenium.driver.EdgeDriverCreator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumUtils {
    public enum DriverEnum{
        CHROME,EDGE
    }
    static {
        init();
    }

    public static void init(){


    }


    public static WebDriver createDriver(DriverEnum driver){
        switch (driver) {
            case EDGE:
                    return new EdgeDriverCreator().create();

            case CHROME:
                    return new ChromeDriverCreator().create();
        }

        throw new IllegalStateException();
    }

}
