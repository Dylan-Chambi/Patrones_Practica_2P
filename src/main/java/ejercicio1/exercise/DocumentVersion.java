package ejercicio1.exercise;

public class DocumentVersion implements IPrototype{
    private final Document state;

    public DocumentVersion(Document document){
        state= document;
    }

    public Document getState() {
        return state;
    }

    @Override
    public DocumentVersion clone() {
        return new DocumentVersion(state.clone());
    }
}
