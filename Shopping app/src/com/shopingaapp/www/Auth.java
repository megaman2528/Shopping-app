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
	
	private String line;

	public void optionver(int optiontype) {
		Scanner  inputScanner = new Scanner(System.in);
		if(optiontype == 1) {
			System.out.println("welcome to login");
			
			System.out.println("Please enter user name:\n");
			String username = inputScanner.nextLine();
			System.out.println("Please enter your password:\n");
			String userpass = inputScanner.nextLine();
			
			File customertxt = new File("customer.txt");
			
			
			
			
			try {
				FileReader customerReader = new FileReader(customertxt);
				BufferedReader txtReader = new BufferedReader(customerReader);
				ArrayList<String> datastore = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*")));
				while((line = txtReader.readLine()) != null);
				datastore.add(line);
				System.out.println(datastore);
				
				
			} catch ( IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	

}
