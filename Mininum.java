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
     int min_index=0;
     for(int i=1;i<n;i++)
     {
       if(a[min_index]>a[i])
       {
        a[min_index]=a[i];
        }
     }
    System.out.print(a[min_index]);
}
}
     
