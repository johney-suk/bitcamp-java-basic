package day03;
// for 문에 대한 예제
// 1. 1부터 30까지 출력해보세요
// 2. 24부터 3까지 출력해보세요

// 3. 사용자로부터 입력을 받아서
//	 1부터 그수까지의 홀수만 보여주세요

// 4. 사용자로부터 입력을 받아서
//	 1부터 그수까지의 합만 보여주세요

// 5. 사용자로부터 입력을 받아서
//	 1부터 그수까지의 곱 보여주세요

// 4번 5번은 합이나 곱을 저장할 변수의 선언 위치를 고민해보세요
import java.util.Scanner;
public class Ex09ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 1부터 30까지 출력해보세요
		System.out.println("-----1번-----");
		for(int i = 1; i <= 30; i++) {
			System.out.println(i);	
		}
		System.out.println("-------------");
		
		// 2. 24부터 3까지 출력해보세요
		System.out.println("-----2번-----");
		for(int i = 24; i >= 3; i--) {
			System.out.println(i);	
		}
		System.out.println("-------------");

		// 3. 사용자로부터 입력을 받아서
		//	  1부터 그수까지의 홀수만 보여주세요
		System.out.println("-----3번-----");
		System.out.println("숫자: ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= userNumber; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("-------------");

		// 4. 사용자로부터 입력을 받아서
		//	  1부터 그수까지의 합만 보여주세요
		System.out.println("-----4번-----");
		System.out.println("숫자: ");
		userNumber = scanner.nextInt();
		int result = 0;

		for(int i = 1; i <= userNumber; i++) {
			result += i;
			System.out.printf("1부터 %3d까지의 합: %3d\n", userNumber, result);
		}
		System.out.println("-------------");

		// 5. 사용자로부터 입력을 받아서
		//	  1부터 그수까지의 곱 보여주세요
		System.out.println("-----5번-----");
		System.out.println("숫자를 입력하세요: ");
		userNumber = scanner.nextInt();
		result = 1;
		for(int i = 1; i <= userNumber; i++) {
			result *= i;
		}
		System.out.printf("1부터 %3d까지의 곱: %d\n", userNumber, result);
		
		System.out.println("-------------");

		scanner.close();
	}

}
