package com.pracise.c106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C106_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number:");
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(isr);
		Countdown cd =new Countdown();
		try {
			System.out.println(cd.countdown(Integer.parseInt(bf.readLine())));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
