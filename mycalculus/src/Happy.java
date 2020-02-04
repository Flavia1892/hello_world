import java.util.ArrayList;
public class Happy {
	public static void main(String[]args) {
		ArrayList<Dog>myList=new ArrayList<Dog>();
		Dog d=new Dog();
		Numar ex=new Numar();
		myList.add(d);
		myList.add(d);
		
		myList.remove(d);
		
		int size=myList.size();
		System.out.println(size);
		
		
	}

}
