package com.selva;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Stack s = new Stack();
//		s.push(10);
//		s.pop();
		
//		BetterStack s = new BetterStack();
//		s.pushData(10);
//		s.popData();
		
//		Stack s = new Stack();
//		BetterStack s = new BetterStack();
		
//		StackOps s;
//		s = new Stack();
//		s = new BetterStack();
		
//		s = Framework.getStackInstance();
//		s = Framework.getBetterStackInstance();
		
//		s.push(10);
//		s.pop();
		
		StackOps s;
		Framework f = new Framework("instance.txt");
//		s = Framework.getInstance();
		s = f.getInstance();
		s.push(10);
		s.pop();
	}

}
