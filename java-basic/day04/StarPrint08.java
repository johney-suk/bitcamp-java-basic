package day04;
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
import java.util.Scanner;
public class StarPrint08 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별찍기 8번");
		System.out.println("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= 2 * userNumber - 1 ; i++) {
			String stars = new String();
			if(i < userNumber) {
				// 윗부분
				for(int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				for(int j = 1; j < i + 1 ; j++ ) {
					stars += "*";
					
				}
				
			}else {
				// 아랫부분
				int lowerI = i - userNumber + 1 ;
				
				for(int j = 1; j <= lowerI -1; j ++) {
					stars += " ";
				}
				
				for(int j = lowerI; j <= userNumber; j++) {
					stars += "*";
				}
			}
			System.out.println(stars);
		}
		
		scanner.close();
		}
	

}
