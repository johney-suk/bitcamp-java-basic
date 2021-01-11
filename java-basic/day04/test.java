package day04;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		for(int i = 1; i <10; i++) {
//			for(int j =1; j <10; j++) {
//				System.out.println( i + " * " + j);
		Scanner scanner = new Scanner(System.in);

		for(int i = 1; i < 5; i++) {
			String stars = new String();
			for(int j =1; j <= i ; j++) {
			stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
		
	}
}