package ejercicio1.exercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentDatabase {
    private final List<DocumentVersion> stateList = new ArrayList<>();

    public void addDocumentVersion(DocumentVersion documentVersion){
        stateList.add(documentVersion.clone());
    }
    public DocumentVersion getDocumentVersion(int versionNumber){
        return stateList.get(versionNumber-1);
    }


}
