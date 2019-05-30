package com.shopingaapp.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerShopping implements Customer {

	@Override
	public void IteamForCart() {
		Scanner iteaminput = new Scanner(System.in);
		File Iteamtxt = new File("Iteams.txt");

		try {
			FileReader iteamFileReader = new FileReader(Iteamtxt);
			BufferedReader iteamBufferedReader = new BufferedReader(iteamFileReader);

			String iteamString;

			ArrayList<String> Iteamdata = new ArrayList<String>();

			ArrayList<String> billinList = new ArrayList<String>();

			System.out.println("nEnter yes when completed");

			//String userbuy = null;
			while ((iteamString = iteamBufferedReader.readLine()) != null) {
				System.out.println(iteamString);

				Iteamdata.addAll(Arrays.asList(iteamString.split("\\s*,\\s*")));
				
				
			}
				
				  String userbuy;
				while ((userbuy = iteaminput.nextLine()) != "yes") {
				  
				  billinList.add(userbuy);
				  
				  
				  
				  if (userbuy.equals("yes")) { 
					  
					  billinList.remove("yes");
					  break;
				  
				  }
				  
				  System.out.println(billinList);
				  
				  }
				 
				//System.out.println("nEnter yes when completed");
				//billinList.containsAll(Iteamdata);
				//System.out.println(Iteamdata.containsAll(billinList));
			
			

			iteamBufferedReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		iteaminput.close();

	}

	@Override
	public void NoOftems() {
		// TODO Auto-generated method stub

	}

}
