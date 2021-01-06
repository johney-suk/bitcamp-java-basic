package day02;
// 1. 사용자로부터 나이를 입력받아서
//		0~4: 영아
//		6~13: 어린이
//		14~17: 청소년
//		그외: 성인
//		이 출력되는 프로그램을 작성하시오
// 2. 사용자로부터 점수를 입력받아서
//		90점이상: A
//		80점대: B
//		70점대: C
//		60점대: D
//		그외: F 가 출력되는 프로그램을 작성하시오
// 3. 사용자로부터 키와 몸무게를 입력받아
//		BMI 수치를 계산하여
//		35이상: 고도비만
//		30~34.9: 중도비만
//		25~29.9: 경도비만
//		18.5~24.9: 정상
//		18.5미만: 저체중이 출력되는 프로그램을 작성하시오
//		BMI 공식은 몸무게 / 키 / 키
//		단, 몸무게는 kg 단위고 키는 m단위이다

import java.util.Scanner;
public class Ex11IfElseIf02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요: ");
		int age = scanner.nextInt();
		if(age < 6) {
			System.out.println("영아 입니다.");
		}else if(age < 14){
			System.out.println("어린이 입니다.");
		}else if(age < 17){
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("성인입니다.");	
		}
		
		System.out.print("점수를 입력해주세요: ");
		int number = scanner.nextInt();
		if(number >= 90) {
			System.out.println("A");
		}else if(number >= 80) {
			System.out.println("B");
		}else if(number >= 70) {
			System.out.println("C");
		}else if(number >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.print("몸무게를 입력해주세요: ");
		int weight = scanner.nextInt();
		
		System.out.print("키를 입력해주세요: ");
		int height = scanner.nextInt();
		
		double BMI = weight / height / height;
		
		
		System.out.println("BMI: " +BMI);
		
		
		scanner.close();
	}

}

