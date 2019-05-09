package com.Bridgelabz.DataStructure;
import java.util.Scanner;

import DataStructureUtility.OrderedLIst11;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class HashingFunction {
	OrderedLIst11<Integer> list[] = new OrderedLIst11[11];

	public HashingFunction() 
	{
		for (int i = 0; i < list.length; i++) {
			list[i] = new OrderedLIst11<>();
		}
	}

	void put(int n) {
		list[n % 11].add(n);
	}

	boolean search(int n) {
		return list[n % 11].search(n);
	}

	public static void main(String[] args) {
		HashingFunction hf = new HashingFunction();
		OrderedLIst11<Integer> list = new OrderedLIst11<>();
		System.out.println(" no of elements to add");
		Scanner s = new Scanner(System.in);
        System.out.println("Enter Count :");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(s.nextInt());
		}
		
		System.out.println(list);

		
	}
}

   

