public class EvenOddSort 
{
  public static void main(String[] args)
  {
	  int sort_me[] = {1,2,89,4,5,23,11,2,4};
	  print_array(odd_even_sort(sort_me));
  }
  public static int [] odd_even_sort(int array[])
  {
	  boolean is_sorted = false;
	  
	  while(!is_sorted)
	  {
		  is_sorted = true;
		  for(int i= 1; i< array.length-1; i+=2)
		  {
			  if(array[i] > array[i+1])
			  {
				  is_sorted = false;
			  }
		  }
	  }
	  for(int i=0; i<array.length-1; i+=2)
	  {
		  if(array[i] > array[i+1])
		  {
			  int temp = array[i];
			  array[i] = array[i+1];
			  array[i+1] = temp;
			  is_sorted = false;
		  }
	  }
	  return array;
  }
  public static void print_array(int array[])
  {
	  for(int array_elements: array)
	  {
		  System.out.print(array_elements+" ");
	  }
  }
}
