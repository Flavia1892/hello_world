import java.util.Scanner;

public class Battleship {
 static Scanner sc=new Scanner(System.in);
 static int a;
 static int times=7;
	public static void main(String[] args) {
		Setdot begin=new Setdot();
		begin.Set();
		Check chk=new Check(begin);
		
		while(times>0)
		{System.out.print("Alege un nr");
		a=sc.nextInt();
		chk.check(a);
		times--;
		if(chk.nr==2)
		{System.out.println("You win!");
		break;
		}
		}
	
				
	if(times==0 && chk.nr<2)
		System.out.println("You lose!");
		
	
	}

}
