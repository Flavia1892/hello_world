
import java.io.*;
import java.util.*;
import java.lang.*;


public class Practice extends Arithmetic {
	public static float size;
	public static float size2;
	{
		System.out.println("Asta e un Init block");
	}
	
	public Practice() {
		this(3,4);        //Ca sa fac constructor-chaining in aceeasi clasa folosesc this();
		System.out.println("Wrong!");
		
	}
	public Practice(float x,float y) {
		
		super(x,y);            //Asta e constructorul argumented
		this.size=(float)x;
		this.size2=(float)y;
		
		
			
	}
	
  
      
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Practice pr=new Practice(15,5);
		//System.out.println(pr.size+pr.size2);
		Arithmetic ar=new Arithmetic(size,size2);
		System.out.println("Suma este "+ar.z);
	
		
	}

}
