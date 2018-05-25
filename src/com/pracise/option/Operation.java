package com.pracise.option;

public class Operation {
	final double Pi=3.1415926;
	int a=0;
	int b=0;
	int h=0;
	public int sum(int num1, int num2) {
		return num1+num2;
	}

	public int substraction(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiple(int num1, int num2) {
		return num1*num2;
	}
	
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	
	public double area(String shape) {
		if(shape.equals("triangle")) {
			return a*h/2;
		}else if(shape.equals("circle")) {
			return Math.pow(a, 2)*Pi;
		}else if (shape.equals("trapezoidal")) {
			return (a+b)*h/2;
		}else 
			return a*h;
	}



	/**
	
	 * @param a to set a
	
	*/
	public void setA(int a) {
		this.a = a;
	}



	/**
	
	 * @param b to set b
	
	*/
	public void setB(int b) {
		this.b = b;
	}


	/**
	
	 * @param h to set h
	
	*/
	public void setH(int h) {
		this.h = h;
	}
}
