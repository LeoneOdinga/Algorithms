
import java.util.Scanner;

public class GaussianElimination 
{
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args)
  {
	  int matrix_size;
	  
	  System.out.println("Enter the size of the matrix(number of rows and columns the matrix i.e M has): ");
	  matrix_size = input.nextInt();
	  
	  double matrix[][] = new double[matrix_size+1][matrix_size+1];
	  double X[][] = new double[matrix_size][matrix_size+1];
	  
	  System.out.println("Enter the values for the matrix in augmented form corresponding with their row values: "
	  		+ "\ni.e if Matrix was size 3, one row can have values like 1 2 3 4 where 4 is the row value"
	  		+ "\nRows should be same as Matrix Size!");
	  
	  enter_matrix_values(matrix,matrix_size);
	  
	  for(int step = 0; step<matrix_size-1; step++)
	  {
		  for(int i=step; i<matrix_size; i++)
		  {
			  double a = (matrix[i+1][step]/matrix[step][step]);
			  
			  for(int j=step; j<=matrix_size; j++)
			  {
				  matrix[i+1][j]-= (a * matrix[step][j]);
						  
			  }
		  }
	  }
	  System.out.println("Gaussian Elimination Matrix After Row Reduction: ");
	  for(int i=0; i<matrix_size; i++)
	  {
		  for(int j=0; j<=matrix_size; j++)
		  {
			  X[i][j] = matrix[i][j];
			  System.out.print((int)matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println("X values From Gaussian Elimination are: ");
	  
	  for(int i=matrix_size-1; i>=0; i--)
	  {
		  double sum =0;
		  
		  for(int j=matrix_size-1; j>1; j--)
		  {
			  X[i][j] = X[j][j] *X[i][j];
			  sum+= X[i][j];
		  }
		  
		  X[i][i] = (X[i][i] == 0)? 0:(X[i][matrix_size]-sum)/X[i][i];
		  System.out.println("X "+i+" = "+X[i][i]);
	  }
  }
  public static void enter_matrix_values(double incoming_matrix[][], int matrix_size)
  { 
	  for(int i=0; i<matrix_size; i++)
	  {
		  for(int j=0;j<=matrix_size; j++)
		  {
			  incoming_matrix[i][j] = input.nextDouble();
		  }
	  }
  }
}