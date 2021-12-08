import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fibonacci 
{
  static Scanner input = new Scanner(System.in);
	
  public static void main (String[] args)
  {
	  System.out.println("Enter the number of terms in the fib sequence: ");
	  int userInput = input.nextInt();
	  
	  System.out.println("The n'th term is : "+ getFibonacci(userInput));
	  
	  System.out.println("The fib sequence is: ");
	  
	  getFibonacci2(userInput);
	  
	  System.out.println("\n"+fibBotUp(userInput));
  }
  
  // getting fibonacci numbers by recursion
  public static int getFibonacci(int n)
  {
	  if(n<=1)
	  {
		  return n;
	  }
	 return getFibonacci(n-1) + getFibonacci(n-2);
  }
  
   // getting fibonacci numbers using bottom up technique
  public static int fibBotUp(int n) 
  {

      Map<Integer, Integer> fib = new HashMap<>();

      for (int i = 0; i <= n; i++) 
      {
          int f;
          if (i <= 1) 
          {
              f = i;
          } else 
          {
              f = fib.get(i - 1) + fib.get(i - 2);
          }
          fib.put(i, f);
      }

      return fib.get(n);
  }
  
  //printing the fib sequence
  public static void getFibonacci2(int n)
  {
	  int n1=0,n2=1,n3;    
	  System.out.print(n1+" "+n2);   
	     
	  for( int i=2;i<=n;i++)  
	  {    
	   n3=n1+n2;    
	   System.out.print(" "+n3);    
	   n1=n2;    
	   n2=n3;    
	  }    
  }
}
