import java.util.*;

public class Main {

    public static void main(String[] args) {
        Document doc1 = new Document();
        doc1.setID(1);
        doc1.setName("FBI");
        doc1.addTag("Access", "Private");
        doc1.addTag("Date", "1996");

        Document doc2 = new Document();
        doc2.setID(2);
        doc2.setName("NASA");
        doc2.addTag("Date", "2007");
        doc2.addTag("Budget", "1700000");

        Catalog catalog = new Catalog();
        catalog.setName("TopDocs");
        catalog.addDoc(doc1);
        catalog.addDoc(doc2);
        System.out.println("The catalog: " + catalog.getName());
        catalog.printDoc();

        EditCatalog editCat = new EditCatalog();
        editCat.setCatalog(catalog);
        editCat.save("top.txt");
        Catalog emptyCat = new Catalog();
        editCat.setCatalog(emptyCat);
        editCat.load("top.txt");
        System.out.println("The new catalog: \n");
        editCat.print();
    }
}
