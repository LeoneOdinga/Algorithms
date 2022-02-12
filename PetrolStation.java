import java.util.ArrayDeque;

public class PetrolStation 
{   
	/*driver code for both the solutions*/
	
   public static void main(String[] args)
   {
	   int petrolAmount[]= {};
	   int distance []= {};
	   
	   int arr2[][]= {{1,3},{2,4},{3,5},{4,1},{5,2}};
	   
	   System.out.println("Stating Station for the optimized solution: "+canCompleteCircuit2(arr2,arr2.length));
	   
	   System.out.println("Stating Station for basic solution: "+canCompleteCircuit1(petrolAmount,distance));
	   
   }
   
   /*improved code courtesy of https://afteracademy.com/blog/gas-station-problem*/
   public static int canCompleteCircuit1(int []petrolStations, int[]distanceArray)
   {
	   int numberOfStations=petrolStations.length; // number of stations in the track
	   
	   for(int i=0;i<numberOfStations;i++)        // outer loop traverses through all stations
	   {
		   int fuelAmount = petrolStations[i];    // fetch fuelAmount in each station iterated
		   
		   boolean fuelIsAvailable = true;         // checks if fuel is available for next travel or not
		   
		   for(int j=0;j<numberOfStations;j++)     // inner loop calculate fuel amounts needed for tour
		   {
			   int currentStation = (i+j)%numberOfStations;
			   int nextStation =(currentStation+1)%numberOfStations;
			   fuelAmount = fuelAmount - distanceArray[currentStation];
			   
			   if(fuelAmount<0)  // fuel is not available, so break loop and start from another station
			   {
				   fuelIsAvailable = false;
				   break;
			   }
			   fuelAmount = fuelAmount + distanceArray[nextStation]; // if fuel is available keep track of the net petrol amount
		   }
		   if(fuelIsAvailable)  // if all traversals are successful and fuel is available , then return the starting index
		   {
			   return i;
		   }
	   }
	   return -1;
   }
   
   /*modified code courtesy of  Hemant Jain 2018 book, Problem Solving in Data Structures And Algorithms Using Java*/
   
   public static int canCompleteCircuit2(int [][] arr, int n)
   {
	   ArrayDeque<Integer> que = new ArrayDeque<Integer>();
	   
	   int nextPump =0,prevPump; // pointers to the previous and next petrol station.
	   int count =0;  // keeps track of the number of times petrol is negative and queue is empty. 
	   int petrol=0; // amount of petrol in each station. set to 0 for the starting station.
	   
	   while(que.size()!=n)// will execute till the queue is filled with all elements in the array.
	   {
		    while(petrol>=0 && que.size()!=n) // execute when net petrol always positive till the queue is full
		    {
		    	que.add(nextPump);   // keep on adding next stations to the queue. 
		    	petrol+= (arr[nextPump][0]-arr[nextPump][1]); // calculate the net petrol balance after adding a station to the queue
		    	nextPump =(nextPump+1)%n; // move the nextPump pointer forward and repeat the while loop execution while petrol is always positive
		    }
		    while(petrol<0 && que.size()>0)  // executes when the petrol balance becomes negative and queue is not empty
		    {
		    	prevPump = que.remove();   // keep removing previous stations from queue
		    	petrol-= (arr[prevPump][0]-arr[prevPump][1]); //after dequeuing, keep decreamenting the petrol balance
		    }
		    count = count+1;   // increament count if both the inner while loops fails to execute
		    
		    if(count==n)   // if count  equals number of stations, then return false, no feasible starting point
		    {
		    	return -1;
		    }
	   }
	   if(petrol>=0)   // make a decision once the inner while terminates. if petrol is positive then return the element at front of queue
	   {
		   return que.remove();
	   }
	   else    
	   {
		   return -1;
	   }
   }
}