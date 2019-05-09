package com.Bridgelabz.DataStructure;
import java.util.Scanner;
import DataStructureUtility.Cash;

public class CashCounter 
{
	 public static void main(String[] args) 
	 {
		Cash c= new Cash();
		int ch=0;
			do {
				System.out.println("1.deposit");
				System.out.println("2.withdrawl");
				System.out.println("3.Check Balance :");
				System.out.println("4.number of people in queue");
				System.out.println("5.Exit");
				System.out.println();
				System.out.println("Enter your choice");
				Scanner sc = new Scanner(System.in);
				 ch = sc.nextInt();
	 
				//int data=sc.nextInt();
				switch(ch)
				{
				
				case 1: System.out.println("How much anount to be Deposit :");
				        c.insert(sc.nextInt());
				        c.display();
				        break;
				       
				case 2:System.out.println("How much amount to be withdrawal:");
				       sc.nextInt();
				       	
				case 3:c.remove();
				       System.out.println("Avilable balance     :");
				       c.display();
				       break;
				       
				case 4:int n=c.getSize();
	       				System.out.println("Number of people in queue:"+n); 
	       				break;
				case 5:System.exit(0);
						
				default:System.out.println("you entered wrong choice");
				        break;
				           
				}
				
			}while(ch<5);
		}

	
}

