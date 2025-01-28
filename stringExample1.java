import java.util.*;
public class stringExample1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=new String("aeioUbcs@");
String vowel="aeiouAEIOU";
int count=0;
int count1=0;
int i=0;
while(i<s1.length())
{
char ch=s1.charAt(i);
if(vowel.indexOf(ch)!=-1)
{
System.out.print(ch);
}
else
{
if(ch>='a'&&ch<='z')
{
ch=(char)(ch-32);
System.out.print(ch);
}
}
i++;
}
}
}