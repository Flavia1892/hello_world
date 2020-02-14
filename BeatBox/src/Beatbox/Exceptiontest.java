package Beatbox;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Exceptiontest {
	 private double a;
	 private double b;
	 
	 		 
	public Exceptiontest(double nextDouble, double nextDouble2) {
		this.a=nextDouble;
		this.b=nextDouble2;
	}

	public double Operation(double x, double y)throws IOException{
		if(y==0)
			throw new IOException();
		else
		return x/y;
	}


public static void main(String[]args) {
	try {
	Scanner sc=new Scanner(System.in);
	Exceptiontest ex=new Exceptiontest(sc.nextDouble(), sc.nextDouble());
	System.out.println(ex.Operation(ex.a, ex.b)); //apelez o metoda risky asa ca trebuie safac un try catch block
	sc.close();
	}
	catch(IOException ex) {
		ex.printStackTrace();
		System.out.println("Nu poti imparti la 0");
		
	}

	
}
}


