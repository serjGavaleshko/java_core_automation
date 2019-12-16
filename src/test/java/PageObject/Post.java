package PageObject;

public class Post {
    private String title;
    private String text;

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setText(String newText){
        this.text = newText;
    }

    public String getTitle(){
        return title;
    }

    public String getText(){
        return text;
    }
}
