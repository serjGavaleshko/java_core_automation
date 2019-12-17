package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public abstract class WebDriverTestBase {




    public void driverManager() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "windows-size=1024,768");


    }

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver(

    @Before
    public void setUp() {
        System.out.println("setUp");
    }
    @After
    public void tearDown() { driver.close(); }
}
