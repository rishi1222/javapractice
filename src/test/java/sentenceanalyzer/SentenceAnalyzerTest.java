package sentenceanalyzer;

import junit.framework.TestCase;
import org.junit.Test;

public class SentenceAnalyzerTest extends TestCase {

    @Test
    public void testNewClassCreated()
    {
        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer("Set the sentence to be analysed. This value should be used to find out the longest sentence in the paragraph. The paragraph should not be more than three hundred words long");

    }

    @Test
    public void testFindTheLongestLength(){
        SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer("Set the sentence to be analysed. This value should be used to find out the longest sentence in the paragraph. The paragraph should not be more than three hundred words long");
        assertEquals(" This value should be used to find out the longest sentence in the paragraph",sentenceAnalyzer.findTheLongestSentence());

    }



}