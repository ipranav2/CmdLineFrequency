class CommandLineFrequency
{
	public static void main(String S[])
	{
		int c=0,frequency=1;
		for(int i=0;i<S.length;i++)
		{
			int x=Integer.parseInt(S[i]);
			if(i==0)
			c=x;
			else
			{
				if(x==c)
				frequency++;
			}
		}
	System.out.println("frequency of first character is = "+frequency);
	}
}
