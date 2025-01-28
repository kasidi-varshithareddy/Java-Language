import java.util.*;
public class SlideWindow
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int l=0;l<n;l++)
{
int i=0;
int j=l;
while(j<n)
{
for(int k=i;k<=j;k++)
{
System.out.print(a[k]+" ");
}
System.out.println();
i++;
j++;
}
}
}
}