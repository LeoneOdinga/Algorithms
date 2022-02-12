import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CollatzSequence 
{
   /**********DRIVER CODE *************/
   public static void main(String[] args)
   {   
	       int count =0;
	       while(count <=generateRandomNumbers())
	       {
	    	   int testNumber = generateRandomNumbers();
	    	   Queue<Integer>returnedCollatzQueue =returnCollatzSequence(testNumber);
	    	   
	    	   if(printNumberOfHopsTo1(returnedCollatzQueue) <100)
			   {
				   printCollatzSequence(returnedCollatzQueue);
				   System.out.println("\nThe Collatz Sequence of "+" Took "+printNumberOfHopsTo1(returnedCollatzQueue) +" hops ");
				   System.out.println(); System.out.println();
			   }   
	    	   count +=	1;
	       }
   }
   
   /*RETURN THE COLLATZ SEQUENCE OF THE NUMEBR PASSED IN AS ARGUMENT*/
   public static Queue<Integer> returnCollatzSequence(int Number)
   {
	   Queue<Integer> collatzQueue = new LinkedList<>();
	   
	   collatzQueue.add(Number);
	   
	   while(Number > 1)
	   {
		   if(checkWhetherEvenOrOdd(Number) == true)
		   {
			   Number /= 2;
			   collatzQueue.add(Number);
			   
		   }
		   else
		   {
			   Number = 3*Number +1;
			   collatzQueue.add(Number);
		   }
	   }
	   return collatzQueue;
   }
   
   	/*RETURNS TRUE IF THE NUMBER IS EVEN ELSE FALSE*/
   public static boolean checkWhetherEvenOrOdd(int number)
   {
	   return number % 2 == 0 ? true:false;
   }
   
   public static void printCollatzSequence(Queue<Integer> collatzQueue)
   {
	   Iterator<Integer> iterator = collatzQueue.iterator();
	    while(iterator.hasNext())
	    {
	        int element = iterator.next();
	        System.out.print(element+"-->");
	    }
   }
   
   /*PRINT THE NUMBER OF TIMES IT TOOK TO ARRIVE BACK AT NUMBER 1*/
   public static int printNumberOfHopsTo1(Queue<Integer> collatzQueue)
   {
	  int  sizeOfQueue = collatzQueue.size();
	  
	  int numberOfHopsTo1 = sizeOfQueue - 1;
	  
	  return numberOfHopsTo1;
   }
   
   /*GENERATES RNADOM INTEGER VALUE BETWEEN 1 AND 5000 */
   public static int generateRandomNumbers()
   {
       Random random = new Random();
 	   int integerRandom = random.ints(1, 2, 5000).findFirst().getAsInt();
 	  
 	   int generatedRandomNumber = integerRandom;
 	   
 	   return generatedRandomNumber;
 	  
   }
}
