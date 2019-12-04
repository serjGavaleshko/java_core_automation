package MyDir.Homework_L11;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebDriver {

    @Test

    public void doSomething() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "windows-size=1024,768");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.submit();
        Thread.sleep(5000);



        List<WebElement> isSeleniumOnPage = (List<WebElement>) driver.findElement(By.className("iUh30 bc"));

        System.out.println(isSeleniumOnPage);


        driver.quit();

    }
}
// проверить есть ли ссылки на сайт селениум.