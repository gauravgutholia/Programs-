import java.util.Scanner;
class Swapprogram
{
	public static void main(String []args)
	{  
		System.out.println("input the number");
		Scanner s1 = new Scanner (System.in);
         int a = s1.nextInt();
         int b = s1.nextInt();
         System.out.println(a+"\n"+b);
         swap(a, b);
         System.out.println(a+"\n"+b);
         
	}
	public static void swap(int a ,int b)
	{
		int t = a;
         a=b;
         b=t;
         System.out.println(a+"\n"+b);
         
         
	}
}