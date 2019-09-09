package Läxa1;

public class Uppgift1 {
	public static void main(String[] args) {
	
		int[] nummer = new int [] {1,7,6,4,1,2,7};
		
		System.out.println(summering(nummer));
}
	
	public static int summering(int[] nummer) {
		int summa = 0;
		for (int i = 0; i < nummer.length; i++) {
			summa += nummer[1];
		}
		return summa;
	}
}