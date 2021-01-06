package day03;
// 중첩 if문
// 중첩 if문이란 if 조건문 안에 또다른 if 조건문이 있는 형태이다.
// 즉 특정 조건을 만족해야 또다른 조건문이 실행이 되는 형태가 된다.
public class Ex04NestedIF {
	public static void main(String[] args) {
		int number = 5;
		if(number >= 0) {
			System.out.println("number는 자연수입니다.");
			if(number >9) {
				System.out.println("두자리이상의 숫자입니다.");
				
			}
		}
	}

}
