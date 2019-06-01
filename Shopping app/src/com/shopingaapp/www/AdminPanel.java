package com.shopingaapp.www;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminPanel {
	public void write() {
	File iFile = new File("Iteams.txt");
	try {
		FileWriter iFileWriter = new FileWriter(iFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
