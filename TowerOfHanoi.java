import java.util.Scanner;
 
public class TowerOfHanoi 
{
	static Scanner input = new Scanner(System.in);
	
   public static void main(String[] args)
   {
	  System.out.println("Enter the number of disks: ");
	  
	  int numberOfDisks = input.nextInt();
	  
	   System.out.println("The sequence of moves are:\n");
	   
	   hanoi(numberOfDisks, 'A','C','B');
   }
   
   public static void hanoi(int num, char src,char dst,char temp)
   {
	   if(num<1)
	   {
		   return;
	   }
	   
	   hanoi(num-1,src,temp,dst);
	   
	   System.out.println("Move "+num+" disk(s) from rod "+src+" to rod "+dst);
	   
	   hanoi(num-1,temp,dst,src);   
	   
   }
}
