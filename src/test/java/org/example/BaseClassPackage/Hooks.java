package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup(){
        driverFactory.openBrower();
    }

    @After
    public void teardown() throws InterruptedException {
        driverFactory.closeBrowser();
    }
}
