package day03;
//1. 사용자로부터 나이를 입력받아서
//0~4: 영아
//6~13: 어린이
//14~17: 청소년
//그외: 성인
//이 출력되는 프로그램을 작성하시오
//단 나이는 음의 정수이거나 110을 초과할 수 없습니다.

import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 사용자로부터 나이를 입력받는다.
		System.out.print("나이를 입력해주세요: ");
		int age = scanner.nextInt();
		
		// if - else if - else 구조를 만들어서
		// 각각의 경우에 대한 코드를 처리해준다.
		
		// 1. 5세 이하
		if(age >= 0 && age <= 5) {
			System.out.println("영아 입니다.");
		}else if(age >= 6 && age <= 13){
			// 6~13세이므로 어린이라는 메시지 출력
			System.out.println("어린이 입니다.");
		}else if(age >=14 && age <= 17){
			// 14~17세이므로 청소년이라는 메시지 출력
			System.out.println("청소년 입니다.");
		}else if (age >= 18 && age <= 110) {
			// 18세이상이므로 성인이라는 메시지 출력
			System.out.println("성인입니다.");	
		}else {
			System.out.println("잘못입력하셨습니다.");
		}

		
		scanner.close();
	}

}
