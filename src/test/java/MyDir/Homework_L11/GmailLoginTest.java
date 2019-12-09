package MyDir.Homework_L11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class GmailLoginTest {

    @Test

    public void gmailLoginTesting() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "windows-size=1024,768");
        ChromeDriver driver = new ChromeDriver(options);
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

        WebElement logInChecker = driver.findElement(By.className("gb_D gb_Oa gb_i"));
        logInChecker.isDisplayed();

        Thread.sleep(5000);


        driver.quit();

    }
}
