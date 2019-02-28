package ReadInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
	
	//adding the BufferedReader class with the InputStreamReader class in the constructor
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	//the getInt method will read an String Input and convert it to an Integer type
	//this method also control the input, either the user give an incorrect input or the user give no input
	//the method will warn you
	public int getInt(){
		int herebud = 0;
		int error = 0;
		do {
			try {
				error = 0;
				String zeile = in.readLine();
				herebud = Integer.parseInt(zeile);
			}
			catch(IOException e) {
				System.out.println("Fehler bei der Eingabe !");
			      error = 1;
			}
			catch(NumberFormatException e) {
				System.out.println("Keine gültige Zahl!");
			      error = 1;
			}
		}while(error == 1);
		
		return herebud;
	}
	
	//the getDouble method will read an String Input and convert it to an Double type 
	public double getDouble() {
		double herebud = 0;
		int error = 0;
		do {
			try {
				error = 0;
				String zeile = in.readLine();
				herebud = Double.parseDouble(zeile);
			}
			catch(IOException e) {
				System.out.println("Fehler bei der Eingabe !");
			      error = 1;
			}
			catch(NumberFormatException e) {
				System.out.println("Keine gültige Zahl!");
			      error = 1;
			}
		}while(error == 1);
		
		return herebud;
	}
	
	//the getString method will read an String Input and return it
	//this method will also check the user input
	public String getString() {
		String zeile = "";
		try {
			zeile = in.readLine();
		}
		catch(IOException e) {
			System.out.println("Fehler bei der Eingabe !");
		}
		return zeile;
	}
	
}
