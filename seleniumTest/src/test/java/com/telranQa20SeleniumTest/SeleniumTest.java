package com.telranQa20SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;
@BeforeMethod
    public void setUp(){
    driver = new FirefoxDriver();
}
@Test
public void searchGoogle(){
    driver.get("https://www.google.ru/");
}


@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
