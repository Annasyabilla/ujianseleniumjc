package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/20/2024 1:13 AM
@Last Modified 10/20/2024 1:13 AM
Version 1.0
*/

import com.juaracoding.Utils.Utils;
import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPositifTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage();
    }

    @AfterClass
    public void finish() {
        Utils.delay(5);
        DriverSingleton.closeObjectInstance();
    }
    @Test
    public void testLoginPositif() {
        loginPage.LoginUser("standard_user","secret_sauce");
        Assert.assertEquals(loginPage.getProductsTitle(),"Products");
    }
}
