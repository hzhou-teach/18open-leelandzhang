//I gave up
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class family_bronze {
	public static void main(String args[]) throws IOException
	{
		//Scanner sc = new Scanner(new File("family.in"));
		//PrintWriter pr=new PrintWriter(new FileWriter("family.out"));
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String x=sc.next();
		String y=sc.next();
		int xpos=0;
		boolean x0=true;//if at position 0
		int ypos=0;
		boolean y0=true;//if at position 0
		String[][] relations=new String[n][2];//0 is mother, 1 is daughter
		for(int i=0; i<n; i++)
		{
			relations[i][0]=sc.next();
			relations[i][1]=sc.next();
			if(relations[i][0].equals(x))
			{
				xpos=i;
			}
			if(relations[i][1].equals(x))
			{
				xpos=i;
				x0=false;
			}
			if(relations[i][0].equals(y))
			{
				ypos=i;
			}
			if(relations[i][1].equals(y))
			{
				ypos=i;
				y0=false;
			}
		}
		//----------------------------------------------------------
		if(x0)
		{
			int count=0;
			boolean z=true;
			String temp=relations[xpos][0];
			if(relations[xpos][1]==y)
			{
				count++;
				z=false;
			}
			while(z)
			for(int i=0; i<n; i++)
			{
				if(relations[i][0].equals(relations[xpos][1]))
				{
					count++;
					xpos=i;
					if(relations[xpos][1]==y)
					{
						z=false;
						break;
					}
				}
				if(relations[i][1].equals(relations[xpos][1]))
				{
					if(relations[i][0].equals(y))
					{
						x0=false;
						z=false;
						break;
					}
				}
				if(i==n-1)
					z=false;
			}
			if(count==0)
				System.out.println()
		}
		else
		{
			
		}
	}
}
