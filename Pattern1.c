class Pattern1
{
   public static void main(String[] args)
   {
      Scanner sc=new Sanner(System.in);        
        int n=sc.nextInt();
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i<j)
			{
				printf("%d ",i);
			}
			else if(i>j)
			{
				printf("%d ",j);
			}
			else
			{
				printf("%d ",i);
			}
		}
	}
   }
}