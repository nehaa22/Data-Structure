package com.Bridgelabz.DataStructure;
import Utility.Util;

public class prime2D 
{
	  public static void main(String[] args) 
	  {
      int[] arr1=Util.primeRange();
			
			int[][] arr2=new int[10][200];
			
			System.out.println("the prime in 2D array ");

			for (int i = 0; i < 10; i++) 
			{
				for (int j = 0; j < 200; j++) 
				{
					if (arr1[j] > ((i) * 100) && arr1[j] < ((i + 1) * 100)) 
					
					{
						arr2[i][j]=arr1[j];
					System.out.print(arr2[i][j]+" ");
						
					}
					
					}
				System.out.println();
				
			}
     }

}
