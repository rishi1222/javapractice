package comparetable;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablesTest {

    @Test
    public void tableClassCreated(){

        Map<String,ArrayList<String>> table = new HashMap<String,ArrayList<String>>();
        Map<String,String> values = new HashMap<String, String>();
        values.put("FirstName","Rishi");
        values.put("LastName", "Kapoo1");
        values.put("FirstName","Yogita");
        values.put("LastName", "Kapoor2");
        values.put("FirstName","Mahika");
        values.put("LastName", "Kapoor3");
        values.put("FirstName","Maiah");
        values.put("LastName", "Kapoor4");

        Tables tablesObject  = new Tables(table);

        Assert.assertEquals(List.of("Kapoor1","Kapoor2","Kapoor3","Kapoor4"),values.get("LastName"));

        tablesObject.listTableValues();

    }

}