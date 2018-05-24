package com.pracise.c105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C105_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal =new Calculator();
		System.out.println("Please input two numbers to calculate:");
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		try {
			cal.setNum1(Integer.parseInt(bf.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cal.setNum2(Integer.parseInt(bf.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cal.sum());
		System.out.println(cal.average());
		System.out.println(cal.cal());
		System.out.println(cal.cal1());
		System.out.println(cal.cal2());
		System.out.println(cal.cal3());
	}

}
