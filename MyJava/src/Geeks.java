import java.io.*; 
import java.util.*;
import java.lang.*;
// This is a comment 
interface iOne{
	public int get();
	public int getB();
}
interface iTwo extends iOne{
	public void Print();
}
public class Geeks implements iTwo
{
	private static int a;
	private static int b;
	
	public static void Set(int s)
	{
	 a=s;
	}
	public int get()
	{return a;
	
	}
	public static void Setb(int ss)
	{b=ss;
	}
  public int getB()
  {return b;
   }
  
 public void Print()
 {System.out.println("Primul numar:"+get());
 System.out.println("Al doilea numar:"+getB());
 }
 
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 Set(sc.nextInt());
	 Random rnd=new Random();
	 Setb(rnd.nextInt(1000)+1);
	 
	 Geeks gk=new Geeks();
	 System.out.println(gk.getB());//Asa accesez metoda getB din interfata Ione (multiple inheritence)
	 gk.Print(); //Asa accesez metoda Print din Interfata iTwo
	 
	 
	 sc.close();
 }
  

}
