package com.shopingaapp.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Auth {

	private String line ;

	public void optionver(int optiontype) {
		Scanner inputScanner = new Scanner(System.in);
		if (optiontype == 1) {
			System.out.println("login");

			System.out.println("Please enter user name:");
			String username = inputScanner.nextLine();
			System.out.println("Please enter your password:");
			String userpass = inputScanner.nextLine();

			File customertxt = new File("/home/freeze/git/Shoppingapp/Shopping app/customer.txt");

			try {
				FileReader customerReader = new FileReader(customertxt);
				BufferedReader txtReader = new BufferedReader(customerReader);

				ArrayList<String> datastore = new ArrayList<String>();

				while ((line = txtReader.readLine()) != null) {

					// datastore = Arrays.asList(lines);
					datastore.addAll(Arrays.asList(line.split("\\s*,\\s*")));
					 System.out.println(datastore.get(1));
					System.out.println(line);
				

			
				
			}
			boolean uname = datastore.contains(username);
			boolean upass = datastore.contains(userpass);
			
			System.out.println(uname);
			if (uname  && upass) {
				System.out.println("You have logged in"+" "+username);
				
			} else {
				System.out.println("authication error:check your user name and password");

			}
			}
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			
			
		 
			
			

		}
		else {
			System.out.println("Admin login");
			
		}
		
	}
}
