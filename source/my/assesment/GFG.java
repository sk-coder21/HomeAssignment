package my.assesment;
import java.io.*;
 class Addition {
	int Sum=0;
	public int addTwoint(int a,int b){
	Sum= a+b;
	return Sum;}}
	

public class GFG{
	
	public static void main(String[] args ){
		Addition add= new Addition();
		int S= add.addTwoint(1,2);
		System.out.println("sum of the two integer values:" +S);
	}
}


