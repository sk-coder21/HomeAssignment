package my.assesment;

import java.util.Scanner;

public class Decisionmaking {
	public static void main(String[]args){
		int input;
		System.out.println("Enter your age");
		Scanner s=new Scanner(System.in);
		input=s.nextInt();
		if(input>18){
			System.out.println("You are eligible for vote");}
			else if(input>20){
				System.out.println("You are a major");}
			else {
				System.out.println("You are not a major");}
				
			}
		}
	


