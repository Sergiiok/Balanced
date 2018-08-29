package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.Balanced;

public class Main {

	Balanced bala;
	public Main() {
		
		bala= new Balanced();
		
	try {
		readTxt();
	}catch (Exception e) {
		e.getMessage();
		
	}}
	
	public void readTxt() throws IOException {
		
		  String cadena;
	      FileReader f = new FileReader("testCases.txt");
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	    	  System.out.println(bala.isBalacend(cadena));
	      }
	      b.close();
	
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	
		Main main = new Main();
		
		

	}

}
