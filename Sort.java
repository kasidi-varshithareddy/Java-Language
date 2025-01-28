import java.util.*;
public class Sort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] s1=new String[n];
for(int i=0;i<n;i++)
{
s1[i]=sc.next();
}
Arrays.sort(s1);
System.out.print(Arrays.toString(s1));
}
}