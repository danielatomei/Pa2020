import java.io.*;
import java.util.*;


 /**
 * We create a list of documents ( a catalog ), and the posibility to add, remove or print the current catalog.
 */
public class Catalog implements java.io.Serializable{
    private List<Document> documents;
    private String name;

    Catalog()
    {
        documents = new ArrayList<Document>();
        name = new String();
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void addDoc (Document doc)
    {
        documents.add(doc);
    }

    public void removeDoc (Document doc)
    {
        documents.remove(doc);
    }

    public void printDoc ()
    {
        int i;
        for(i = 0; i < documents.size(); i++)
        {
            System.out.println("ID: " + documents.get(i).getID() + "\nName: " + documents.get(i).getName() + "\nTags: ");
            documents.get(i).printTags();
        }
    }


}
