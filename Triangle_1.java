class Triangle_1
{
	public static void main(String a[])
	{
		Triangle_1 t = new Triangle_1
		t.angle(6);
	}
	 void angle(int n)
		{
			for(i=1; i<=n; i++)
			{
				for(j=0; j<=n; j++)
				{
				if(i+j == 2 || j-i == 2)
				{ 
				System.out.print("*");
				}
				else
				{
				System.out.print("");
				}
				}
			System.out.println();
				
				
				
			}
			
			
			
		}
}
		