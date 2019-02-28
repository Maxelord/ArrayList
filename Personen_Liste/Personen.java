package Personen_Liste;

public class Personen {
	
	public String Vorname, Nachname, Ort;
	public int Alter, PLZ;
	
	
	//Constructor from the class Person(en)| When nothing is written in the Constructor, the place holder will fill it
	public Personen() {
		Vorname = "unbekannt";
		Nachname = "unbekannt";
		Ort = "unbekannt";
		Alter = -1;
		PLZ = -1;
	}
	
	//Another Constructor from the Class "| Passes the values from the variables in the Constructor
	public Personen(String Vn, String Nn, String O, int A, int P) {
		Vorname = Vn;
		Nachname = Nn;
		Ort = O;
		Alter = A;
		PLZ = P;
	}
	//Another Constructor from the Class "| Passes the value from an already existing person
	public Personen(Personen p) {
		Vorname = p.Vorname;
		Nachname = p.Nachname;
		Ort = p.Ort;
		Alter = p.Alter;
		PLZ = p.PLZ;
	}
	
	//set-function
	public void setVorname(String Vn) {
		Vorname = Vn;
	}
	
	public void setNachname(String Nn) {
		Nachname = Nn;
	}
	
	public void setOrt(String O) {
		Ort = O;
	}
	
	public void setAlter(int A) {
		Alter = A;
	}
	
	public void setPLZ(int P) {
		PLZ = P;
	}
	
	//get-function
	
	public String getVorname() {
		return Vorname;
	}
	
	public String getNachname() {
		return Nachname;
	}
	
	public String getOrt() {
		return Ort;
	}
	
	public int getAlter() {
		return Alter;
	}
	
	public int getPLZ() {
		return PLZ;
	}
	
	//print list
	public void printl() {
		System.out.print("\nVorname: " + Vorname + "\nNachname: " + Nachname + "\nAlter: " + Alter + "\nOrt: " + Ort + "\nPLZ: " + PLZ);
	}
	
	//compare-function| compare each persons values -> relevant for the sorting algorithm
	public int compareTo(Personen p) {
		//compare "vorname" 
		if(Vorname.compareTo(p.Vorname) > 0) {
			return 1;
		}
		if(Vorname.compareTo(p.Vorname) < 0) {
			return -1;
		}
		if(Vorname.compareTo(p.Vorname) == 0) {
			//compare "Nachname"
			if(Nachname.compareTo(p.Nachname) > 0) {
				return 1;
			}
			if(Nachname.compareTo(p.Nachname) < 0) {
				return -1;
			}
			if(Nachname.compareTo(p.Nachname) == 0) {
				//compare "ort"
				if(Ort.compareTo(p.Ort) > 0) {
					return 1;
				}
				if(Ort.compareTo(p.Ort) < 1) {
					return 1;
				}
				if(Ort.compareTo(p.Ort) == 0) {
					return 0;
				}
			}
		}
		return 0;
	}
}
