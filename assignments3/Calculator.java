package week3.day5.assignments3;
      /*POLYMORPHISM*
Assignment 1:
Create class Calculator with below methods
- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
create object for the Calculator class and execute all the methods
*
*
     */

public class Calculator {

	public void add(int a,int b)
	{
		int c= a+b;	
		System.out.println(c);
	}
	
	public void add(int a,int b, int c)
	{
		int d= a+b+c;
		System.out.println(d);
	}
	
	public void multiply(int a, int b)
	{
		int c= a*b;
		System.out.println(c);
	}
	
	public void multiply(int a, double b)
	{
		double c= a*b;
		System.out.println(c);
	}
	public void subtract(int a,int b)
	{	
		if(a>b)
		{
		int c= a-b;
		System.out.println(c);
	}else
	{
		int c= b-a;
		System.out.println(c);
	}
	}
	
	public void subtract(double a,double b)
	{	
		if(a>b)
		{
		double c=a-b;
		System.out.println(c);
	}else
	{
		double c=a-b;
		System.out.println(c);
	}
	}
	
	public void divide(int a,int b)
	{
		int c= a/b;
		System.out.println(c);
	}
	
	public void divide(int a, double b)
	{
		System.out.println("Divide");
		double c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	
Calculator cal = new Calculator();
cal.add(1, 2);
cal.add(1, 2, 3);
cal.multiply(22, 7);
cal.multiply(72, 7);
cal.divide(22, 7);
cal.divide(77, 2.2);
cal.subtract(222, 77);
cal.subtract(5.7, 3.2);
	}

}
