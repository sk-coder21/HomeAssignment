package my.assesment;

import java.util.Scanner;

public class Myassesment1 {
	//a program with 3 variables,2 variables are input and 1 variable is output.
	//input variables are non static,output variables are static.
	//create 3 functions,2 function is non static and 1 function is static
	//out of 2 non static function, 1 function returns sum of two numbers, other functions performs subtraction of two numbers.
	//static function should print all the three numbers.e.g num1 = 21, num2= 43, result= num3
	private int num1;//non static variable
	private int num2;//non static variable
	private int num3;
	public static int num4;//static variable
	public static void main(String[] args) { 
		System.out.println("enter num1 and num2");//displaying the num 1 and num2
		Myassesment1 exam=new Myassesment1();//declaring object for non static variables
		Scanner sc= new Scanner(System.in);
		exam.num1=sc.nextInt();//num1 holds next integer from console
		exam.num2=sc.nextInt();//num2 
		exam.num3=sc.nextInt();
		num4=exam.num1+exam.num2-exam.num3;
		System.out.println(num4);
		int apple=exam.sum(exam.num1, exam.num2);//to add non static functions
		System.out.println(apple);
		int sub=exam.sub(exam.num1, exam.num2);
		System.out.println(sub);
			Myassesment1.total(exam.num1, exam.num2, exam.num3);
		}
		public int sum(int number1,int number2){//non static function
			int number3;
			number3=number1+number2;
			return number3;		}
			
		
		public int sub(int number1,int number2){//non static function
			int number3;
			number3=number1-number2;
			return number3;
		}
		public static void total(int number1, int number2 , int number3){
			
		System.out.println("number1: " +number1+ " number2: "+number2+ " number3: "+number3);
			System.out.println("num1= "+ number1+ " num2 = "+ number2+" num3 = "+ number3);
		
		
		
		}
}



