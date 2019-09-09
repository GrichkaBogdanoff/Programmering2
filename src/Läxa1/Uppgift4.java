package Läxa1;

import java.util.ArrayList;


public class Uppgift4
{	
	private static ArrayList<Object> Jeff = new ArrayList<Object>();
	
	public static void add(Object a) {
		Jeff.add(a);
	}
	
	public static ArrayList<Object> returnera(){
		return Jeff;
	}
}
