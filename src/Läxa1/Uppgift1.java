package Läxa1;

import java.util.Scanner;

public class Uppgift1 {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 
	 
	 int tal = input.nextInt();
	 int sum = tal;
	 while(tal != 0) {
		 tal = input.nextInt();
		 sum += tal;
	 }
	 System.out.println(sum);
	 
 }
}
