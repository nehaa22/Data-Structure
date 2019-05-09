package com.Bridgelabz.DataStructure;

import DataStructureUtility.Stack;
import java.io.*;

public class BalanceParanthesis 
{
	static boolean check(String s)
	{
		Stack<Character> stk = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c == '(')
				stk.push(s.charAt(i));
			else
				stk.pop();
		}
		return stk.isEmpty();
		
	}
	
	
	public static void main(String args[])
	{
		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String s1 =(check(s))?"Balanced":"Not Balanced";
		System.out.println(s1);
		
	}
	

}
