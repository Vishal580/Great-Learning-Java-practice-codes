package test_projects;

import java.util.*;

public class OverLoadingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int r=10;
		
		//int x=20;
		//int y=30;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter r Value:");
		int r=sc.nextInt();
		
		System.out.print("Enter X value:");
		int x=sc.nextInt();
		
		System.out.print("Enter Y value:");
		int y=sc.nextInt();
		
		
		OverLoadingFunction obj=new OverLoadingFunction();
		
		float area_circle=obj.area(r);
		
		int area_rectangle=obj.area(x, y);
		
		System.out.println("Area of the circle is :"+area_circle);
		
		System.out.println("Area of rectangle is :"+area_rectangle);

	}
	
	public int area(int n1,int n2) {
		int result =n1*n2;
		return result;
	}
	
	public float area(int n) {
		float result=3.14f*n*n;
		return result;
	}

}
