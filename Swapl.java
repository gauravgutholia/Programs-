class A extends Thread
{
	public void run()
	{
		try
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("From thread A: i= "+i);	
          Thread.sleep(1000);
		}
	}
	catch (InterruptedException e)
	{
		System.out.println("Exit from Thread A");
	}
	}
	}

	
class B extends Thread
{
	public void run()
	{
		try
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("From thread B: j=" +i);
			Thread.sleep(1000);
		}
	}
	  catch(InterruptedException e)
	  {
		System.out.println("Exit from Thread B");
	}
}
}
class C extends Thread
{
	public void run()
	{  
		try
	{	
		for(int i=0; i<=5; i++)
		{
			System.out.println("From thread C: k= " +i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Exit from Thread C");
	}
	}
}
class Threadtest
{
	public static void main(String []args)
	{
		A ob1 = new A();
		ob1.start();
		B ob2 =new B();
		ob2.start();
		C ob3 =new C();
		ob3.start();

	}
}