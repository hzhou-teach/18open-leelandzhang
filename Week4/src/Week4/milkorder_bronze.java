package Week4;
//Leeland Zhang
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class milkorder_bronze 
{
	public static void main(String args[]) throws IOException
	{
		//Scanner sc = new Scanner(new File("milkorder.in"));
		//PrintWriter pr=new PrintWriter(new FileWriter("milkorder.out"));
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int[] arrm=new int[m];
		int[][] arrk=new int[k][2];//0 is what cow, 1 is at what position
		int[] arrn=new int[n];//Array for all fill positions
		int pos=-1;
		for(int i=0; i<m; i++)
		{
			arrm[i]=sc.nextInt();
			if(arrm[i]==1)
				pos=i;
		}
		for(int i=0; i<k; i++)
		{
			arrk[i][0]=sc.nextInt();
			arrk[i][1]=sc.nextInt();
			arrn[arrk[i][1]-1]=arrk[i][0];//Filling up arrn with wuts required
			for(int j=0; j<m; j++)
			{
				if(arrm[j]==arrk[i][0])
				{
					int count=1;
					for(int z=j-1;z>=0; z--)//special
					{
						while(arrn[arrk[i][1]-count-1]!=0)
						{
							count++;
						}
						arrn[arrk[i][1]-count-1]=arrm[z];
						count++;
					}
					break;
				}
			}
		}
		int count=0;
		sc.close();
		for(int i=0; i<n; i++)
		{
			System.out.print(arrn[i]+" ");
		}
		if(pos>-1)
		{
			for(int i=0; i<n; i++)
			{
				if(arrn[i]==arrm[0])
				{
					for(int j=0; j<k; j++)
					{
						if(arrk[j][1]<i+pos+1&&arrk[j][1]>i+1)
							count++;
					}
					//pr.println(i+1);
					System.out.println(i+1+pos+count);
					break;
				}
			}
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				if(arrn[i]==0)
				{
					//pr.println(i+1);
					System.out.println(i+1);
					break;
				}
			}
		}
		//pr.close();
	}
}
