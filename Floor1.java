import java.util.*;
public class Floor1{
public static int Floor1(int[] a,int key)
{
int n=a.length;
int l=0;
int h=n-1;
while(l<=h)
{
 int mid=(l+h)/2;
if(a[mid]==key)
  return a[mid];
else if(a[mid]>key)
   h=mid-1;
else
 l=mid+1;
}
if(l<n)
{
return a[l];
}
else{
return -1;
}
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
System.out.println(Floor1(a,key));
}
}