//Implementing exception handling to handle Arithmeic Exception if the denominator is zero and displaying an inappropriate error message
import java.util.*;
class Arithmetic
{
static void divideNumbers(int a,int b)
{
try
{
int x=a/b;

System.out.println("divison is possibe and its value is:"+x);
}
catch(ArithmeticException e)
{
System.out.println("divison by zero is not possible");
}
}

public static void main(String args[])
{
System.out.println("Enter values of a and b:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
divideNumbers(a,b);
}
}
