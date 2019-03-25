
/**
 * Write a description of class StudentInfoCard here.
 *
 * @author Chris Pondoc
 * @date 9/5/18
 * @description This program prints information that would be found on a typical Student Information Card.
 * @version V1 (Date listed above)
 */
public class StudentInfoCard
{
    public static void main(String[] args)
    {
        //Header/Banner
        System.out.println("***********************");
        System.out.println("**Student Information**");
        System.out.println("***********************\n");
        
        //Vital Information
        System.out.println("Vitals:");
        System.out.println("Name: Chris Pondoc");
        System.out.print("Birthday: October 15, 2001\t");
        System.out.println("Age: 16 Years Old\n\n");
        
        //Personal Information
        System.out.print("Personal Information:\n");
        System.out.print("School: Frederick High School\t");
        System.out.println("Grade: 11th");
        System.out.println("City: Frederick, Maryland\n");
        
        //Contact Information
        System.out.print("Student Contact Information:\n");
        System.out.print("Home Phone Number: 301-662-1697\t");
        System.out.print("Cell Phone Number: 240-529-2209\n");
        System.out.println("Email Address: chris.pondoc@comcast.net");
        System.out.println("Best Times of Contact: Monday, Wednesday, Friday, 5-7\n");
        
        //Parent Information
        System.out.print("Parent Information for: Carlo Pondoc\n");
        System.out.println("Work Phone Number: 301-517-1943");
        System.out.println("Cell Phone Number: 240-505-0512");
        System.out.println("Email: carlo.pondoc@comcast.net\n");
        
        //Extra Information (Math course, programming, reason for course)
        System.out.println("Miscellaneous:");
        System.out.print("Current Math Course: Calculus III\n");
        System.out.println("Previous Programming Experience: I have taken a class on C++ and have worked on HTML, CSS, PHP, Swift, and Javascript.");
        System.out.println("Reason for taking course: I enjoy programming and want to learn more about a new programming language.");
        System.out.println("Prospective Major: CS + Math");
        System.out.print("Goals: My career goal after college - either undergraduate or an MBA - is to be the CEO of my own tech startup.");
    }
}
