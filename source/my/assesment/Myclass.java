package my.assesment;

public class Myclass {
	int x=5;//instance variable
	int y=10;
	public static void main(String[]args){
		int z=11;
		Myclass object=new Myclass();//object created for Myclass
		Myclass object1=new Myclass();
		Myclass object2=new Myclass();
		int s=object.x;
		int s1=object1.y;
		System.out.println("Output of my class:" +s);
		System.out.println("Output of my class:" +s1);
		System.out.println("Output of my class:" +z);
		
	}

}
