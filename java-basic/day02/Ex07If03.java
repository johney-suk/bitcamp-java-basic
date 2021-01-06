package day02;
// 사용자로부터 자연수를 입력받는 프로그램을 작성하세요.
// 단, 사용자가 자연수가 아닌 숫자를 입력하면 경고메시지를 띄어주세요
import java.util.Scanner;
public class Ex07If03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("자연수를 입력해주세요: ");
		int number = scanner.nextInt();
		
		if(number < 0) {
			System.out.println("자연수가 아닙니다!!!");
			
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
