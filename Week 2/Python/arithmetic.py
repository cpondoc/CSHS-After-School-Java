""" This program showcases the various operations available in Python """

# Performs a series of arithmetic operations
def arithmetic():
  x = 0;                   # The "" data type can store whole numbers, like 2 or 17, but not decimals
  print(x);       # We can pr out ints like this!
  print("x");     # See how, if we use quote marks "x", then it prints x, not the number?
  print(x+3);     # We can also do math!
  
  print("----------------------------");
  
  y = 12.5;             # Doubles can hold decimals as well as whole numbers
  print(y);
  print("y");
  print(y/2);     # We use * for multiplication, and / for division
  
  print("---------------------------");
  
  x = 5;                       # Since we have already made a variable called x, we can give it new values
  print(x);
  print();
  
  x = x + 2;                   # What do you think this does? Make a guess, then run the program!
  print(x);
  
  y = y*y;                     # After someone explains the last line to you, make a guess for this!
  print(y);
  
  print("---------------------------");
  
  x = 6;
  print(x % 2);   # The percent sign here is called the "modulus" operator. It's tricky!
  
  x = 5;
  print(x % 2);   # Basically, modulo tells you what the remainder is when you do division.
                                # So x % 2 is the remainder of x/2
                                
  z = 10;
  print(z % 3);   # Try to figure out what this line prs!