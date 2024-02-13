import java.util.Scanner;

public class ArithEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=0,b=1,c=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=a/b;
	System.out.println(c);
}
	catch(ArithmeticException  e) {
     System.out.println("enter valid num only");
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}
}
	
	


