package com.atm;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Accounts {
	
	//Base Class
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Available balance is: " + moneyFormat.format(checkingBalance));
		System.out.println("Enter amount to withdraw: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0 ) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be Negative.\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account balance is: " + moneyFormat.format(savingBalance));
		System.out.println("Enter amount to withdraw: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0 ) {
			calcSavingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be Negative.\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Enter amount you want to withdraw: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be negative\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Enter amount you want to withdraw: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be negative\n");
		}
	}
	
}
