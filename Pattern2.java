import java.util.*;
public class Pattern2
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1,k=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(k>10){
           System.out.print(k+" ");  
          }
          else
              System.out.print("0"+k+" ");        
          k++;     
        }
            System.out.println();  
      }
   }
}