import java.util.Scanner;
public class Dog {
private static int size;


public static int GetSize() {
	return size;
		}
public static void SetSize(int s)
{size=s;

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SetSize(sc.nextInt());
			   
		System.out.println("Dog size is"+" "+GetSize());
		
	}

}
