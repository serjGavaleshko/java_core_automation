package PageObject;

import org.junit.Test;

public class PageObjectLikeTest extends PageObject.WebDriverTestBase {
    @Test
    public void testCreatePost() {
        User user = new User("ADMIN", "PASS");
        Post post = new Post();
        post.setText("TEXT");
        post.setTitle("TITLE");

        Post post2 = new Post();
        post.setText("TEXT2");
        post.setTitle("TITLE2");

        LoginPage loginPage = new LoginPage("http://localhost", driver);
        NewsPage newsPage = loginPage.open().loginAs(user);
        newsPage.assertPostsCount(0)
                .addPost(post)
                .assertPostsCount(1);
        newsPage.addPost(post2)
                .assertPostsCount(2);
    }
}