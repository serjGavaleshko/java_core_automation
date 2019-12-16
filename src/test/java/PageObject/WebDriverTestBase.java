package PageObject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class WebDriverTestBase {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void setUp() {
        System.out.println("setUp");
    }
    @After
    public void tearDown() { driver.close(); }
}
