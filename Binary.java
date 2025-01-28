import java.util.*;
public class Binary{
public static int BinarySearchRec(int[] a,int key,int l,int h)
{
if(l<=h)
{
  int mid=(l+h)/2;
if(a[mid]==key)
  return mid;
else if(a[mid]>key)
   return BinarySearchRec(a,key,0,mid-1);
else
   return BinarySearchRec(a,key,mid+1,h);
}
return -1;
}
public static int BinarySearch(int[] a,int key)
{
int n=a.length;
int l=0;
int h=n-1;
while(l<=h)
{
 int mid=(l+h)/2;
if(a[mid]==key)
  return mid;
else if(a[mid]>key)
   h=mid-1;
else
 l=mid+1;
}
return -1;
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
System.out.println(BinarySearchRec(a,key,0,n-1));
}
}