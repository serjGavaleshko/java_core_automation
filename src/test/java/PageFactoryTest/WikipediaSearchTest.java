//package PageFactoryTest;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.List;
//
//public class WikipediaSearchTest {
//
//    RemoteWebDriver driver;
//
//    public WikipediaSearchTest(){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless", "windows-size=1024,768");
//        driver = new ChromeDriver(options);
//    }
//    @Before
//    public void setUp(){
//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//    }
//    @After
//
//    public void tearDown() {
//        driver.close();
//    }
//
//    @Test
//    public void wikipediaSearchTesting(){
//
//        WikiSearchPage page = PageFactory.initElements(driver, WikiSearchPage.class);
//        page.searchFor("Jenkins");
//        List softwareList = driver.findElements(By.partialLinkText("Software"));
//        Assert.assertEquals(1, softwareList.size());
//
//    }
//    @Test
//    public void titleContainsWikiTest(){
//        Assert.assertTrue(driver.getTitle().toLowerCase().contains("wiki"));
//    }
//}
