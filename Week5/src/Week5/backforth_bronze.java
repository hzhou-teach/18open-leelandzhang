
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class backforth_bronze 
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("backforth.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("backforth.out"));
		int[] barn1=new int[10];
		int[] barn2=new int[10];
		for(int i=0; i<10; i++)
		{
			barn1[i]=sc.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			barn2[i]=sc.nextInt();
		}
		sc.close();
		//--------------------------------------------------------
		ArrayList<Boolean> solutions=new ArrayList<Boolean>();//false is 1, true is 2+
		int count=1;
		int temp=barn1[0];
		for(int i=0; i<10; i++) 
		{
			if(barn1[i]!=temp||i==9)
			{
				if(count==1)
					solutions.add(false);
				else 
					solutions.add(true);
				temp=barn1[i];
				count=1;
			}
			else
				count++;
		}
		for(int i=0; i<10; i++) 
		{
			if(barn2[i]!=temp||i==9)
			{
				if(count==1)
					solutions.add(false);
				else 
					solutions.add(true);
				temp=barn2[i];
				count=1;
			}
			else
				count++;
		}
		int readings=0;
		for(int i=0; i<solutions.size();i++)
		{
			if(solutions.get(i))
				readings+=2;
			else
				readings++;
		}
		pr.println(readings);
		pr.close();
	}
}
