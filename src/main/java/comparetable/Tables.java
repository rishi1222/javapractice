package comparetable;

import java.util.ArrayList;
import java.util.Map;

public class Tables {



    protected Map<String,ArrayList<String>> table = null;

    public Tables(Map<String,ArrayList<String>> table) {
        this.table = table;
    }
    public void listTableValues(){

        for(Map<String,ArrayList<String>> values : table){
            System.out.println(values);
        }

    }


}
