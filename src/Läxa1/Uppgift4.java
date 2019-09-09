package Läxa1;

import java.util.ArrayList;

public class Uppgift4 {

	private static ArrayList<String> Jeff = new ArrayList<String>();
	
	public static void add(String a) {
		Jeff.add(a);
	}
	
	public static ArrayList<String> returnerna(){
		return Jeff;
	}
}
