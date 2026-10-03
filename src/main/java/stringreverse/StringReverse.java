package stringreverse;



public class StringReverse {

    String newString;

    public StringReverse(String newString) {
        this.newString = newString;
    }

    public String reverseString(){
         char[] newChar = newString.toCharArray();
        String reverseString ="";
        for(char value : newChar){
            reverseString = value + reverseString;
        }
        return reverseString;
    }
}
