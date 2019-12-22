package PageObject;

import org.junit.Test;

public class PageObjectLikeTest extends PageObject.WebDriverTestBase {
    @Test
    public void testCheckShippingOptionQty() {
        User user = new User("admin", "valley51");
        int dsoCount = 281;

        LoginPage loginPage = new LoginPage("https://dev.paazl.com/login.jsp", driver);
        ShippingOptionOverviewPage shippingOptionOverviewPage = loginPage.open().loginAs(user);

        shippingOptionOverviewPage.assertShippingOptionsCount(dsoCount)
                .assertShippingOptionsCount(dsoCount);
    }
}