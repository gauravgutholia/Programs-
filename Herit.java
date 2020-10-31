class Baseo
{
	int z= 0;
	int disp(int x, int y)
	{  
		int z = x+y;
                return z;
	}

}
class Herit extends Baseo
{
	void show(int b)
	{
		
         System.out.println(z*b);


	}


}
class Testo
{
	public static void main(String []args)
	{
		Herit ob = new Herit();
		int result = ob.disp(4,6);
                   ob.show(8);
		System .out.println(result);
		 
		
	}

}