package Lagrange_Interpolation;

import java.util.ArrayList;
import java.util.Scanner;

public class Lagrange 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("======================Lagrange polynomial Interpolation and Approximation=================");
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
		
		double approximation_result = lagrange_Interpolation_Value(compute_Lagrange(x_values,value_to_approximate),y_values);
		System.out.println("The Y-value corresponding to "+value_to_approximate+" will be: "+approximation_result);
	}
	
	/*function to compute lagranges from L0(x) to Ln(x) and place them on a list*/
	public static ArrayList<Double> compute_Lagrange(double [] x_values,double value_to_approximate)
	{	
		int N = x_values.length;
		
		ArrayList<Double> lagrange_List = new ArrayList<Double>();
		
		double product =1;
		
		for(int i =0; i<N; ++i) 
		{
			
			for(int j=0;j<N;++j)
			{
				if(j==i)
				{
					continue;
				}
				
				product = product * (value_to_approximate - x_values[j])/ (x_values[i] - x_values[j]); 
				
			}
			
			lagrange_List.add(product);
			
			product =1;
		}
		
		return lagrange_List;
	}
	
	/*From the list of lagrange computed, multiply each element with Y_Values while summing the products*/
	public static double lagrange_Interpolation_Value (ArrayList<Double> lagrange_List, double[] y_values)
	{
	   int ARRAY_SIZE = lagrange_List.size();
	   
	   double lagrange_array[] = new double[ARRAY_SIZE];
	   
	   double final_approximated_value=0;
	   
	      int counter =0;
		  while(counter < lagrange_List.size())
		  {
			  lagrange_array[counter] = lagrange_List.get(counter);
			  counter++;
		  }
	   double sum_of_products =0;
	   
	   for(int i =0; i<lagrange_array.length; ++i)
	   {
		  final_approximated_value =lagrange_array[i] * y_values[i];
		  sum_of_products += final_approximated_value;
	   }
	   
	   return sum_of_products;
	}
	
	public static void fillArray(double [] array)
	{
	   
	   for(int i=0; i<array.length; ++i)
	   {
		   array[i] = input.nextDouble();
	   }
	   
	}
}