package string;

public class Palindrome 
{
  /***********DRIVER CODE************/
  public static void main(String[] args)
  {
	  System.out.println(checkIfPalindrome("aba"));
	  System.out.println(checkIfPalindrome_Recursively("aba"));
  }
  
  
  /*FUNCTION TO RECEIVE A STRING AND CHECK IF IT IS A PALINDROME*/
  public static boolean checkIfPalindrome(String suspectedPalindrome)
  {
	  int sizeOfString = suspectedPalindrome.length();
	  // start by converting the passed string to either lower or upper case to make comparing standard
	  
	  suspectedPalindrome.toLowerCase();	
	  
	  // Now iterate through the string in two directions, both from left and right while making comparisons till we meet at midpoint
	  
	  for(int i =0; i<sizeOfString/2; ++i)
	  {
		  if(suspectedPalindrome.charAt(i) != suspectedPalindrome.charAt(sizeOfString -1 -i))
		  {
			  return false;
		  }
		 
	  }
	  return true;
  }
  
  //FUNCTION TO CHECK IF STRING IS PALINDROME BY RECURSION
  public static boolean checkIfPalindrome_Recursively(String stringPassed) 
  {
      if (stringPassed == null || stringPassed.length() <= 1) 
      {
          return true;
      }
      else if (stringPassed.charAt(0) != stringPassed.charAt(stringPassed.length() - 1))
      {
          return false;
      }
      else
      {
    	   return checkIfPalindrome_Recursively(stringPassed.substring(1, stringPassed.length() - 1));
      }
  }

}
