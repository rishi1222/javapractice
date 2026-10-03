package inpuhandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordLengthHandler {


    public String returnLongestWord(String[] splitIntoWords) {
        Map<Integer, String> sortDescOrder = new HashMap<>();
        ArrayList<Integer> sortByKeys = new ArrayList<>();
        for (String s : splitIntoWords) {
            sortDescOrder.put(s.length(), s);
            sortByKeys.add(s.length());
        }

        Collections.sort(sortByKeys);
        //System.out.println(sortDescOrder.get(sortByKeys.get(sortByKeys.size()-1)));

        String[] result;
        String max;
        for(int i=0; i< splitIntoWords.length-1;i++)
        {
            for(int j=i+1; j< splitIntoWords.length;j++)
            {
                //System.out.println(splitIntoWords[i]+"  " +splitIntoWords[j]);
                if(splitIntoWords[i].length()> splitIntoWords[j].length()){
                    max=splitIntoWords[i];
                    splitIntoWords[i]=splitIntoWords[j];
                    splitIntoWords[j]=max;
                    //break;
                }
            }

        }
//for(int i =0 ; i < splitIntoWords.length;i++)
//{
//    System.out.println(splitIntoWords[i]);
//}
        String[] wordCount = splitIntoWords[splitIntoWords.length-1].split(" ");
        Collections.sort(sortByKeys);
        System.out.println(wordCount.length);
        return splitIntoWords[splitIntoWords.length-1];
    }



}
