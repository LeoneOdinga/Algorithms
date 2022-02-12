public class InsertionSort 
{
   public static void main(String [] args)
   {	
	  int arrayOfNumbers[]= {10,89,34,25,36,95,90,44,311,6,43,6,21,51,25,34,56,3356,0,78,4,23,214,45};
	   insertionSort(arrayOfNumbers);
   }
   public static void insertionSort(int[] array)
   {
	   for(int i=1;i<array.length;i++)
	   {
		   int key =array[i];	
		   int j=i-1;
		   while(j>-1 && array[j]>key)
		   {
			   array[j+1]=array[j];
			   j--;
		   }
		   array[j+1]=key;
	   }
	   printArray(array);
   }
   public static void printArray(int array[])
   {
	   for(int x=0;x<array.length;x++)
	   {
		   System.out.print(array[x]+" ");
	   }
   }
}