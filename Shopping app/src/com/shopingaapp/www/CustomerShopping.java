package com.shopingaapp.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomerShopping implements Customer {

	@Override
	public void IteamForCart() {
		File Iteamtxt = new File("Iteams.txt");
		
		try {
			FileReader iteamFileReader = new FileReader(Iteamtxt);
			BufferedReader iteamBufferedReader = new BufferedReader(iteamFileReader);
			
			String iteamString;
			
			while ((iteamString=iteamBufferedReader.readLine())!=null) {
				System.out.println(iteamString);
				
				System.out.println("Please Enter the Iteam name");
				
				
			}
			iteamBufferedReader.close();
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}

	@Override
	public void NoOftems() {
		// TODO Auto-generated method stub
		
	}

	

}
