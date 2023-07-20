package test_projects;

import java.util.*;

public class FunctionAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionAdd obj=new FunctionAdd();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Value:");
		int a=sc.nextInt();
		
		System.out.print("Enter b Value:");
		int b=sc.nextInt();
		
		//int a=10;
		//int b=20;
		
		int get_res=obj.add(a, b);
		System.out.println(get_res);
	}
	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
}
