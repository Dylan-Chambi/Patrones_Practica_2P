package ejercicio1.exercise;

public class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void showInfo() {
        System.out.println("tittle: " + title);
        System.out.println("Content: " + content);
    }
}
