import java.util.*;

public class Document implements java.io.Serializable {
    private String name;
    private Integer ID;
    private Map<String, String> tags;

    Document()
    {
        /**
         * by default, ID will be 0
         */
        ID = 0;
        name = new String();
        tags = new HashMap<String, String>();
    }

    public void setID (Integer newID)
    {
        ID = newID;
    }

    public void setName (String newName)
    {
        name = newName;
    }

    public void addTag (String tagName, String value)
    {
        tags.put(tagName, value);
    }

    public Integer getID ()
    {
        return ID;
    }

    public String getName ()
    {
        return name;
    }

    public void printTags ()
    {
        for (String key: tags.keySet())
        {
            System.out.println(" " + key + ": " + tags.get(key));
        }
    }
}
