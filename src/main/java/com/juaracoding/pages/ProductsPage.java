package com.juaracoding.pages;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/20/2024 2:02 AM
@Last Modified 10/20/2024 2:02 AM
Version 1.0
*/

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]")
    private WebElement frameEtalaseOne;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement txtCartBadge;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement btnRemove;







    public void clickAddToCart(){
        btnAddToCart.click();
    }

    public void clickBtnRemove(){
        btnRemove.click();
    }

    public String getTxtCartBadge(){
        return txtCartBadge.getText();
    }
}
