package ejercicio1.exercise;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        DocumentDatabase documentDatabase = new DocumentDatabase();
        Review review = new Review();

        Document document;

        document = new Document("Thesis", "Introduction");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 1

        document = new Document("Thesis", "Introduction, Literature Review");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion());  // 2

        document = new Document("Thesis", "Introduction, Literature Review, Analysis");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 3

        document = new Document("Thesis", "Introduction, Literature Review, Analysis, Results");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 4

        document = new Document("Thesis", "Introduction, Literature Review, Analysis, Results, Conclusion");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 5

        document = review.restoreDocumentVersion(documentDatabase.getDocumentVersion(3));
        System.out.println("----------------- Document Version 3 Restored -----------------");
        document.showInfo();
    }
}
