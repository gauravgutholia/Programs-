import java.util.*;
public class Hacker9
{
public static void main (String args[])
{
System.out.println(" cost");
Scanner in= new Scanner (System.in);
double meal =in.nextDouble();
int tip =in.nextInt();
int tax =in.nextInt();
    double tip=meal*20/100;
 double tax=meal*8/100;
 
double totalcost=meal+tip+tax;
int result = Math.round(totalcost);

System.out.println(+result);
}
}

