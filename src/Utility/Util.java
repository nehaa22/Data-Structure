package Utility;
import java.util.*;

public class Util 
{
	
	
	static int bubble(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return 0;
	}
	//*******************************************************//
	
	public static int[] primeRange()
	{
		int i,n,r,cnt=0,sum=0;
		int arr[] =new int[1000];
		for(n=2;n<1000;n++)
		{
		   for(i=2;i<1000;i++)
			  {
		         if(n%i == 0)
				   break;
			  }
		         if(n==i)
		         {
		        	 arr[cnt]=n;
		             cnt++;
		         }
		}
		return arr;
		
     }
	
	//*************************Anagram*********************//
	
	public static boolean isAnagram(String s, String s1) 
	{
		int l,l1;
		boolean x=false;
		l=s.length();
		l1=s1.length();
		char s2[]=new char[l+1];
		char s3[]=new char[l1+1];
		if(l!=l1) {
			return false;
		}
		else {
			s2=s.toCharArray();
			s3=s1.toCharArray();
			Arrays.sort(s2);
			Arrays.sort(s3);
			
			for (int i = 0; i < l; i++) {
				if(s2[i]==s3[i]) {
					x=true;
				}
				else {
					x=false;
					break;
				}
			}
			if (x==true) {
				return true;
			}
			else {
				return false;
			}
		}
}
}
	