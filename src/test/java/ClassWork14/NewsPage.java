package ClassWork14;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class NewsPage extends AbstractPage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public NewsPage assertPostsCount(int count) {
        List posts = driver.findElements(By.className("post"));
        Assert.assertEquals(count, posts.size());
        return this;
    }

    public NewsPage addPost(Post post) {
        printText("title", post.getTitle());
        printText("text", post.getText());
        click("addPostBtn");
        return this;
    }
}
