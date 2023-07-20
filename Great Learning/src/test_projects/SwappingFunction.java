package test_projects;

import java.util.*;

public class SwappingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter x value:");
		int x=sc.nextInt();
		
		System.out.print("Enter y Value:");
		int y=sc.nextInt();
		
		//int x=10;
		//int y=20;
		
		swapFunction(x,y);

	}
	public static void swapFunction(int a,int b) {
		
		System.out.println("Original value- a:"+a+" b:"+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("Swapped value- a:"+a+" b:"+b);
	}
}
