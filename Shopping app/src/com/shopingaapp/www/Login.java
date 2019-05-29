package com.shopingaapp.www;

import java.util.Scanner;

public class Login {
	static Scanner userInput = new Scanner(System.in);

	public void UserType() {
		System.out.println("Are you a Customer or admin?" + "\nEnter 1 for customer login" + "\nEnter 2 for admin login");
		int logintype = userInput.nextInt();
		
		Auth auth = new Auth();
		auth.optionver(logintype);

	}

}
