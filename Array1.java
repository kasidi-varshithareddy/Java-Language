import java.util.*;
public class Array1
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
     for(int i=0;i<n;i++)
     {
       boolean flag=false;
       for(int j=i+1;j<n;j++)
       {
         if(a[j]>a[i]){
            flag=true;
            break;
          } 
       }
       if(flag==false)
       System.out.println(a[i]+"is a leader");
         

     }
      //System.out.print(a[i]+"is a leader");

   }
}
