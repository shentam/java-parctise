package com.pracise.c106;



public class Calculator {
	int left=1;
	int day=10;
	int total=0;
	
	public int count() {
		for(int i=day-1;i>0;i--) {
			total=(left+1)*2;
			left=total;
		}
		return total;
	}
	
	public int count1(int left,int day) {
		//µÝ¹é·½·¨
		if(left==day) {
			total=1;
		}else {
			total=(count1(left+1, day)+1)*2;
		}
			
		return total;
	}

}
