import java.util.*;
public class Linear{
public static int LinearSearch(int[] a,int key)
{
int n=a.length;
for(int i=0;i<n;i++)
{
if(a[i]==key)
{
return i;
}
}
return -1;
}
public static int LinearSearchRec(int[] a,int k,int idx)
{
if(idx==a.length)
   return -1;
if(a[idx]==k)
  return idx;
else
  return LinearSearchRec(a,k,idx+1);
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
int k=sc.nextInt();
System.out.println(LinearSearchRec(a,k,0));
}
}