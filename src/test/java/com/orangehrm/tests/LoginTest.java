package com.orangehrm.tests;

import com.katalon.tests.TestBase;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends TestBase{


    @Test
    public void login() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        HomePage homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        homePage.clickMyInfo();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }





}
