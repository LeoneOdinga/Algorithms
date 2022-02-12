public class SelectionSort 
{
 public static void main(String[] args)
 {
	 int [] sort_me = {12,24,1,2,34,3,2,4,6,7,9,34};
	 
	 print_array(selection_sort(sort_me));
 }
 public static int []selection_sort(int array[])
 {
	 for(int i=0; i<array.length; i++)
	 {
		 int min = i;
		 
		 for(int j=i+1; j<array.length; j++)
		 {
			 if(array[j] <array[min])
			 {
				 min =j;
			 }
		 }
		 int temp = array[i];
		 array[i] = array[min];
		 array[min] = temp;
	 }
	 return array;
 }
 public static void print_array(int array[])
 {
	 for(int array_contents: array)
	 {
		 System.out.print(array_contents+" ");
	 }
 }
}
