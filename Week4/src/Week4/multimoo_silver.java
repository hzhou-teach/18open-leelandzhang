package Week4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class multimoo_silver 
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("multimoo.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("multimoo.out"));
		int n=sc.nextInt();
		int[][] board=new int[n][n];//all the cow IDs on board
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				int x=sc.nextInt();
				board[i][j]=x;
			}
		}
		//Counting for single largest
		int count=0;//count for each 
		int max=0;
		int i=0;
		int j=0;
		int pos=0;
		int pos1=0;
		while(i<n-1||j<n-1)
		{
			pos1=j;
			while(0!=1)
			{
				if(j!=n-2&&board[i][j]==board[i][j+1])
				{
					pos=j+1;
					count++;
					j++;
				}
				break;
			}
			if(temp==board[i][j])
			{
				count++;
			}
			if(count>max)
			{
				max=count;
			}
			if(temp!=board[i][j]) 
			{
				count=0;
			}
			j++;
			if(j==n)
			{
				j=0;
				i++;
			}
		}
		//Counting for largest pair
	}
}
