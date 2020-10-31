abstract  class Abc
{
   abstract void display();
   
}
 class Bca extends Abc
{  
	void display()
	{

		System.out.println("this is your abstract class");

	}

}
class Abstract
{
	public static void main(String args[])
	{
		Abc a = new Bca();
		a.display();
		

	}
}