package day03;
// 사용자로부터 성별, 나이, 신체등급 순으로 입력 받아서
// 현역, 공익, 면제 를 출력하는 프로그램
// 조건 1. 성별은 1이면 남자 2면 여자로 판정합니다.
// 조건 2. 만약 여자일 경우 추가적인 정보 입력은 받지 않습니다.
// 조건 3. 남자이지만 미성년자일 경우 추가적인 정보 입력은 받지 않습니다.
// 조건 4. 남자 성인일 경우 1~3은 현역, 4는 공익 그외는 면제가 됩니다.

import java.util.Scanner;
public class Ex05NestedIf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요(1은 남자 2는 여자): ");
		int gender = scanner.nextInt();
		
		if (gender <= 1) {
			// 남자이므로 나이를 입력받는다.
			System.out.print("나이를 입력해주세요: ");
			int age = scanner.nextInt();
			
			if (age >= 18) {
				// 남성 + 성인이므로 신체등급을 입력받는다.
				System.out.println("신체등급을 입력해주세요: ");
				int category = scanner.nextInt();
				
				if(category <=3 ) {
					System.out.println("현역입니다.");
				}else if(category ==4) {
					System.out.println("공익입니다.");
				}else {
					System.out.println("면제입니다.");
				}
				
			}else {
				// 남성이지만 미성년자이므로 메시지만 출력
				System.out.println("아직 미성년자이므로 국방의 의무가 부여되지 않습니다.");
			}
			
		}else {
			// 여자이므로 메시지만 출력
			System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
		}
		scanner.close();

	}
}	
