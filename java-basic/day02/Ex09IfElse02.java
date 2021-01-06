package day02;
// 1. 사용자로부터 숫자를 입력받아서
//		홀수/짝수 를 출력하는 프로그램을 작성하세요

// 2. 사용자로부터 나이를 입력받아서
//		성인/미성년자 를 출력하는 프로그램을 작성하세요

// 3. 사용자가 입력한 숫자가 자연수인지 음수인지를 출력하는 프로그램을 작성하시오
import java.util.Scanner;
public class Ex09IfElse02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=========1번=========");
		System.out.print("숫자: ");
		int number = scanner.nextInt();
		if(number %2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
		System.out.println("=========2번=========");
		System.out.print("나이: ");
		int age = scanner.nextInt();
		if(age >= 19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");

		}
		
		System.out.println("=========3번=========");
		System.out.println("숫자: ");
		int number2 = scanner.nextInt();
		if(number2 >= 0) {
			System.out.println("자연수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
			System.out.println("=================");
			scanner.close();

			

	}
}
