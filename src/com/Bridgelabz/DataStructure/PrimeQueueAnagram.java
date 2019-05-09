package com.Bridgelabz.DataStructure;
import java.util.Iterator;

import DataStructureUtility.Queue;
import Utility.Util;
import java.util.*;


public class PrimeQueueAnagram
{
   public static void main(String[] args) 
   {
	Queue<Integer> q = new Queue<>();
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
		
		
	};	//collecting anagrams
	for (int i = 0; i < arran.length; i++) {	//loop to add elements to queue
		q.enqueue(arran[i]);		// adding elements to queue
	}
	
	System.out.println(q);

	
	
	
}
}