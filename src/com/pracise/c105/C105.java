package com.pracise.c105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_table table=new Multiple_table();
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader bf =new BufferedReader(isr);
		System.out.println("Please input a layer number to display a Multiple tabel:");
		try {
			table.table(Integer.parseInt(bf.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
