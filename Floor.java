import java.util.*;
public class Floor{
public static int FloorMethod(int a[],int key)
{
int i=0;
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
return a[i];
}
else if(a[i]>key)
{
  if(i==0)
    return -1;
  else
     return a[i-1];
}
}
return a[i-1];
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int key=sc.nextInt();
System.out.println(FloorMethod(a,key));
}
}