package my.assesment;

public class Employee {

	String Name;
	String Yearofjoining;
	int salary;
	String Address;
	public static void main(String[]args){
		
		Employee object1=new Employee();
		Employee object2=new Employee();
		Employee object3=new Employee();
		System.out.print("Name Yearofjoining Address " );
		object1.Name="Robert";
		object1.Yearofjoining="1994";
		object1.Address="64C-WallsStreet";
		
		object2.Name="Sam";
		object2.Yearofjoining="2000";
		object2.Address="68D-WallsStreet";
		
		object3.Name="John";
		object3.Yearofjoining="1999";
		object3.Address="26B-WallsStreet";
		
		print(object1);
		print(object2);
		print(object3);
	}
		public static void print(Employee details){
			System.out.print( details.Name + details.Yearofjoining + details.Address);
	
	}
	
}
