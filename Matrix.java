import java.util.Scanner;
class Matrix
{
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		System.out.println("enter m");
		int m = in.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("enter the element ");
		for (int i=0; i<=n-1; i++)
		{
			for (int j=0; j<=m-1; j++)
			{
				arr[i][j]=in.nextInt();

			}
		}
		System.out.println("this is your output");
		for (int i=0; i<=n-1; i++)
		{
			for ( int j=0; j<=m-1; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}
}