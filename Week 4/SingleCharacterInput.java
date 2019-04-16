
/**
 * This program demonstrates the use of single character input for evaluation
 * as a char primitive data type in a boolean expression, instead of using
 * the equals method of the String class.
 *
 * @author Chris Pondoc
 * @version 4/16/2019
 */
import java.util.Scanner;
public class SingleCharacterInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Input
        System.out.print("Do you live in Florida (Y/N)? ");
        String liveInFlorida = in.next();

        //Processing and Output
        boolean isResident = resident == "Y";

        if(isResident)
            System.out.println("Status: Florida Resident");
        else
            System.out.println("Status: Non-Resident");
    }
}
