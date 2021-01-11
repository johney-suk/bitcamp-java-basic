package day04;
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
import java.util.Scanner;
public class StarPrint09 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("별찍기 9번");
		System.out.println("출력할 줄 수: ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= userNumber - 1 ; i++) {
			String stars = new String();
			
			for(int j = 1; j <= userNumber - i ; j++) {
				stars += " ";
			}
			
			for(int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}


			System.out.println(stars);
		}
		for(int i = userNumber; i >= 1 ; i--) {
			String stars = new String();
			
			for(int j = 1; j <= userNumber - i ; j++) {
				stars += " ";
			}
			
			for(int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}

				
			System.out.println(stars);
		}
		
		scanner.close();
		}
	

}
