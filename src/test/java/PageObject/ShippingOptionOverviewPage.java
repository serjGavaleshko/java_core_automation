//package PageObject;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import java.util.List;
//
//public class ShippingOptionOverviewPage extends AbstractPage {
//
//    public ShippingOptionOverviewPage(WebDriver driver) {
//        super(driver);
//    }
//    public ShippingOptionOverviewPage assertShippingOptionsCount(int count) {
//        List shippingOptions = driver.findElements(By.tagName("tr"));
//        Assert.assertEquals(count, shippingOptions.size());
//        return this;
//    }
//
//}
