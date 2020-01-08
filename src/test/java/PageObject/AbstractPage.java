//package PageObject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public abstract class AbstractPage {
//    protected WebDriver driver;
//    public AbstractPage(WebDriver driver) {
//        this.driver = driver;
//    }
//    public void printText(String textBoxId, String text) {
//        WebElement textBox = driver.findElement(By.id(textBoxId));
//        textBox.clear();
//        textBox.sendKeys(text);
//    }
//
//    public void clickBtn(String xpath) {
//        WebElement button = driver.findElement(By.xpath(xpath));
//        button.click();
//    }
//}