package com.Bridgelabz.DataStructure;
import java.util.Scanner;

import DataStructureUtility.Dequeue;

public class DequeuePallindrome 
{
	static boolean isPalin(Dequeue<Character> d)
	{
		if(d.size() % 2 == 0)
		{
			while(d.size() != 0)
			{
				int c1 = d.removeFront();
				int c2 = d.removeRear();
				if(c1 != c2)
				{
					return false;
				}
			}
		}
		
		while(d.size() == 1)
		{
			int c1 = d.removeFront();
			int c2 = d.removeRear();
			if(c1 != c2)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		Dequeue<Character> d = new Dequeue<>();
		int i=0;
		while(i<s1.length())
		{
			d.addRear(s1.charAt(i++));
		}
		System.out.println(d.size());
		System.out.println((isPalin(d)? "Pallindrome ":"Not Pallindrome"));
	}
}
