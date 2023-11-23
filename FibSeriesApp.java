package FibProject;

import java.util.Scanner;

public class FibSeriesApp 
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enetr the integer");
	int n = scan.nextInt();
	FibSeries.PrintingFibonaciSeries(n);
	}
}
