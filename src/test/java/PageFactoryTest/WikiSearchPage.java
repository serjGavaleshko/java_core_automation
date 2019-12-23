package PageFactoryTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikiSearchPage {


        @FindBy(how = How.NAME, using = "search")
        private WebElement searchBox;

        public void searchFor(String text) {
            searchBox.sendKeys(text);
            searchBox.submit();
        }
    }

