package Least_Squares_Approximation; 

import java.util.Scanner;

public class Simple_Least_Squares 
{
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args)
  {
	  System.out.println("======================SIMPLE LEAST SQUARES LINEAR APPROXIMATION=================");
	  System.out.println("\nEnter the value N, the number of pairs of x and y from the data");
	  
	    int number_of_pairs = input.nextInt();
		
		double x_values [] = new double[number_of_pairs];
		double y_values [] = new double [number_of_pairs];
		double value_to_approximate = 0;
		
		System.out.println("Enter "+number_of_pairs+ " X_values for the data separated by spacebar or [ENTER]: ");
		fillArray(x_values);
		
		System.out.println("Enter "+number_of_pairs+ " Y_values for the data: ");
		fillArray(y_values);
		
		System.out.println("Enter the X value to approximate from the data: ");
		value_to_approximate = input.nextDouble();
		
		double approximation_result = compute_least_squares_approximation(x_values,y_values,value_to_approximate);
		System.out.println("The Y-value corresponding to "+value_to_approximate+" will be: "+approximation_result);
  }
  
  public static double sum_array_elements(double [] array)
  {
	  double sum =0;
	  
	  for(int i=0; i<array.length; ++i)
	  {
		  sum +=array[i];
	  }
	  return sum;
  }
  
  public static double [] square_each_element(double [] array)
  {
	  double [] square_of_x_array = new double[array.length];
	  
	  for(int i=0; i<array.length; i++)
	  {
		  double square_of_x =0;
		  square_of_x = array[i] * array[i];
		  square_of_x_array[i] =square_of_x;
	  }
	  return square_of_x_array;
  }
  
  public static void print_array(double [] array)
  {
	  for(int i=0; i<array.length;i++)
	  {
		  System.out.println(array[i]+" ");
	  }
  }
  
  public static double[] return_XY_column(double [] x_array, double [] y_array)
  {
	  double[] XY_array = new double[x_array.length]; 
	  for (int i=0; i<x_array.length;i++)
	  {
		  double XY_product =0;
		  XY_product = x_array[i]*y_array[i];
		  XY_array[i] = XY_product;
	  }
	  return XY_array;
  }
  
  public static double compute_least_squares_approximation(double[] x_values, double[] y_values, double value_to_approximate)
  {
	  int N = x_values.length;
	  double [] XY_array =return_XY_column(x_values,y_values);
	  double [] x_squared = square_each_element(x_values);
	  
	  double sum_x_values = sum_array_elements(x_values);
	  double sum_y_values = sum_array_elements(y_values);
	  double sum_x_squared = sum_array_elements(x_squared);
	  double sum_XY_array = sum_array_elements(XY_array);
	  
	  double line_gradient = ((N*sum_XY_array)-(sum_x_values*sum_y_values))/((N*sum_x_squared)-(sum_x_values)*(sum_x_values));
	  
	  double y_intercept = ((sum_y_values)-(line_gradient *sum_y_values))/((N));
	  
	  return (line_gradient*value_to_approximate) + y_intercept;
  }
   
  public static void fillArray(double [] array)
	{
	   
	   for(int i=0; i<array.length; ++i)
	   {
		   array[i] = input.nextDouble();
	   }
	   
	}
}
