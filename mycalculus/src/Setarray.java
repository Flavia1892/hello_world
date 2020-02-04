
public class Setarray 
{static Student[]arr=new Student[3];

public static void main(String[]args) {
	//void setArray()
	//{
		arr[1]=new Student(234,"Flavia");
		arr[3]=new Student(1,"Maximilian");
		arr[2]=new Student(4476,"Maximilian Augustus");
				
		
		for(int j=0;j<arr.length;j++)
		{System.out.print("Numarul este "+arr[j].roll_no+" iar numele este "+arr[j].name);
		System.out.println();
		
		//}
		
	}	

}
}