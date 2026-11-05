package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        // Automatically launches Chrome Browser
        WebDriver driver = new ChromeDriver();
        
        // Open Google Webpage
        driver.get("https://google.com");
        
        // Prints Website Title in Console logs
        System.out.println("Website Title: " + driver.getTitle());
        
        // Safely Closes Browser session
        driver.quit();
    }
}
