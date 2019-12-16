package ClassWork14;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class WebDriverTestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}