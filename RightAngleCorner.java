class RightAngleCorner
{
	public static void main(String a[])
	{
	for(int i =1; i <= 5; i++)
		{
		for(int j =1; j <= 5; j++)
		{
			if(i==5 || j==1 || i==j)
			{	
				System.out.print("*");
			}
		
			else
			{
				System.out.print(" ");
			}
				
		System.out.print(" ");
		}
		System.out.println();
		}
	}
}
