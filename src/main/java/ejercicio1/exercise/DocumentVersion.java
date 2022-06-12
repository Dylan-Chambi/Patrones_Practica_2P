package ejercicio1.exercise;

public class DocumentVersion {
    private final Document state;

    public DocumentVersion(Document document){
        state= document;
    }

    public Document getState() {
        return state;
    }
}
