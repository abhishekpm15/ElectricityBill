package com.eb.main;

import java.util.Scanner;

import com.eb.service.*;

public class EBMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String st=sc.next();
		ConnectionService c=new ConnectionService();
		System.out.printf(c.generateBill(a,b,st));
		sc.close();

	}

}
