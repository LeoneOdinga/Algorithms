import java.security.SecureRandom;

public class RotateArrayKTimes 
{
  public static void main(String[] args)
  {
	 int[] my_array = {1,2,3,4,5,6,7,8,9};
	 print_array(rotate_array(my_array, 2)); System.out.println();
  }
  public static int[] rotate_array(int [] array, int k)
  {
	  int ARRAY_SIZE = array.length;
	  int [] aux_array = new int[ARRAY_SIZE];
	  
	  for(int i=0; i<ARRAY_SIZE; i++)
	  {
		 int j=(i+k) %ARRAY_SIZE;
		 aux_array[i] = array[j];
	  }
	return aux_array;
  }
  public static void print_array(int [] array)
  {
	  for(int i=0; i<array.length; ++i)
	  {
		  System.out.print(array[i]+" ");
	  }
  }
  public static void print_array(String [] array)
  {
	  for(int i=0; i<array.length; ++i)
	  {
		  System.out.print(array[i]+" ");
	  }
  }
  public static int[] shuffle_array(int array[])
  {
	  SecureRandom random = new SecureRandom();
		  for(int i=0;i<array.length; i++)
		  {
			  int random_shuffle_position = random.nextInt(array.length-1)%array.length;
			  
			   int temp = array[i];
			   array[i] = array[random_shuffle_position];
			   array[random_shuffle_position]=temp;
		  }
	  return array;
  }
  public static String[] shuffle_array(String array[])
  {
	  SecureRandom random = new SecureRandom();
		  for(int i=0;i<array.length; i++)
		  {
			  int random_shuffle_position = random.nextInt(array.length-1)%array.length;
			  
			   String temp = array[i];
			   array[i] = array[random_shuffle_position];
			   array[random_shuffle_position]=temp;
		  }
	  return array;
  }
}
