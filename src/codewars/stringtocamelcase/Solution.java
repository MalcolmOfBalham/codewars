package codewars.stringtocamelcase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized.

Examples:

// returns "theStealthWarrior"
toCamelCase("the-stealth-warrior") 

// returns "TheStealthWarrior"
toCamelCase("The_Stealth_Warrior")

*/

public class Solution {

    static String toCamelCase(String s) {
        // basically want to do the following
        // find underscores or hyphens
        // make the following character uppercase
        // remove said underscores or hyphens
        String textToSearch = s;
        String updatedString = "";
        System.out.println("Input string: " + textToSearch);

        Pattern pattern = Pattern.compile("[-_].");
        Matcher matcher = pattern.matcher(textToSearch);

        while (matcher.find()) {

            // this will find a string such as -s and return S
            String stringToReplace = matcher.group().substring(1).toUpperCase();
            updatedString = matcher.replaceFirst(stringToReplace);
            matcher = pattern.matcher(updatedString);

        }

        System.out.println("Output string:" + updatedString);
        return updatedString;
    }

}
