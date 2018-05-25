package com.pracise.c106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input how many fishes left:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		Count count =new Count();
		try {
			count.setLeft(Integer.parseInt(bf.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Totally, fisher got "+count.count()+" fishes");
	}

}
