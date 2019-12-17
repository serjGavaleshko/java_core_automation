package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class WebDriverTestBase {
    RemoteWebDriver driver;

    public  WebDriverTestBase(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "windows-size=1024,768");
        this.driver = new ChromeDriver(options);

    }


    @Before
    public void setUp() {

        System.out.println("setUp");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
