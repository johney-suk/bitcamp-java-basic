package day04;

import java.util.Scanner;
public class StarPrint10 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별찍기 10번");
		System.out.println("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= 2 * userNumber - 1 ; i++) {
			String stars = new String();
			
			if(i == 1 || i == 2 * userNumber -1) {
				// 맨 처음과 맨 마지막
				for(int j = 1; j <= 2 * userNumber - 1; j++) {
					stars += "*";
				}
				
				// 왼쪽 위 별
			}else if(i < userNumber) {
				int upperI = i - 1;
				for(int j = i; j <= userNumber; j++) {
					stars += "*";
				}
				
				// 위쪽 빈칸
				for(int j = 1 ; j <= 2 * upperI - 1; j++) {
					stars +=" ";
				}
				
				// 오른쪽 위 별
				for(int j = i; j <= userNumber; j++) {
					stars += "*";
				}
				
			}else {
				// 왼쪽 아래 별
				int lowerI = i - userNumber + 1;
				
				for(int j = 1; j <= lowerI; j++) {
					stars += "*";
				}
				
				int totalWidth = 2 * userNumber - 1;
				int starWidth = 2 * lowerI;
				int spaceWidth = totalWidth - starWidth;
				
				for(int j = 1; j <= spaceWidth; j++) {
					stars += " ";
					
				}
				
			}
			
			

				
			System.out.println(stars);
		}
		
		scanner.close();
		}
	

}
