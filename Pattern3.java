import java.util.*;
public class Pattern3
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int k=n-1;k>=i;k++)
        {
         System.out.print(" ");
         }
        for(int j=n-i+1;j>=1;j++)
        {
          System.out.print("* ");
         }

                      System.out.println();  
      }
   }
}