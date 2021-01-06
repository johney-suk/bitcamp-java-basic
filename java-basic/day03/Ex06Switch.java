package day03;
// 조건문 02 - switch
// if 조건문의 경우
// 우리가 조건식을 적어주고
// 그 조건식이 참일때에 대한 코드를 적어주었다.

// switch 조건문의 경우
// 우리가 정수형 혹은 String 형 변수를 하나 선택하여
// 그 변수의 값에 따른 코드처리를 해주게 된다.

// switch 조건문은 다음과 같은 형태를 가진다.
// switch(변수){
// 	case 값:
//		실행할 코드
//		break;
//	...
//	default:
//		실행할 코드
//		break;
//
// }

public class Ex06Switch {
	public static void main(String[] args) {
		int number = 5;
		switch(number) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("그외입니다.");
			break;
		}
		// switch는 값의 범위가 작고 코드 결과가 확연히 다른 조건에 대한
		// 경우게만 쓰이게 된다.
		// 왜냐하면 경우의 수가 많을 경우네는 if-else 구조가 더 쉬워지기 때문이다.
		
		// 또한 결과값이 int/String 이면
		// 연산자를 사용할 수도있다.
		switch(number %2) {
		case 0:
			System.out.println("짝수입니다.");
		case 1:
			System.out.println("홀수입니다.");
		
		}
	}

}
