import java.util.*;
public class stringExample{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=new String("VarshiTHA@11");
int count=0;
int count1=0;
int count2=0;
int count3=0;
int i=0;
while(i<s1.length())
{
char ch=s1.charAt(i);
if(ch>=65 && ch<=90)
{
count++;
}
else if(ch>=97 && ch<=122)
{
count1++;
}
else if(ch>='0' && ch<='9')
{
count2++;
}
else
{
count3++;
}
i++;
}
System.out.println("upper"+count);
System.out.println("lower"+count1);
System.out.println("numbers"+count2);
System.out.println("sysmbols"+count3);

}
}