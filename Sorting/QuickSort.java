public class QuickSort
{
  public static void main(String[] args)
  {
	  int sort_me[] = {1,2,54,34,67,13,190,24};
	  
	  quick_sort(sort_me,0,sort_me.length-1);
	  
	  print_array(sort_me);
  }
  public static int partition(int arr[], int low, int high)
  {
	  int pivot = arr[high]; // set pivot to the last element
	  int i = low-1;
	  
	  for(int j=low; j<high; j++)
	  {
		  if(arr[j] <=pivot)
		  {
			  i++;
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j]=temp;
		  }
	  }
	  int temp = arr[i+1];
	  arr[i+1] = arr[high];
	  arr[high] = temp;
	  return i+1;
  }
  public static void quick_sort(int arr[], int low, int high)
  {
	  if(low<high)
	  {
		  int p = partition (arr,low,high);
		  
		  quick_sort(arr,low,p-1);
		  quick_sort(arr,p+1,high);
	  }
  }
  public static void print_array(int array[])
  {
	  for(int array_contents: array)
	  {
		  System.out.print(array_contents+" ");
	  }
  }
}
