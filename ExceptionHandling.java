package com.OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=10,b = 0;
		int c = 0;
		
		try {
//			c = a/b; 
//			System.out.println(c);
			
			int arr[] = null;
			System.out.println(arr[1]);
		}
		
		catch(ArithmeticException | NullPointerException e) { //java 1.7 allows two exceptions in one catch
			System.out.println(e);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.err.println("erroe occured");
		}
		finally {
			System.out.println("This get's printed no matter what");
		}
		
		
		File fs = new File("abc.txt");
		
			try {
				FileInputStream fis = new FileInputStream(fs);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //here we can use throws it abrupt the pgm so go with try/catch
		
		
//		Scanner sc  = new Scanner(System.in);
//		int i = sc.nextInt();
//		System.out.println(i);
//		sc.close();
		
			System.out.println("enter num for sc");
		try(Scanner sc  = new Scanner(System.in);){ //try with resource
			int i = sc.nextInt();
			System.out.println(i);
		}
		
		double bal = 500,withdraw = 700; //custom exception
		try {
			if(bal < withdraw)
			throw new InsufficientFundException(withdraw - bal);
			}
		catch(InsufficientFundException e){
			System.out.println(e);
		}

		System.out.println("END");
		
		

	}

}
