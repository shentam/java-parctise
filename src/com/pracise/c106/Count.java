package com.pracise.c106;

public class Count {
	 int left=0;
	 int total=0;
	 
	 public int count() {
		 total=((left+1)*3+3)*2;
		 return total;
	 }


	/**
	
	 * @param left to set left
	
	*/
	public void setLeft(int left) {
		this.left = left;
	}
}
