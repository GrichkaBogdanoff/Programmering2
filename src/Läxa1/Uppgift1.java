package Läxa1;

import java.util.Scanner;

public class Uppgift1 {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 
	 int sum = 0;
	 int tal = input.nextInt();
	 while(tal != 0) {
		 tal = input.nextInt();
		 sum += tal;
	 }
	 System.out.println(sum);
	 
 }
}
