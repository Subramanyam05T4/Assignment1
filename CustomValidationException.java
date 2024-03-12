//creating a custom exception class in java which implments a method that takes an integer as an input and throws this custom exception if the number is negative
import java.util.*;
// class representing custom exception  
class InvalidNumberException  extends Exception  
{  
    public InvalidNumberException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
class CustomValidationException
{
void validate(int age) throws InvalidNumberException
{
if(age<0)
{
throw new InvalidNumberException("negative number");
}
else
{
System.out.println("positive number");
}
}
}
class Exception
{
public static void main(String args[])
{
try
{
System.out.print("Enter value of n:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
validate(n);
}
catch(InvalidNumberException e)
{
System.out.print(e.printStackTrace());
}
}
}

