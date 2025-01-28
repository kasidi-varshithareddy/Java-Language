import java.util.*;
public class Spilt
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String[] s2=s1.split(" ");
String s3="";
for(int i=s2.length-1;i>=0;i--)
{
s3+=s2[i]+" ";
}
System.out.print(s3+" ");
}
}
