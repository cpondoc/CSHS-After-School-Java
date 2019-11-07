public class Exemplar
{
	public static void main(String[] args) {
		
		boolean x = true;
		String text = "Howdy, world!";
		
		/*
		  Here are two new data types; boolean and String
		  Notice that "String" is capitalized
		  
		  Booleans only have two possible values: TRUE and FALSE
		  Strings can hold any text you want. Use quote marks around the text!
		*/
		
		System.out.println(text);  //No quote marks! text is a variable name
		System.out.println(x);     //Booleans just print out true or false, if you try
		System.out.println();
		
		x = false;
		
		System.out.println(x);
		
		text = "Java is great.";
		System.out.println(text);
		System.out.println("text");   //Remember this difference; lots of new coders mess it up!
		
		//You can't add, subtract, or do math with booleans really... 
		//There is such a thing as boolean algebra, but we won't talk much about it yet
		
		String text2 = "So is Python!";
		System.out.println(text + " " + text2); //But we can add Strings! (no other math)
		
		//We can also add regular text in between Strings.
		
		System.out.println(text + " So is C++." + text2);
		
		int z = 1729; //Remember ints? These are whole numbers only.
		
		System.out.println();
		
		System.out.println(text + " " + z);   //We can even add together ints and Strings!
		
		System.out.println(text + " " + x);   //And we can add Strings to booleans
		
	}
}
