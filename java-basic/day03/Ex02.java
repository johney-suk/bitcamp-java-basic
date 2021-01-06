package day03;
//2. 사용자로부터 점수를 입력받아서
//90점이상: A
//80점대: B
//70점대: C
//60점대: D
//그외: F 가 출력되는 프로그램을 작성하시오

import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 점수를 입력받는다.
				
		System.out.print("점수를 입력해주세요: ");
		int score = scanner.nextInt();

		// 입력받은 점수를 토대로해서 결과를 출력한다.
		System.out.println("1. 값 검증 안한 버젼");
		if(score >= 90) {
			// 90점 이상이므로 A
		System.out.println("A 입니다.");
		
		}else if(score >= 80) {
			// score >= 90이 false가 나오지만
			// score >= 80은 true가 나온다 -> score가 80~89 라는 의미
			// 따라서 B
		System.out.println("B 입니다.");
		
		}else if(score >= 70) {
			// score >= 90이 false가 나오지만
			// score >= 80이 false가 나오지만
			// score >= 70은 true가 나온다 -> score가 70~79 라는 의미
			// 따라서 C
		System.out.println("C 입니다.");
		
		}else if(score >= 60) {
			// 점수가 60~69 란 의미이므로
			// D
		System.out.println("D 입니다.");
		
		}else {
			// 점수가 60미만이므로 
			// F
		System.out.println("F 입니다.");
		}
		
		System.out.println("---------------------------");
		
		// 값 검증(validation)
		// 우리가 사용자가 입력할때 기대하는 값이 있지만
		// 실제 사용자가 그러한 기대값을 입력안하는 경우가 있다.
		// 만약 우리가 정확히 처리를 해주지 않으면, 잘못된 값에 대한
		// 잘못된 결과가 나오게 된다.
		// 예시: 위코드에서 100을 초과하거나 0 미만의 점수를 넣으면 각각 A와 F가 출력된다.
		// 그러한 잘못된 값에 대한 코드적 처리를 우리는 검증 이라고한다.
		// 값 검증을 하는 방법은 매우 다양하게 있지만
		// 우리는 여기서
		// 빡빡한 조건식을 통한 검증과 선검증 후처리식의 검증 2가지 방법을 배워보게 될 것이다.
		
		System.out.println("값 검증 1. 빡빡한 조건식");
		// 빡빡한 조건식을 통한 검증이란
		// 해당 코드가 실행되는 조건식을 정확하게 잡아주는 방법이다.
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 70 && score < 80) {
			System.out.println("C");
		}else if(score >= 60 && score < 70) {
			System.out.println("D");
		}else if(score >= 0 && score < 60) {
			System.out.println("F");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		System.out.println("---------------------------");
		System.out.println("값 검증 2. 입력된 값이 올바른 값인지 체크하고 진행");
		// 값 검증의 2번째 방법은
		// 실제 코드를 실행하기 전에 미리 입력값이 올바른지 체크해서
		// 올바른 경우에만 실제 코드를 싱행하는 방법이다.
		// 즉 이미 값이 올바른 것을 체크했기 때문에
		// 조건식은 간해진다.
		
		if(score >= 0 && score <=100) {
			// 올바른 점수 이므로
			// 점수를 출력하는 if else 작
			if(score >= 90) {			
				System.out.println("A 입니다.");
			}else if(score >= 80) {
				System.out.println("B 입니다.");			
			}else if(score >= 70) {				
				System.out.println("C 입니다.");			
			}else if(score >= 60) {				
				System.out.println("D 입니다.");			
			}else {				
				System.out.println("F 입니다.");
			}
			
		}else {
			// 올바르지 않은 점수이므로 경고 메시지 출력
			System.out.println("잘못된 점수입니다.");
		}

		
		System.out.println("---------------------------");
		
		scanner.close();
	}
}
