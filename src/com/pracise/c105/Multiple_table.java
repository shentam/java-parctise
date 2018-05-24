package com.pracise.c105;

public class Multiple_table {

	
	public void table(int times) {
		for(int i=1;i<=times;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" * "+i+" = "+i*j+"\t");
			}
			System.out.println();
		}
	}
}
