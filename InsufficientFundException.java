package com.OOP;

public class InsufficientFundException extends Exception {
	
	double money;
	public InsufficientFundException(double d) {
		money = d;

	}

}
