public class ShellSort 
{
  public static void main(String[] args)
  {
	  int sort_me[] = {1,2,44,234,23,13,22,42,41,1};
	  
	  print_array(shell_sort_logic(sort_me));
  }
  public static int [] shell_sort_logic(int array[])
  {
	  for(int i=(array.length)/2; i>0; i/=2)
	  {
		  for(int j=i; j<array.length; j++)
		  {
			  for(int k=j-i; k>=0; k-=i)
			  {
				  if(array[k]<array[k+i])
				  {
					  break;
				  }
				  else
				  {
					  int temp = array[k+i];
					  array[k+i]=array[k];
					  array[k]=temp;
				  }
			  }
		  }
	  }
	  return array;
  }
  public static void print_array(int [] array)
  {
	  for(int array_elements: array)
	  {
		  System.out.print(array_elements+" ");
	  }
  }
}
