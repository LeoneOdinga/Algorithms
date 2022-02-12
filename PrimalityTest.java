//Every Prime number, except 2 and 3 are of the form 6*k+1 or 6*k-1 for integer values of k.

public class PrimalityTest
{
  public static void main(String[] args)
  {
	 System.out.println(is_prime(1019)); // test for different input values
  }
  public static boolean is_prime(int number)
  {
	  if ( ( (!(number%2 ==1)) && number != 2 ) || (number < 2) || (number % 3 == 0 && number != 3) )
		    return false;

		    for( int k = 1; 36*k*k-12*k < number;++k)
		    {
		   	if ( (number % (6*k+1) == 0) || (number % (6*k-1) == 0) )
		        return false;		
		 	}
		   return true;
  }
}
