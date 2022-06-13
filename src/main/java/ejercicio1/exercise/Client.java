package ejercicio1.exercise;

public class Client {
    public static void main(String[] args) {
        DocumentDatabase documentDatabase = new DocumentDatabase();
        Review review = new Review();

        Document document;

        document = new Document("Thesis");
        document.addLine("Title: Thesis");
        document.addLine("Author: Dylan");
        document.addLine("Year: 2022");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 1

        document.addLine("Introduction");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion());  // 2

        document.addLine("Literature Review");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        document.removeLine(6);
        document.addLine(5, "bla bla bla bla bla bla bla bla bla bla bla.");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 3

        document.addLine("Analysis");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 4

        document.addLine("Results");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        document.addLine("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        review.setDocumentVersion(document);
        documentDatabase.addDocumentVersion(review.createDocumentVersion()); // 5

        document = review.restoreDocumentVersion(documentDatabase.getDocumentVersion(3));
        System.out.println("----------------- Document Version 3 Restored -----------------");
        document.showInfo();
    }
}
