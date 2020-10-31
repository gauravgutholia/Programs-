import java.util.*;
class Swap
{
	public static void main(String []arg)
	{
		Scanner in = new Scanner (System.in);
         int a = in.nextInt();
         int b = in.nextInt();
         System.out.println(+a+b);
         int t =in.nextInt();
          t = a;
          a = b;
          b = t;
          System.out.println(+a+b);

	}
}