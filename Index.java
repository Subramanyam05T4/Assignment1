//Write a program to replace a character at a specific index in a string in java

import java.util.*;
class Index
{
public static void main(String args[])
{
System.out.println("Enter a String:\n");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Enter index:\n");
int index=sc.nextInt();
System.out.println("Original string="+s);
StringBuilder p=new StringBuilder(s);
p.setCharAt(index,'f');
System.out.println("modified string is:"+p);
}
}
