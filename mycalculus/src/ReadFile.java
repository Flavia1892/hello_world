import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile extends Nume{

	public static void main(String[] args)
	throws java.io.IOException{
		
		Scanner sc=new Scanner(new File("C:\\Users\\flavi\\Desktop\\aha.txt"));
		while(sc.hasNext())
		{System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		
		}
		sc.close();
		Nume num=new Nume();
		num.setSize(90);
		System.out.println("Suma este"+num.sum());
		@Ovveride
		System.out.println("Noua suma="+num.sum());
		
		
		}

	}


