//write a java program to count the number of vowels and consonants in a given string
import java.util.*;
class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String p=sc.nextLine();
int v=0,c=0;
for(int i=0;i<p.length();i++)
{
char ch=p.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
++v;
}
else
{
++c;
}
}
System.out.println("Number of vowels is:"+v);
System.out.println("Number of consonants is:"+c);

}
}
