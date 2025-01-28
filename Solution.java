class Solution {
    public int maxSubArray(int[] a) {
        int max=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++)
        { 
            int sum=0;
        
            for(int j=i;j<n;j++)
            {
               sum=sum+a[j];
               if(max<sum)
               {
                    max=sum;
                }
            }
        }
       return max;

    }
}    
