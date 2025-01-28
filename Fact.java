import java.util.*; 
public class Fact
 {
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    long fact;
    for(i=1,fact=1;i<=n;i++)
    {
     fact=fact*i;
      //System.out.println(fact);
     }
     System.out.println(fact);
   }
}
 
   