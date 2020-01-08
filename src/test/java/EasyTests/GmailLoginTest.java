package EasyTests;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class GmailLoginTest {
    ChromeDriver driver;



//    public GmailLoginTest() {
//
//
//
//    }
    @Test
    public void testLoginPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "windows-size=1024,768");
         driver = new ChromeDriver(options);

        driver.get("https://google.com");
        WebElement logInButton = driver.findElement(By.id("gb_70"));
        logInButton.click();
        Thread.sleep(1000);

        WebElement logInFormName = driver.findElement(By.id("identifierId"));
        logInFormName.sendKeys("s.gavaleshko@gmail.com");
        logInFormName.submit();

        Thread.sleep(2000);

        WebElement logInNextButton = driver.findElement(By.id("identifierNext"));
        logInNextButton.click();

        Thread.sleep(2000);

        WebElement passwordEnter = driver.findElement(By.name("password"));
        passwordEnter.sendKeys("Pass123456789");
        passwordEnter.submit();
        WebElement logInPasswordNextButton = driver.findElement(By.id("passwordNext"));
        logInPasswordNextButton.click();
        Thread.sleep(2000);

        List logInChecker = driver.findElements(By.className("gb_D gb_Oa gb_i"));

        Assert.assertEquals( 1, logInChecker.size());



    }

    @BeforeTest
    public void setUp() {
        System.out.println("Google Login Test Initializing");
    }



    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
