package MyDir.Homework_L11;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
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

        //List<WebElement> searchHostName = driver.findElements(By.className("iUh30"));
        List<WebElement> searchHostName = driver.findElements(By.className("iUh30"));

        System.out.println("searchHostName size: " + searchHostName.size());

List<String> searchHostNameString = new ArrayList<>();
int increment = 0;
        for(WebElement e : searchHostName) {
            searchHostNameString.add(e.getText());
              if (e.getText().contains("selenium.dev")) {
                increment ++;
            }
        }

        Assert.assertTrue(increment > 0);
        System.out.println(searchHostNameString);
        //Assert.assertTrue(searchHostNameString.equals("https://selenium.dev"));
        driver.findElement(By.partialLinkText("selenium.dev")).isDisplayed();

        driver.quit();


    }
}
// проверить есть ли ссылки на сайт селениум.