package com.pracise.c105;

public class Calculator {
	int num1=0;
	int num2=0;
	int count=0;
	
	public int sum() {
		this.getNum1();
		this.getNum2();
		return num1+num2;
	}

	/**
	
	 * @return num1
	
	*/
	public int getNum1() {
		return num1;
	}

	/**
	
	 * @param num1 to set num1
	
	*/
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	
	 * @return num2
	
	*/
	public int getNum2() {
		return num2;
	}

	/**
	
	 * @param num2 to set num2
	
	*/
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int average() {
		return (num1+num2)/2;
	}

	public int cal() {
		if(this.average()>num2) {
			count++;
		}
		return count;
	}
	public int cal1() {
		return num1-count;
	}
	
	public int cal2() {
		return num2*this.cal1();
	}
	
	public int cal3() {
		return num1+cal2();
	}
	
}
