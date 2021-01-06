package day02;
// if - else 구조란
// if의 조건식이 false가 나올경우,
// 무조건 else 코드 블락이 실행되는 구조이다!

// if(조건식) {
//		참일때
//		실행할 코드
// }else {
// 조건식이거짓일때
// 실행할 코드
// }
public class Ex08IfElse {
	public static void main(String[] args) {
		int number = 15;
		if(number < 10) {
			System.out.println("number는 10보다 작습니다.");
		}else {
			System.out.println("number는 10보다 크거나 같습니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
