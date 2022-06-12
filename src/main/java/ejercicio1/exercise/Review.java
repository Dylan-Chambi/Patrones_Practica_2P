package ejercicio1.exercise;

public class Review {
    private Document state;

    public void setDocumentVersion(Document state){
        this.state=state;
    }

    public DocumentVersion createDocumentVersion(){
        return  new DocumentVersion(state);
    }

    public Document restoreDocumentVersion(DocumentVersion documentVersion){
        this.state = documentVersion.getState();
        return this.state;
    }

}
