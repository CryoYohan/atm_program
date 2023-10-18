package com.atm;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
	
public class Optioons extends Accounts {
	//Child class
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(952141, 191904);
				data.put(989947, 71976);
				System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your customer number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your PIN number: ");
				setPinNumber(menuInput.nextInt());
				
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
				x = 2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}
			else {
				System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
			}
		}while (x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("TYPE 1: Checking Account.");
		System.out.println("TYPE 2: Savings Account.");
		System.out.println("TYPE 3: EXIT.");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM Project.\nBye!");
			break;
			
		default:
			System.out.println("\nInvalid Choice\n");
		}
	}
	
	public void getChecking() {
		System.out.println("Select the option you want to access: ");
		System.out.println("TYPE 1: Check Balance.");
		System.out.println("TYPE 2: Withdraw Balance.");
		System.out.println("TYPE 3: Deposit Balance.");
		System.out.println("TYPE 4:  EXIT.");
		
		
		int selection = menuInput.nextInt();
		switch(selection) {
		
		case 1:
			System.out.println("Checking account balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM Project.\nBye!");
			break;
			
		default:
			System.out.println("\nInvalid Choice\n");
			break;
		}
	}
	
	public void getSaving() {
		System.out.println("Select the option you want to access: ");
		System.out.println("TYPE 1: Check Balance.");
		System.out.println("TYPE 2: Withdraw Balance.");
		System.out.println("TYPE 3: Deposit Balance.");
		System.out.println("TYPE 4:  EXIT.");
		
		
		int selection = menuInput.nextInt();
		switch(selection) {
		
		case 1:
			System.out.println("Saving account balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM Project.\nBye!");
			break;
			
		default:
			System.out.println("\nInvalid Choice\n");
			break;
		}
	}
}
