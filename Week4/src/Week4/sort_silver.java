//package Week4;
//Leeland Zhang
//Took me 45 mins
//got 7/10
//I knew where I went wrong even before I submitted it, just didn't
//really know how to fix it. 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class sort_silver 
{
	static int search(long arr[], int first, int last, long key){  
        if (last>=first)
        {  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key)
            {  
            	return mid;  
            }  
            if (arr[mid] > key)
            	return search(arr, first, mid-1, key); 
            else
            	return search(arr, mid+1, last, key); 
        }  
        return -1;  
    }  
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("sort.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("sort.out"));
		//Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
		long[] sorted=new long[n];
		for(int i=0; i<n; i++)
		{
			long j=sc.nextLong();
			arr[i]=j;
			sorted[i]=j;
		}
		sc.close();
		Arrays.sort(sorted);
		//------------------------------------------------------------
		int max=0;
		for(int i=0; i<n; i++)
		{
			int j=Math.abs(search(sorted,0,n-1,arr[i])-i);
			if(j>max)
				max=j;
		}
		pr.println(max+1);
		pr.close();
	}
}
