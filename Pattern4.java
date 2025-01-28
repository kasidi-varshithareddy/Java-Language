import java.util.*;
public class Pattern4
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>=1;i--)
      {
        for(int j=1;j<i;j++)
        {
           
          System.out.print("*");
         }
        int k=n-i+1;
        for(int j=(k)*(k-1)/2+1;j<=(k)*(k+1)/2;j++)
        {
          System.out.print(j+" ");
               }
        for(int j=(i)*(i-1)/2+1;j<=(i)*(i+1)/2;j++)
        {
          System.out.print(j+10+" ");
               }

      System.out.println();
    }
 }
}