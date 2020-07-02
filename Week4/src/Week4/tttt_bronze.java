//Leeland Zhang
//Took me 45 mins
//got 10/10
//I felt that this problem was super, super easy, just a lot of coding,
//Maybe there was a more efficient way than just accounting for every single
//case but im happy I at least got one correct lol
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class tttt_bronze 
{
	private static int onet=0;
	private static int twot=0;
	private static String[] one= {"","",""};
	private static String[][] two= {{"",""},{"",""},{"",""},{"",""}};
	private static int count1=0;//count for one
	private static int count2=0;//count for two
	static void add(String i, String j, String k)
	{
		boolean temp=true;
		if(i.equals(j)&&j.equals(k))
		{
			for(int a=0; a<3; a++)
			{
				if(one[a].equals(i))
					temp=false;
			}
			if(temp)
			{
				onet++;
				one[count1]=i;
				count1++;
			}
		}
		else if(i.equals(j))
		{
			for(int a=0; a<3; a++)
			{
				if((two[a][0].equals(i)||two[a][1].equals(i))&&(two[a][0].equals(k)||two[a][1].equals(k)))
					temp=false;
			}
			if(temp)
			{
				twot++;
				two[count2][0]=i;
				two[count2][1]=k;
				count2++;
			}
		}
		else if(j.equals(k))
		{
			for(int a=0; a<3; a++)
			{
				if((two[a][0].equals(i)||two[a][1].equals(i))&&(two[a][0].equals(k)||two[a][1].equals(k)))
					temp=false;
			}
			if(temp)
			{
				twot++;
				two[count2][0]=i;
				two[count2][1]=k;
				count2++;
			}
		}
		else if(i.equals(k))
		{
			for(int a=0; a<3; a++)
			{
				if((two[a][0].equals(i)||two[a][1].equals(i))&&(two[a][0].equals(j)||two[a][1].equals(j)))
					temp=false;
			}
			if(temp)
			{
				twot++;
				two[count2][0]=i;
				two[count2][1]=j;
				count2++;
			}
		}
	}
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(new File("tttt.in"));
		PrintWriter pr=new PrintWriter(new FileWriter("tttt.out"));
		//Scanner sc = new Scanner(System.in);
		String[][] ttt=new String[3][3];
		for(int i=0; i<3; i++)
		{
			String temp=sc.next();
			ttt[i][0]=temp.substring(0,1);
			ttt[i][1]=temp.substring(1,2);
			ttt[i][2]=temp.substring(2);
		}
		sc.close();
		for(int i=0; i<3;i++)
		{
			add(ttt[i][1], ttt[i][2],ttt[i][0]);
			add(ttt[0][i],ttt[1][i],ttt[2][i]);
		}
		add(ttt[0][0],ttt[1][1],ttt[2][2]);
		add(ttt[2][0],ttt[1][1],ttt[0][2]);
		pr.println(onet);
		pr.println(twot);
		pr.close();
	}
}
