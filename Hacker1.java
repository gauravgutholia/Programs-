import java.util.Scanner;
public class Hacker1
{
public static void main(String[] args)
{
  
  int a;
Scanner sc =new Scanner(System.in);
System.out.println("myString is :");
String b = sc.next();
System.out.println("myInt is :");
a =sc.nextInt();

sc.close();
System.out.println("myString is :"+b);
System.out.println("myInt is :"+a);
}
}