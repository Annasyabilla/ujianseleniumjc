package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/20/2024 1:17 AM
@Last Modified 10/20/2024 1:17 AM
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

public class LoginNegatifTest {

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
    public void testInvalidUsername() {
        loginPage.clearElement();
        loginPage.LoginUser("standard","secret_sauce");
        Assert.assertEquals(loginPage.getInvLogin(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testInvalidPassword() {
        loginPage.clearElement();
        loginPage.LoginUser("standard_user","sauce");
        Assert.assertEquals(loginPage.getInvLogin(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testNullUsername() {
        loginPage.clearElement();
        loginPage.LoginUser("","secret_sauce");
        Assert.assertEquals(loginPage.getNullUsername(),"Epic sadface: Username is required");
    }

    @Test
    public void testNullPassword() {
        loginPage.clearElement();
        loginPage.LoginUser("standard_user","");
        Assert.assertEquals(loginPage.getNullPassword(),"Epic sadface: Password is required");
    }
}
