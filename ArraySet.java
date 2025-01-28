import java.util.*;
import java.util.stream.Collectors;
public class ArraySet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Set<Integer> s1= Arrays.stream(a).boxed().collect(Collectors.toSet());
System.out.println(s1);
}
}
