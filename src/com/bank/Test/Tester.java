package com.bank.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.bank.accountService.AccountService;

/**
 * @author Mohamed
 *
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String acctHolder = "";
		String type = "";
		int balance = 0, tmp = 0;
		int withd = 0, cb = 0;

		int actNum = 0;
		actNum = (int) ((Math.random() * 9000) + 1000);

		String client = "user1";
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date today = Calendar.getInstance().getTime();

		String reportDate = df.format(today);

		AccountService user = new AccountService(actNum, "savings", 0, client, reportDate);

		Scanner in = new Scanner(System.in);
		Scanner strng = new Scanner(System.in);
		int userChoice;

		boolean quit = false;

		do {
			System.out.println("please select one of the following choices");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Check balance");
			System.out.println("5. Display Account Details");
			System.out.println("0. to quit: \n");
			System.out.print("Enter Your Choice : ");
			userChoice = in.nextInt();
			switch (userChoice) {

			case 1:
				System.out.print("Enter your Name : ");
				acctHolder = strng.nextLine();
				System.out.print("Enter Accout Type : ");
				type = in.next();
				user.createAccount(actNum, type, balance, client, reportDate);
				System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
				System.out.println("**************************");
				user.accountDetails();
				break;

			case 2: // deposite
				System.out.print("Enter your account Number : ");
				tmp = in.nextInt();
				if (tmp == user.getAcctNum()) {
					System.out.print("Enter Amount Of Money to be deposited: ");
					balance = in.nextInt();
					user.setBalance(user.getBalance() + balance);
					System.out.println("\t Successfully Deposited.");
				} else
					System.out.println("Wrong Accoount Number.");
				break;

			case 3: // withdraw money
				System.out.print("Enter your account Number : ");
				tmp = in.nextInt();

				if (tmp == user.getAcctNum()) {
					if (user.getBalance() == 0)
						System.out.print("Your Account is Empty.");

					else {
						System.out.print("Enter Amout Of Money to withdraw: ");
						withd = in.nextInt();

						if (withd > user.getBalance()) {
							System.out.print("Your balance is insufficient to perform this transaction : ");
							withd = in.nextInt();
						} else
							cb = user.withdraw(actNum, withd);
						System.out.println("Your Current Balance : " + cb);
					}
				} else
					System.out.println("Wrong Accoount Number.");
				break;

			case 4: // check balance

				System.out.print("Enter your Account Number : ");
				tmp = in.nextInt();

				if (tmp == user.getAcctNum()) {
					System.out.println("Your Current Balance : " + user.getBalance());
				} else
					System.out.println("Wrong Accoount Number.");
				break;

			case 5: // display all info

				System.out.print("Enter your Account Number :");
				tmp = in.nextInt();
				if (tmp == user.getAcctNum()) {
					user.accountDetails();
				} else
					System.out.println("Wrong Accoount Number.");

				break;
			case 0:
				quit = true;
				break;
			default:
				System.out.println("Wrong Choice.");
				break;
			}
			System.out.println("\n");
		} while (!quit);
		System.out.println("Thanks !");

	}

}
