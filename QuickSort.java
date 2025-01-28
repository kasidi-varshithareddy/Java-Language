import java.util.*;
public class QuickSort
{
public static int partition(int  res[],int low,int high)
{
int pivot=res[low];
int i=low;
int j=high;
while(i<j)
{
while(i<high && res[i]<=pivot)
{
i++;
}
while(res[j]>pivot)
{
j--;
}
if(i<j)
{
int temp=res[j];
res[i]=res[j];
res[j]=res[i];
}
}
int temp=res[low];
res[low]=res[j];
res[j]=res[i];
return j;
}
public static void quickSort(int[] res,int low,int high)
{
if(low<high)
{
int pidx=partition(res,low,high);
quickSort(res,low,pidx-1);
quickSort(res,pidx+1,high);
}
}
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
quickSort(a,0,n-1);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}


