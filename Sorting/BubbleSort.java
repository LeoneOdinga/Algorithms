public class BubbleSort
{
   public static void main(String[] args)
   {
	   int userInputArray[] = {7,10,13,24,6,1,2,7,5,9,337,44};
	   
	   bubbleSort(userInputArray);
   }
   
   public static void bubbleSort(int array[])
   {
	   int i=0, j=0, temp,swap_check;
	   
	   for( i=0; i< array.length;i++)
	   {
		   swap_check=0;
		    for(j=0;j<array.length-1-i;j++)
		    {
		    	 if(array[j]> array[j+1])
		    	 {
		    		 swap_check =1;
		    		 temp=array[j];
		    		 array[j]=array[j+1];
		    		 array[j+1]=temp;
		    	 }
		    }
		    if(swap_check ==0)
		    {
		    	break;
		    }
	   }
	   printArray(array);
   }
   
   public static void printArray(int []array)
   {
	   for(int i=0;i<array.length;i++)
	   {
		   System.out.print(array[i]+" ");
	   }
   }
}
