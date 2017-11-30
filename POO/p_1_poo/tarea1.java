public class tarea1 
{
	public static void pythagoreanTriples ()
	{
		for (int a=1;a<500;a++)
		{

			for (int b=1;b<500;b++)
			{	
				for (int c=1;c<500;c++)
				{	
					if(a*a + b*b==c*c)
					{
						System.out.println(a+" "+b+" "+c);
					}
				}
			}	
		}
	}

	 public static void main (String[] args)
	{
		pythagoreanTriples();

	}





}
