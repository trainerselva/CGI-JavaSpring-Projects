package com.selva;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Framework {
	
	static String configFileName;
	
	public Framework(String configFileName) {
		Framework.configFileName = configFileName;
	}
	
	public static StackOps getStackInstance() {
		return new Stack();
	}
	
	public static StackOps getBetterStackInstance() {
		return new BetterStack();
	}
	
	public static StackOps getInstance() throws IOException {
//		InputStream f = new FileInputStream(new File("instance.txt"));
		InputStream f = new FileInputStream(new File(Framework.configFileName));
		DataInputStream ds = new DataInputStream(f);
		String className = ds.readLine();
		
		if (className.equalsIgnoreCase("Stack")) {
			return new Stack();
		}
		
		if (className.equalsIgnoreCase("BetterStack")) {
			return new BetterStack();
		}
		return null;
	}
}
