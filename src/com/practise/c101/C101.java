package com.practise.c101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class C101 {

	
	public static void main(String[] args) {
		/*Triangle tri= new Triangle();
		tri.draw(6);
		 */

		int op=0;
		while(op!=5) {
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Please input a number to select operation");
			System.out.println("1: Add");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiple");
			System.out.println("4: Divide");
			System.out.println("5: Exit");
			try {
				op=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int count=0;
			Double[] num= new Double[2];
	
			Operation operation= new Operation();
			switch  (op){
				case 1: 
					System.out.println("Please input two numbers to calculate");
					while(count<2) {
						InputStreamReader isr1= new InputStreamReader(System.in);
						BufferedReader br1=new BufferedReader(isr1);
						try {
							num[count]=Double.parseDouble(br1.readLine());
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count++;
					}
					operation.add(num[0],num[1]);
					operation.display();
					op=0;
					break;
				case 2:
					System.out.println("Please input two numbers to calculate");
					while(count<2) {
						InputStreamReader isr1= new InputStreamReader(System.in);
						BufferedReader br1=new BufferedReader(isr1);
						try {
							num[count]=Double.parseDouble(br1.readLine());
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count++;
					}
					operation.subtraction(num[0],num[1]);
					operation.display();
					op=0;
					break;
				case 3:
					System.out.println("Please input two numbers to calculate");
					while(count<2) {
						InputStreamReader isr1= new InputStreamReader(System.in);
						BufferedReader br1=new BufferedReader(isr1);
						try {
							num[count]=Double.parseDouble(br1.readLine());
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count++;
					}
					operation.multiple(num[0],num[1]);
					operation.display();
					op=0;
					break;
				case 4:
					System.out.println("Please input two numbers to calculate");
					while(count<2) {
						InputStreamReader isr1= new InputStreamReader(System.in);
						BufferedReader br1=new BufferedReader(isr1);
						try {
							num[count]=Double.parseDouble(br1.readLine());
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count++;
					}
					operation.divide(num[0],num[1]);
					operation.display();
					op=0;
					break;
				default:
					System.out.println("Bye");
					break;
			}
		}

		Triangle triangle=new Triangle();
		triangle.draw(6);
	}
}
