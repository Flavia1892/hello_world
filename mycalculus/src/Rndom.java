import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;
import java.lang.annotation.*;

public class Rndom{
	private static int x;
	private static int a;
	
	public static void setRandom(int ra)
	{x=ra;
	}
	public static int getRandom() {
	return x;}
	
	public static void setChoice(int choi)
	{a=choi;
	}
	
	public static int getChoice()
	{return a;
	}
public static void main(String[]args) 
                             throws IOException{
	
	
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Alege un numar:");	
	setChoice(sc.nextInt());
	Random rand=new Random();
    setRandom(rand.nextInt(10)+1);
   
  
	
	try {
		if(getChoice()==getRandom())
			{System.out.println("Ai ghicit bine!");
			System.out.println("Numarul random e="+getRandom());
			
		
			}
		else {
		System.out.println("Mai incearca");
		System.out.println("Numarul random e="+getRandom());
				
		}
	}
	catch(NumberFormatException ex)
	{
System.out.println("Alege un numar de la 1 la 10");
	}
	
	}while(getChoice()!=getRandom());
	
	sc.close();
		
	}                      
		
}		
		
	
	
	


