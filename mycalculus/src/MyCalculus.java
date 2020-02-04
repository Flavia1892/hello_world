import java.util.Scanner;



	
public class MyCalculus {
	public static void main(String[]args) {
		String quest;
		Scanner sc=new Scanner(System.in);
	do {
	   
		System.out.println("HELLO");
		System.out.print("Type in your operation:");
	
		Numar nr = new Numar();
		nr.nr1=sc.nextInt();
		nr.op=sc.next().charAt(0);
		nr.nr2=sc.nextInt();
		
		Operatie c=new Operatie();
		float z=c.calculate(nr);
			
		System.out.println("Rezultatul="+z);
		System.out.println("Doriti sa reluati?Da/Nu");
		quest=sc.next();
		System.out.println("Goodbye cruel world");
	}while(quest.contains("Da"));
	
		
		}
		
		
	}


