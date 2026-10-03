package stringreverse;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void checkStringReverse(){
        StringReverse stringReverse = new StringReverse("HappyBirthday");
        Assert.assertEquals("yadhtriByppaH", stringReverse.reverseString().trim());
    }

}