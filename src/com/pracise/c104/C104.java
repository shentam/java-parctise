package com.pracise.c104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class C104 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0;
		double average=0;
		Gba gba= new Gba();
		Mp3 mp3= new Mp3();
		Company company=new Company();
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader bufferedReader =new BufferedReader(isr);
		System.out.println("Please input the amount of Employees:");
		/*
		gba.setPrice(320);
		gba.setQuality(5);
		mp3.setPrice(260);
		mp3.setQuality(13);
		company.setEmployee(18);*/
		try {
			company.setEmployee(Integer.parseInt(bufferedReader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isr =new InputStreamReader(System.in);
		bufferedReader =new BufferedReader(isr);
		System.out.println("Please input the amount of GBA:");
		try {
			gba.setQuality(Double.parseDouble(bufferedReader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		isr =new InputStreamReader(System.in);
		bufferedReader =new BufferedReader(isr);
		System.out.println("Please input the amount of MP3:");
		try {
			mp3.setQuality(Double.parseDouble(bufferedReader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		isr =new InputStreamReader(System.in);
		bufferedReader =new BufferedReader(isr);
		System.out.println("Please input the price of GBA:");
		try {
			gba.setPrice(Double.parseDouble(bufferedReader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		isr =new InputStreamReader(System.in);
		bufferedReader =new BufferedReader(isr);
		System.out.println("Please input the price of MP3:");
		try {
			mp3.setPrice(Double.parseDouble(bufferedReader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		total = gba.getPrice()*gba.getQuality()+mp3.getQuality()*mp3.getPrice();
		average=total/company.getEmployee();
		System.out.println("when a GBA costs $"+gba.getPrice()+" and a MP3 costs $"+
		mp3.getPrice()+", the "+company.getEmployee()+" employees company spends "+"$"+
				total+" and the average cost is: "+average);
		
	}


}
