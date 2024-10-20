package com.juaracoding.driver.strategies;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/19/2024 4:24 PM
@Last Modified 10/19/2024 4:24 PM
Version 1.0
*/

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {

        switch (strategy) {
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
