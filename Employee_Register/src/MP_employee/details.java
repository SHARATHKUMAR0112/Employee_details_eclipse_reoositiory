package MP_employee;

import java.util.*;

//class Employee <x>{
//	
//	x obj;
//
//	public Employee(x obj) {
//		this.obj = obj;
//	}
//	
//	public x disp() {
//		return  obj;
//	}
//	
//	
//}
public class details {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number of Employees");
		int num=sc.nextInt();
		ArrayList total=new ArrayList();
		
		//ArrayList<String> arr=new ArrayList<>();
		
		for (int i=1;i<=num;i++) {
			ArrayList<String> arr=new ArrayList<>();
			System.out.println("Enter Employee "+i+"Details");
			System.out.println("Enter the FirstName");
			String First_name = sc.nextLine();
			//Employee <String> p1 = new Employee<>(First_name);
			arr.add(First_name);
			System.out.println("Enter the LastName");
			String Last_name = sc.nextLine();
			//Employee <String> p2 = new Employee<>(Last_name);
			arr.add(Last_name);
			System.out.println("Enter the Mobile");
			String mobile_number =sc.nextLine();
			//Employee <String> p3 = new Employee<>(mobile_number);
			arr.add(mobile_number);
			System.out.println("Enter the Email");
			String Email = sc.nextLine();
			//Employee <String> p4 = new Employee<>(Email);
			arr.add(Email);
			System.out.println("Enter the Adress");
			String Address = sc.nextLine();
			//Employee <String> p5 = new Employee<>(Address);
			arr.add(Address);
			System.out.println(arr);
			total.add(arr);
		

		}
		System.out.println(total);
		
	}

}
