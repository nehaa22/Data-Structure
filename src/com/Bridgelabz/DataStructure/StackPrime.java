package com.Bridgelabz.DataStructure;


import DataStructureUtility.Stack;
import Utility.Util;


public class StackPrime
{
   public static void main(String[] args) 
   {
	Stack<Integer> ss = new Stack<>();
	boolean t=false;
	int[] arran = new int[500];
	int cnt=0;
	int[] arr=Util.primeRange();	
	for (int i = 0; i < arr.length; i++) 
	{
		String s=Integer.toString(arr[i]);
		for (int j = i+1; j<arr.length; j++) 
		{
			if(arr[j]==arr[i]) 
			{
				continue;
			}
			String s1=Integer.toString(arr[j]);
			t=Util.isAnagram(s,s1);
			if(t==true) {
			arran[cnt]=arr[i];
			cnt++;
			//System.out.println("is anagram number--> "+arr1[i]);
			arran[cnt]=arr[j];
			cnt++;
			}
		}
		
		
	}
      for (int i = 0; i < arran.length; i++) {
		
		  ss.push(arran[i]);
	}
	int size=ss.size();
	for (int i = 0; i < size; i++) {
		{
		System.out.print(ss.pop()+ " ");
		}
}
	
}
}
