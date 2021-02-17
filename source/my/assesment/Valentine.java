package my.assesment;

import java.util.Scanner;

public class Valentine {
	public static void main(String[]args){
		int v=14;
		System.out.println("Enter today's date");
		Scanner sc=new Scanner(System.in);//user can read the input from console
		int h=sc.nextInt();//h holds sc.nextint value
		int d=0;//declaring the variable
		if (h<v){
			d=v-h;
			System.out.println(d+" Days to go 🥰");
		}
		else if(h==v){
			System.out.println("Happy valentine's day");
			
		}
		else{
			d=h-v;
			System.out.println(d+"days after valentine");
		}
	}

}
