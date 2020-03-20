import java.util.*;
import java.io.*;
import java.awt.*;

public class EditCatalog {

    public Catalog catalog;
    EditCatalog()
    {
        catalog = new Catalog();
    }

    public void setCatalog(Catalog newCat)
    {
        catalog = newCat;
    }

    /**
     * @param path - path that will be opened and used for saving the catalog.
     */
    public void save (String path)
    {
        try
        {
            /**
             * We save the object in a file and serialize the object
             */
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(file);
            //Serilization:
            o.writeObject(catalog);
            o.close();
            file.close();
            System.out.println("The object was saved successfully!\n");
        }
        /**
         * If an exception was thrown, we catch it.
         */
        catch (NotSerializableException exception)
        {
            System.out.println("Not Serializable Exception!\n");
        }
        catch (IOException exception)
        {
            System.out.println("IOException!\n");
        }
    }

    public void load (String path)
    {
        /**
         * We read the object and then we deserialize it.
         */
     try
     {
         FileInputStream file = new FileInputStream(path);
         ObjectInputStream i = new ObjectInputStream(file);
         //Deserialization:
         catalog = (Catalog)i.readObject();
         i.close();
         file.close();

         System.out.println("The object was loaded successfully!\n");
     }
     catch (IOException exception)
     {
         System.out.println("IOException!\n");
     }
     catch (ClassNotFoundException exception)
     {
         System.out.println("Class not found exception!\n");
     }
    }

    public void view (String path)
    {

        try
        {
            File file = new File(path);
            Desktop.getDesktop().open(file);
            System.out.println("Object opened successfully!\n");

        }
        catch (IOException exception)
        {
            System.out.println("IOException!\n");
        }
    }

    public void print ()
    {
        catalog.printDoc();
    }
}
