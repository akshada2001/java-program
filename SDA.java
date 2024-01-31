import java.util.Scanner;
public class SDA {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {30,43,45,54,46};
		      int score[]=new int[5];
		     for(int i=0;i<5;i++)
		      {
		    	  System.out.println(marks[i]);
		      }
		      System.out.println("Enhanced for");
		      for(int x:marks)
		      {
		    	  System.out.println(x);
		      }
		      Scanner sc=new Scanner(System.in);
		      for(int i=0;i<5;i++)
		      {
		    	  System.out.println("Enter position "+(i+1)+" value");
		    	  score[i]=sc.nextInt();
		      }
		      for(int i=0;i<5;i++)
		      {
		    	  System.out.println(score[i]);
		    }
}
}