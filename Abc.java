abstract  class  Abca
{
   abstract void display();
   void result()
   {
   	System.out.println("hey this is me");
   } 
}
 class Bca extends Abca
{  
	void display()
	{

		System.out.println("this is your abstract class");

	}

}
class Abc
{
	public static void main(String [] args)
	{
		Abca a = new Bca();
		a.display();
		a.result();

	}
}