package day02;
// 사용자로부터 숫자를 입력받아서
// 홀수일때만 "홀수입니다" 가 출력되는 프로그램을 작성하시오.
// 단 제일 마지막줄에 "프로그램 종료"가 출력 되도록 하시오.
import java.util.Scanner;
public class Ex06If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자: ");
		int number = scanner.nextInt();
		
		if(number %2 == 1) {
		System.out.println("홀수입니다");
			
		}
		
		System.out.println("프로그램 종료");
		
		scanner.close();	

		
	}

}