class prime
{
	public static void main(String [] args)
	{
		int num = 44;
		int n = num/2;
		int flag=0;
		if(num==0||num==1)
		{
			System.out.println("is not prime number");
		}
		else
		{
			for(int i = 2;i<=n;i++)
			{
				if(num%i==0)
				{
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("prime number"+num);
		}
		else
		{
			System.out.println("not prime number" +num);
		}
		
	}
}