
/**
 * The Output Difference class introduces the difference between System.out.print() and System.out.println().
 *
 * @author Chris Pondoc
 * @version 3/25/19
 */
public class OutputDifference
{
    /**
     * Prints the message "Hello, World!" to the screen using both print() and println().
     */
   public static void main(String[] args)
   {
       //Message with a println() makes the cursor go to the next line after the line is over.
       System.out.println("Hello,");
       System.out.println("World!");
       
       //Message with just a print() makes the cursor stay right after the next character that is outputted.
       System.out.print("Hello, ");
       System.out.print("World!");
   }
}
