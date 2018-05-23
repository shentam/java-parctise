package com.practise.c101;

public class Operation {
	double result[]= new double[2];
	public double[] add(double num1, double num2) {
		result[0]= num1+num2;
		return result;
	}
	public double[] subtraction(double num1, double num2) {
		result[0]=num1-num2;
		return result;
	}
	public double[] multiple(double num1, double num2) {
		result[0]=num1*num2;
		return result;
	}
	public double[] divide(double num1, double num2) {
		//double [] result= new double [2];

		result[0]=num1/num2;
		result[1]=num1%num2;
		
		return result;
	}
	public void display() {
		for(int i=0;i<result.length;i++) {
			System.out.println("The result is: "+ result[i]);
		}
	}
}
