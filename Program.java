/* This is a simple calculator with only basic operations.

Write equation in form: a <space> o <space> b.

where 'a' is first value 
      'o' is operator.(+,-,*,/,^)
      'b' is second value
    
*/ 

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    
        double a = in.nextDouble();
             
        int o = in.nextInt();

        double  b = in.nextDouble();
       

        System.out.print("Result: "+ a + " " + o + " " + b + " = "); 
      
      // This prints the result.
       
        if(o==1){System.out.print(a+b);}
      else  if(o==2){System.out.print(a-b);}
       else if(o==3){System.out.print(a*b);}
      else  if(o==4)
      {
        if(b==0)
      { 
      try
      { 
        
      double c=  a/b;
      System.out.println(c);
        System.out.println("after exception");


      }
      catch(Exception ca)
      {
        System.out.println("Division by 0");

      }}
      else 
      {
        
        System.out.println(a/b);
      }

      }
      
      /*This will print 'a' raised to the power 'b'.(use '^' to operate)*/
      
      else{
      System.out.println(" Error \n'" + o + "' is an illegal operator. Try +, -, *, /, ^.");
          }
         
    }
}