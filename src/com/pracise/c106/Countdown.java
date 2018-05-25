package com.pracise.c106;

public class Countdown {
	int sum=0;
	public int countdown(int n) {
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
