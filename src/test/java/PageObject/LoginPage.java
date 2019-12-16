package PageObject;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    private String url;
    public LoginPage(String url, WebDriver driver) {
        super(driver);
        this.url = url;
    }
    public LoginPage open() {
        driver.navigate().to(url);
        return this;
    }
    public NewsPage loginAs(User user) {
        printText("login", user.login);
        printText("password", user.password);
        click("loginBtn");
        return new NewsPage(driver);
    }
}