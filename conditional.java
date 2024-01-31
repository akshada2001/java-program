import java.util.Scanner;
public class conditional {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
		ch=sc.next().charAt(0);
	/*	if((ch=='a')||(ch=='A'))
		{
			System.out.println("Vowel");
		}
		else if((ch=='e')||(ch=='E'))
		{
			System.out.println("Vowel");
		}
		else if((ch=='i')||(ch=='I'))
		{
			System.out.println("Vowel");
		}
		else if((ch=='o')||(ch=='O'))
		{
			System.out.println("Vowel");
		}
		else if((ch=='u')||(ch=='U'))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not a vowel");
		}*/
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("Vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("Vowel");
			break;
		case 'i':
		case 'I':
			System.out.println("Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println("Vowel");
			break;
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
	    default:
	    	System.out.println("Not a vowel");
		}



	}



	}


