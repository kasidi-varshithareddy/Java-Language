import java.util.*;
public class Repeat1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int[] freq=new int[10];
for(int i:a)
{
freq[i]++;
}
int max=0;
do
{
int maxindex=0;
for(int i=0;i<freq.length;i++)
{
if(freq[maxindex]<=freq[i])
{
maxindex=i;
}
}
max=freq[maxindex];
if(max>0)
{
System.out.print(maxindex+""+freq[maxindex]);
freq[maxindex]=0;
}
}while(max!=0);
}
}