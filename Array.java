import java.util.*;
public class Array
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
     int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++)
     { 
        int sum=0;
        //int max=Integer.MIN_VALUE;
        for(int j=i;j<n;j++)
        {
           sum=sum+a[j];
           if(max<sum)
           {
             max=sum;
            }
          /* for(int k=i;k<=j;k++)
           {
              System.out.print(a[k]+" ");
              sum=sum+a[k];
            }*/
          
          //System.out.print("="+max);
          //System.out.println();
          
        }
      }
      System.out.print("="+max);

    }
}
