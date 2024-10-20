package com.juaracoding.pages;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/20/2024 1:08 AM
@Last Modified 10/20/2024 1:08 AM
Version 1.0
*/

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private  WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement txtProductsTitle;

    @FindBy(xpath = " //h3[@data-test='error']")
    private WebElement txtInvLogin;

    @FindBy(xpath = " //h3[@data-test='error']")
    private WebElement txtNullUsername;

    @FindBy(xpath = " //h3[@data-test='error']")
    private WebElement txtNullPassword;

    public void LoginUser(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.btnLogin.click();
    }

    public void clearElement (){
        this.username.clear();
        this.password.clear();
    }
    public String getProductsTitle(){
        return txtProductsTitle.getText();
    }

    public String getInvLogin(){
        return txtInvLogin.getText();
    }

    public String getNullUsername(){
        return txtNullUsername.getText();
    }
    public String getNullPassword(){
        return txtNullPassword.getText();
    }

}
