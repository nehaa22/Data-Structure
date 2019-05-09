package com.Bridgelabz.DataStructure;

import Utility.Util;

public class Anagram2D 
{
	public static void main(String[] args) {
		boolean b=true,t=true;
		int position=0,a1=0,a2=0;
		int arr1[]=new int[1000];
		int arr2[]=new int[1000];
		int arr[]=new int[1000];
			for (int i = 3; i < 1000; i++) {
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						b=true;
						break;
					}
					else {
						b=false;
					}
				}
				if(b==false) {
						arr1[a1]=i;
						a1++;
						
					
				}
			}
				
				for (int i = 0; i < a1; i++) {
					String s=Integer.toString(arr1[i]);
					for (int j = i+1; j < a1; j++) {
						if(j==i) {
							continue;
						}
						String s1=Integer.toString(arr1[j]);
						t=Util.isAnagram(s,s1);
						if(t==true) {
						arr2[a2]=arr1[i];
						a2++;
						//System.out.println("is anagram number--> "+arr1[i]);
						arr2[a2]=arr1[j];
						a2++;
						}
					}
					
					
				}
				int cnt = 0,cnt1 = 0;t=true;
				int arr3[][] = new int[2][1000];
				
				for (int j = 0; j < arr1.length; j++) {
					for (int i = 0; i < arr2.length; i++) {
						if(arr1[j] == arr2[i]) {
							t = false;
							break;
						}
						else {
							t=true;
						}
					}
					
					if(t == true) {
						
						arr3[1][cnt1++] = arr1[j];
					}
					else {
						arr3[0][cnt++] = arr1[j];
					}
				}
				System.out.println();
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < arr3[0].length; j++) {
						System.out.print(" "+arr3[i][j]);
					}
					System.out.println();
				}
				System.out.println("\nanagrams");
				for (int i = 0; i < a2; i++) {
					System.out.print(" "+arr2[i]);
				}
				System.out.println("\nprime\n");
				for (int i = 0; i < a2; i++) {
					System.out.print(" "+arr1[i]);
				}
				/*System.out.println("\nprime");
				for (int i = 0; i < position; i++) {
					System.out.print(" "+arr1[i]);
				}*/
		}

		
	}

   




