package codewars.givemeadiamond;

/*the kata task statement
    You need to return a string that displays a diamond shape on the screen using asterisk ("*") characters.
    Please see provided test cases for exact output format.

    The shape that will be returned from print method resembles a diamond, where the number provided as 
    input represents the number of *’s printed on the middle line. 
    The line above and below will be centered and will have 2 less *’s than the middle line. 
    This reduction by 2 *’s for each line continues until a line with a single * is printed at the top and 
    bottom of the figure.

    Return null if input is even number or negative (as it is not possible to print diamond with even 
    number or negative number).
*/
public class Diamond {

    public static String print(int n) {

        // return null if input is even or negative
        if ((n < 0) || ((n % 2) == 0)) {
            return null;
        }

        int lineLength = n; // the length of the middle line is the max length
                            // of the 'middle' line
 
        // first row has just 1 asterisk, and we increment by 2
        int numAsterisks = 1;
        int increment = 2;

        StringBuilder output = new StringBuilder();

        
        while (numAsterisks >= 1) {

            int numSpaces = (lineLength - numAsterisks) / 2;
            output.append(new String(new char[numSpaces]).replace("\0", " "));
            output.append(new String(new char[numAsterisks]).replace("\0", "*"));
            output.append("\n");

            // once have reached the 'middle' line, go the other way
            if (numAsterisks == lineLength) {
                increment = -2;
            }

            numAsterisks += increment;
        }

        // System.out.println(output.toString());
        return output.toString();
    }
}
