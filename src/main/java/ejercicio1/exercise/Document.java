package ejercicio1.exercise;

import java.util.ArrayList;
import java.util.List;

public class Document implements IPrototype {
    private String title;
    private List<String> content;

    public Document(String title) {
        this.title = title;
        this.content = new ArrayList<>();
    }

    public List<String> getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Document addLine(String line){
        content.add(line);
        return this;
    }
    public Document addLine(int index, String line){
        content.add(index, line);
        return this;
    }

    public Document removeLine(int lineNumber){
        content.remove(lineNumber-1);
        return this;
    }

    public void showInfo() {
        System.out.println("Tittle: " + title);
        System.out.println("Content: ");
        for (String line : content) {
            System.out.println(line);
        }
    }

    @Override
    public Document clone() {
        Document documentClone = new Document(title);
        for(String line: content){
            documentClone.addLine(line);
        }
        return documentClone;
    }
}
