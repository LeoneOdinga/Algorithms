import java.util.Scanner;

public class ParenthesisMatching 
{
  static Scanner input = new Scanner(System.in);
  static final int MAX =100;
  static char[] stack = new char[MAX];
  static int top =-1;

  public static void main(String[] args)
  {
	  String my_expression= null;
	  boolean is_valid =true;
	  
	  System.out.println("Enter an Expression: ");
	  my_expression = input.next();
	  
	  int i =0;
	  while(is_valid && i<my_expression.length())
	  {
		  if (my_expression.charAt(i) == '(' || my_expression.charAt(i) == '{' || my_expression.charAt(i) == '[' || my_expression.charAt(i) == '<')
		  {
				push(my_expression.charAt(i));
		  }
			else if (top >= 0 && stack[top] == opening(my_expression.charAt(i)))
			{
				pop();
			}
			else
			{
				is_valid = false;
			}
			i++;
	  }
	  String result = is_valid && top == -1?"Expression is Valid!":"Invalid Expression!";
	  System.out.println(result);
  }
  
  public static void push(char ch)
  {
	  stack[++top] =ch;
  }
  public static char pop()
  {
	  return stack[top--];
  }
  public static char opening(char ch)
  {
	  switch(ch)
	  {
		case '}':
			ch= '{';
		case ']':
			ch= '[';
		case ')':
			ch= '(';
		case '>':
			ch= '<';		
	}
	return ch;
  }
}
