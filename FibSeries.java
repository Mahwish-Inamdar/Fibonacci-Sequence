package FibProject;

public class FibSeries 
{
	public static void PrintingFibonaciSeries(int n)
	{
		int Fib1 = 0;
		int Fib2 = 1;
		int Fib3;
		
		if(n==1)
		{
			System.out.print(Fib1);
		}
		else if(n==2)
		{
			System.out.print(Fib1 + "  " + Fib2);
		}
		else
		{
			System.out.print(Fib1 + " " + Fib2);
			for(int i=3; i<=n; i++)
			{
				Fib3=Fib1+Fib2;
				System.out.print(Fib3+ " ");
				Fib1 = Fib2;
				Fib2 = Fib3;	
			}
		}
	}
}
