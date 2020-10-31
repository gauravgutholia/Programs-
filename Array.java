import java.util.Scanner;
class Array
{
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("input");
		int n =in.nextInt();
		int arr[]=new int [n];
		System.out.println("input the element");

		for (int i=0; i<n; i++)
		{
			 arr[i]= in.nextInt();
		}
		for (int i=0; i<=n-2; i++)
		{
			for(int j=0; j<=n-2-i; j++)
			{
				if (arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= t;
				}
			}
			
		}

		System.out.println("this is your sorted data");
		for (int i=0; i<=n-1; i++)
		{
			System.out.println(arr[i]);
		}
	}
}