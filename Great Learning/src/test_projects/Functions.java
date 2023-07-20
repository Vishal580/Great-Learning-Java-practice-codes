package test_projects;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sparta();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Value:");
		int a=sc.nextInt();
		
		System.out.print("Enter b Value:");
		int b=sc.nextInt();

		//int a=10;
		//int b=20;
		
		add(a,b);
	}
	
	//Non-Parameterized function
	
	public static void sparta() {
		System.out.print("Addition\n");
	}

	
	//Parameterizes function
	
	public static void add(int a , int b) {
		System.out.print(a+b);
	}
}
