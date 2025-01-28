import java.util.*;
public class Dec
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int j=0;j<=n/2;j++)
{
System.out.print(a[j]+" ");
}
for(int i=n-1;i>=n/2;i--)
{
System.out.print(a[i]+" ");
}
}
}
