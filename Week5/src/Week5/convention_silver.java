package Week5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class convention_silver 
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("convention.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("convention.out"));
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		long[] times=new long[n];
		for(int i=0; i<n; i++)
		{
			times[i]=sc.nextLong();
		}
		double x=Math.ceil(((double)n)/c);
		double extra=m*c-n;//extra spaces in buses
		Arrays.sort(times);
		//ArrayList<Long> difference=new ArrayList<Long>();
		int last=0;
		while(last<n-3)
		{
			
		}
	}
}
