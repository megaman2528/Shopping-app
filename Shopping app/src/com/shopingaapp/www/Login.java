package com.shopingaapp.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner userInput = new Scanner(System.in);

	public void UserType() {
		System.out
				.println("Are you a Customer or admin?" + "\nEnter 1 for customer login" + "\nEnter 2 for admin login");
		int logintype = userInput.nextInt();

		if (logintype == 1) {
			System.out.println("Hello customer\n");

			System.out.println("Please enter User name\n");
			String cusername = userInput.nextLine();

			System.out.println("Please enter your Password\n");
			String cpass = userInput.nextLine();

			File cuser = new File("customer.txt");

			try {
				FileReader cReader = new FileReader(cuser);

				BufferedReader buffreader = new BufferedReader(cReader);
				
				String readline;
				while((readline = buffreader.readLine()) != null) {
					
				}
			} catch ( IOException e) {

				System.out.println("file not found");
			}

		}

	}

}
