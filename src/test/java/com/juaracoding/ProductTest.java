package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/20/2024 2:05 AM
@Last Modified 10/20/2024 2:05 AM
Version 1.0
*/

import com.juaracoding.Utils.Utils;
import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
    }

    @AfterClass
    public void finish() {
        Utils.delay(5);
        DriverSingleton.closeObjectInstance();
    }
    @Test
    public void testAddToCart() {
        loginPage.LoginUser("standard_user","secret_sauce");
        productsPage.clickAddToCart();
        Assert.assertEquals(productsPage.getTxtCartBadge(), "1");

    }

}
