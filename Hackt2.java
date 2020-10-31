import java.io.*;
class Hackt2
{
	public static void main(String []args) throws IOException
	{
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter Rollno");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter class");
		int b = Integer.parseInt(br.readLine());
		System.out.println("enter your name");
		String c = br.readLine();
		System.out.println(a+"\n " +b+"\n"+ c);



	}


}