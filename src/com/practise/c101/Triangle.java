package com.practise.c101;

public class Triangle {
	public void draw(int layer) {
		for(int i=1;i<=layer;i++) {
			for(int j=1;j<=layer;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=layer;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        for(int i=1;i<=layer;i++){
            for(int j=layer; i<=j; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
            	System.out.print("*");
            }
                
            for(int l=1; l<i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

