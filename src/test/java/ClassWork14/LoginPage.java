package ClassWork14;

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
        printText("login", user.getLogin());
        printText("password", user.getPassword());
        click("loginBtn");
        return new NewsPage(driver);
    }
}
