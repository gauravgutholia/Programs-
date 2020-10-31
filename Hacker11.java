import java.util.*;
class Hacker11
{
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);
		double a =in.nextDouble();

		System.out.println(a+"can be fitted in : ");
		if (a >= -128 && a <= 127)
		{
			System.out.println("byte");
		}
		else if (a >= -32768 && a<=32768  )
		{
			System.out.println("short");
		}
		else if (a >= -2147483648 && a<=2147483648) 
		{
			System.out.println("int");

		}
		else if ( a >= 9223372036854775808 && a <= 9223372036854775808)
		{
			System.out.println("long");
		}
		else 
		{
			System.out.println(a+ "can't be fitted anywhere");
		}
	}
}