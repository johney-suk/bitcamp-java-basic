package day03;
//3. 사용자로부터 키와 몸무게를 입력받아
//BMI 수치를 계산하여
//35이상: 고도비만
//30~34.9: 중도비만
//25~29.9: 경도비만
//18.5~24.9: 정상
//18.5미만: 저체중이 출력되는 프로그램을 작성하시오
//BMI 공식은 몸무게 / 키 / 키
//단, 몸무게는 kg 단위고 키는 m단위이다.
//기네스북에 따르면 세상에서 가장 큰 사람의 키는 272 cm 였습니다.
//세상에서 가장 무거웟던 사람의 몸무게는 442 kg 였습니다.
//이 두가지도 적용시켜서 값 검증을 하시오

import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 키를 입력 받는다.
		System.out.print("키를 입력해주세요: ");
		
		double height = scanner.nextDouble();
		if (height >= 0 && height < 2.72 ) {
			// 올바른 키 이므로 다음 단계로 이동
			// 몸무게를 입력 받는다.
			System.out.print("몸무게를 입력해주세요: ");
			
			double weight = scanner.nextDouble();
				if(weight > 0 && weight < 442) {
				// BMI 계산한다.
					double BMI = weight / height / height;
				
				//계산한 BMI로 결과를 출력한다.	
				if(BMI >= 35) {
					System.out.println("고도비만입니다.");					
				}else if(BMI >= 30){
					System.out.println("중도비만입니다.");
				}else if(BMI >= 2){
					System.out.println("경도비만입니다.");
				}else if(BMI >= 18.5){
					System.out.println("정상체중입니다.");
				}else {
					System.out.println("저체중입니다.");
				}
			}else {
				System.out.println("몸무게를 잘못입력하셨습니다.");
			}
		}else {
			// 잘못된 키 이므로 경고메시지 출력
			System.out.println("키를 잘못입력하셨습니다.");
		}

		
		scanner.close();
	}

}
