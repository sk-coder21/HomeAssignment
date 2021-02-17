package my.assesment;

public class Subtraction {
	public static void main(String []args){
		Subtraction2 sub=new Subtraction2();//creating object for subtraction class
		int s=sub.functionName(2,4);//
		System.out.println("subtraction of the two integer values:"+ s);
	}
}
class Subtraction2{
	int sub=0;
	public int functionName(int a, int b){//method declare for the above object
		sub=b-a;
		return sub;
		
	}
}
