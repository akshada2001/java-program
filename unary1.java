import java.util.Scanner;
public class unary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if((age >=5)&&(age<=16))
		{
			System.out.println("School Adimission allowed");
		}
		else if((age>16)&&(age<=21))
		{
			System.out.println("Collage Admission  allowed");
		}
		else
		{
			System.out.println("Admission not allowed");

	}
	}
}
