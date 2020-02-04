import java.lang.*;
import java.util.*;
import java.io.*;
//Aici e un exemplu de creare Interface (one,two,three)
//Cum interface three mosteneste interface one,two=>MULTIPLE INHERITENCE
interface one
{public void geek();

}
interface two
{public void name();
}

interface three extends one,two
{public void geeks();
}

public class Inheri {
	public void geek()
	{System.out.println("Geek");
	
	}
	public void name()
	{System.out.println("to");
	
	}
	public void geeks()
	{System.out.println("geeks");
	}
	


public static void main(String[]args)
{
	Inheri c=new Inheri();//c=object reference variable ce face referire la obiectul Inheri(la clasa)
	c.geek();//prin c apelam metodele din Inheri class care au mostenire multipla si trebuia folosita interfata
	c.name();
	c.geeks();
}
}