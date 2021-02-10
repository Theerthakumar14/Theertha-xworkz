class RightReverseCorner
{
	public static void main(String a[])
	{
	for(int i =1; i <= 8; i++)
		{
		for(int j =1; j <= 8; j++)
		{
			if(i==1 || j==1 || i+j==9)
			{	
				System.out.print("*");
			}
		
			else
			{
				System.out.print(" ");
			}
				
		
		}
		System.out.println();
		}
	}
}
