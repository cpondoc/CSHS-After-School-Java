/**
* 
* This program shows how to use all of the four major operations: addition, subtraction, multiplication, and division. 
* This program also gives a quick introduction into the modulus operator.
*/

public class Program
{
    //Program written by Zach Dorris
	public static void main(String[] args) {
		
		int x = 0;                   //The "int" data type can store whole numbers, like 2 or 17, but not decimals
		System.out.println(x);       //We can print out ints like this!
		System.out.println("x");     //See how, if we use quote marks "x", then it prints x, not the number?
		System.out.println(x+3);     //We can also do math!
		
		System.out.println("----------------------------");
		
		double y = 12.5;             //Doubles can hold decimals as well as whole numbers
		System.out.println(y);
		System.out.println("y");
		System.out.println(y/2);     //We use * for multiplication, and / for division
		
		System.out.println("---------------------------");
		
		x = 5;                       //Since we have already made a variable called x, we can give it new values
		System.out.print(x);
		System.out.println();
		
		x = x + 2;                   //What do you think this does? Make a guess, then run the program!
		System.out.println(x);
		
		y = y*y;                     //After someone explains the last line to you, make a guess for this!
		System.out.println(y);
		
		System.out.println("---------------------------");
		
		x = 6;
		System.out.println(x % 2);   //The percent sign here is called the "modulus" operator. It's tricky!
		
		x = 5;
		System.out.println(x % 2);   //Basically, modulo tells you what the remainder is when you do division.
		                             //So x % 2 is the remainder of x/2
		                             
		int z = 10;
		System.out.println(z % 3);   //Try to figure out what this line prints!
		
	}
}
