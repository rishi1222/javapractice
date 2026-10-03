package sentenceanalyzer;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SentenceAnalyzer {

    String sentence;
    public SentenceAnalyzer(String sentence) {
        this.sentence = sentence;
    }

    public String findTheLongestSentence() {

        String[] split = sentence.split("\\.");

        TreeMap<Integer,String > length = new TreeMap<>();
        for(String str : split){
            length.put(str.length(),str);

        }

        return length.lastEntry().getValue();
    }



}
