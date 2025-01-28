import java.util.*;
public class Subsequence
{
public static void sub(ArrayList<Integer> a,int[] nums,int n,int idx)
{
if(idx==n)
{
System.out.println(a);
return;
}
a.add(nums[idx]);
sub(a,nums,n,idx+1);
a.remove(a.size()-1);
sub(a,nums,n,idx+1);
}
public static void main(String args[])
{
int[] nums={10,20,30};
ArrayList<Integer> a=new ArrayList<>();
int n=nums.length;
sub(a,nums,n,0);
}
}

