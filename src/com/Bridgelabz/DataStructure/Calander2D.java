package com.Bridgelabz.DataStructure;
import java.util.Scanner;

public class Calander2D 
{
	static int cal[][] = new int[5][7];
	static int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	static void initial()
	{
		for(int i=0;i< cal.length;i++)
		{
			for(int j=0;j<cal[0].length;j++)
			{
				cal[i][j]= -10;
			}
		}
	}
	
	static void putcal(int d)
	{
		int d1=1;
		for(int i=d;i<cal[0].length;i++)
		{
			cal[0][i] = d1++;
		}
		for(int i=1;i<cal.length;i++)
		{
			for(int j=0;j<cal[0].length;j++)
			{
				cal[i][j]=d1++;
			}
		}
	}
	
	static void dispcal(int m)
	{
		System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < cal.length; i++) 
		{
			for (int j = 0; j < cal[i].length; j++) 
			{
				if (cal[i][j] < 0 || cal[i][j] > month[m - 1]) 
				{
					System.out.print("\t ");
				}
				else 
					if (cal[i][j] > 0)
					{
					System.out.print("\t" + cal[i][j] + " ");
				    }
			}
			System.out.println("\t");
       }
    }
	
	public static void display(int m,int y)
	{
		int d = dayOfWeek(m, y);
		initial();
		putcal(d);
        dispcal(m);
	}
	
	
	
	static int dayOfWeek(int m, int y) 
	{
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
    }
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The month:");
		int m = s.nextInt();
		System.out.println("Enter The Year :");
		int y = s.nextInt();
		display(m, y);
    }
}
