//package Week4;
//Leeland Zhang
//Took me 15 mins
//Got 10/10
//This problem felt easier than any of the bronze problems, 2 difficulty
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lemonade_silver 
{
	static void sort(long[] cows) 
	{
		Arrays.sort(cows);
		for(int i = 0; i < cows.length-1-i; i++) 
		{
			cows[i] ^= cows[cows.length-1-i];
			cows[cows.length-1-i] ^= cows[i];
			cows[i] ^= cows[cows.length-1-i];
		}
	}
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("lemonade.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("lemonade.out"));
		//Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] cows=new long[n];
		for(int i=0; i<n; i++)
		{
			cows[i]=sc.nextLong();
		}
		sc.close();
		//---------------------------------------------------------
		sort(cows);
		boolean x=true;
		for(int i=0; i<n; i++)
		{
			if(cows[i]<i)
			{
				pr.println(i);
				x=false;
				break;
			}
		}
		if(x)
		{
			pr.println(n);
		}
		pr.close();
	}
}
