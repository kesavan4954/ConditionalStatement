package Com.ConditionalStatement;
import java.util.Scanner;

public class Example1
{
	public static void main(String[] args)
	{
		int age;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter age");
		age = Scanner.nextInt();
		
		System.out.println("Example5");
		
		if (age >= 18)
		{
			System.out.println("the person is major");
			
		}
		else
			
		{
			System.out.println("the person is minor");

		}
            Scanner.close();
           
	}

}
