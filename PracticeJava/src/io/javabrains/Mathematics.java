package io.javabrains;
import java.lang.*;
import java.io.*;
import java.io.IOException;
	import java.util.*;
	public class Mathematics{
	
		public static  int a;
		public static  int b;
		public static  float c;
		
	//public Mathematics(int z,int w) {
		
		//	a=z;
		//	b=w;
	  
	//}

	public static float Operation(int x,int y) {
		return c=(float)x/y;
		
	}

	public int circleArea(int radius) {
		return 2*radius;
	}
	
	public static void main (String[]args) throws IOException {
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try {
		Operation(a,b);
		 System.out.println(c);
		 sc.close();
		}
		//catch (ArithmeticException are) {
		finally {
			throw new ArithmeticException("Nu poti imparti la o");}
		//}
		
	 }
	}
	

