import java.util.*;
public class Minimum
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
     for(int i=0;i<n-1;i++)
     {
      int max_index=i;
     int min_index=i;
     for(int j=i+1;j<n;j++)
     {
       if(a[max_index]<a[j])
       {
         max_index=j;
        }
       if(a[min_index]>a[j])
       {
        min_index=j;
        }
     }
     if(i%2!=0)
       {
        int temp=a[min_index];
       a[min_index]=a[i];
       a[i]=temp;
  

              }
     else{
          int temp=a[max_index];
       a[max_index]=a[i];
       a[i]=temp;

            }
    }
    for(int i=0;i<n;i++)
   {
     System.out.print(a[i]+" ");  
    }
}
}
     
