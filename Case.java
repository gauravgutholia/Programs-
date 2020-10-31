import java.util.*;
class Case
{
	public  static void main (String []args)
	{
		Scanner reader =new Scanner(System.in);
		System.out.println("enter two number");
		float a = reader.nextFloat();
		float b = reader.nextFloat();
		System.out.println("enter your choice");
		char ch = reader.next().charAt(0);
		float c;
		switch(ch)
		{
			case '+':
			c=a+b;
			System.out.println(c);
			break;
			case '-':
			c=a-b;
			System.out.println(c);
			break;
			case '*':
			c=a*b;
			System.out.println(c);
			case'/':
			c=a/b;
			System.out.println(c);
			break;
			default:
			System.out.println("wrong key");



		}
	}
}