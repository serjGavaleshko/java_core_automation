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
        printText("username", user.login);
        printText("password", user.password);
        clickBtn("/html/body/main/section/form/footer/button");
        return new NewsPage(driver);
    }
}