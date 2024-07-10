package assignment5;

public abstract class Media {
    protected String content;

    public Media(String content) {
        this.content = content;
    }

    public String show() {
        return content;
    }
}
