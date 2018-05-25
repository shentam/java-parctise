package com.pracise.option;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		while(op!=3) {
			System.out.println("Please select the operation:");
			System.out.println("1: Arithmetic");
			System.out.println("2: Area square");
			System.out.println("3: Exit");
			InputStreamReader isr =new InputStreamReader(System.in);
			BufferedReader bf =new BufferedReader(isr);
			Operation operation =new Operation();
			
			int num1=0;
			int num2=0;
			int oper=0;
			int oper1=0;

			try {
				op=Integer.parseInt(bf.readLine());
			} catch (NumberFormatException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			switch (op) {
			case 1:
				System.out.println("Please select the operation:");
				System.out.println("1: Add");
				System.out.println("2: Substraction");
				System.out.println("3: Multiple");
				System.out.println("4: Divide");
				System.out.println("5: Exit");
				
				
				try {
					oper=Integer.parseInt(bf.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				while (oper!=5) {
					System.out.println("Please two numbers:");
					try {
						num1=Integer.parseInt(bf.readLine());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						num2=Integer.parseInt(bf.readLine());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					switch (oper) {
					case 1:
						System.out.println(operation.sum(num1, num2));
						oper=5;
						op=1;
						break;
					case 2:
						System.out.println(operation.substraction(num1, num2));
						oper=5;
						op=1;
						break;
					case 3:
						System.out.println(operation.multiple(num1, num2));
						oper=5;
						op=1;
						break;
					case 4:
						System.out.println(operation.divide(num1, num2));
						oper=5;
						op=1;
						break;
					default:
						break;

					}
				}
				op=1;
				break;
			case 2:
				
				System.out.println("Please select the shape:");
				System.out.println("1: rectangle");
				System.out.println("2: Trapezoidal");
				System.out.println("3: Circle");
				System.out.println("4: Triangle");
				System.out.println("5: Exit");
				
				try {
					oper1=Integer.parseInt(bf.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				while (oper1!=5)  {
					switch (oper1) {
					case 1:
						System.out.println("Please input rectangel's "
								+ "two side lengths");
						try {
							operation.setA(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						try {
							operation.setH(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.out.println(operation.area("rectangle"));
						oper1=5;
						op=2;
						break;
					case 2:
						System.out.println("Please input Trapezoidal's "
								+ "two side lengths and height");
						try {
							operation.setA(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							operation.setB(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							operation.setH(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(operation.area("trapezoidal"));
						oper1=5;
						op=2;
						break;

					case 3:
						System.out.println("Please input circle's "
								+ "radius");
						try {
							operation.setA(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println(operation.area("circle"));
						oper1=5;
						op=2;
						break;
					case 4:
						System.out.println("Please input triangle's "
								+ "side length and height");
						try {
							operation.setA(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							operation.setH(Integer.parseInt(bf.readLine()));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(operation.area("triangle"));
						oper1=5;
						op=2;
						break;	
					default:
						break;

					}
				}
				
				break;

			}
		}

	}		
}
