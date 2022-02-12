// Hi...
// this is an example of Euclid's algorithm that is impplemented recursively when finding to find the GCD of 2 numbers
// we will have to write a function that takes the two integers as parameters and pass to the function
// the base case occurs when n1==0 or when n2== 0, this is where the function terminates 
// 
public class EuclidAlgo 
{
  public static void main(String[] args)
  {
	System.out.println("The GCD is: "+getGCD(66528,52920));   // try with a set of input cases
  }
  public static int getGCD(int n1, int n2)
  {
	  if(n1==0)
	  {
		  return n2;
	  }
	  
	  else if(n2==0)
	  {
		  return n1;
	  }
	  
	  else if(n1>n2)
	  {
		  return getGCD(n1%n2, n2);
		  
	  }
	  else  // perform if n1 is less than n2
	  {
		  return getGCD(n1,n2%n1);
	  }
  }
}
