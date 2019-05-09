package com.Bridgelabz.DataStructure;

import java.io.FileNotFoundException;
import java .io.File;
import java.io.IOException;
import java .io.FileWriter;
import java .io.PrintWriter;
import java .util.Scanner;

import DataStructureUtility.UnorderedList;

public class UnorderedListSearch 
{
	public static void main(String args[])
	{
		
		try {
		File f1 = new File("/home/userq/Bridgelab/dante.txt");
		UnorderedList<String> ul = new UnorderedList<>();
		Scanner sf = new Scanner(f1);
		Scanner s = new Scanner(System.in);
		
		while(sf.hasNext())
		{
			ul.add(sf.next()); //added file text in Linked list
		}
		
		System.out.println(ul);
		
		FileWriter fw = new FileWriter(f1);
		System.out.println("Enter the Word");
		String str=s.nextLine();
		System.out.println(ul.size());
		
		if(ul.search(str))
		{
			ul.remove(str);
			int n=0;
			while(n < ul.size())
			{
				fw.write(ul.pop(0));
				fw.flush();
			}
			System.out.println("Element Found and Removed");
			
		}
		else
		{
			ul.add(str);
			int n=0;
			while(n>0)
			{
				fw.write(ul.pop(0));
				fw.flush();
			}
			System.out.println("Added and Saved");
			
			fw.close();
			s.close();
			
		}	
	}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("file not found");
		} 
		catch (IOException e) 
		{
			System.out.println("io exception");
	    }
		
	}
	
	
}



