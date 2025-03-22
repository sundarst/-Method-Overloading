import java.util.*;
public class MathOperation
{
	public static void main(String[] args)
	{
		MathOperation mathOperation=new MathOperation();
		System.out.println(add(10,5));
		System.out.println(add(10,54,12));
		System.out.println(Math.abs(subtract(10,20)));
	    System.out.println(mathOperation.multiply(2,5));// call for non static method
		System.out.println(divide(7,3));

	}
	//Method overloading 
	//when it method oveloading same method name different paramater or different data type
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static int subtract(int a,int b)
	{
		return a-b;
	}
	public  int multiply(int a,int b)
	{
		return a*b;
	}
	public static int divide(int a,int b) 
	{
		return a/b;
	}
	
}


/*
Mistake area
1)System.out.println(a+b+c);
2)MathOperation.java:18: error: incompatible types: unexpected return value
                return a+b+c;
3) error: incompatible types: possible lossy conversion from long to int
                return a+b+c;				



*/