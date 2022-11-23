package RegEx2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//if there are any occurrences of the word "w3schools" in a sentence
public class Example1 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit w3schools!");

        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
