package day02;
// if -else if 구조
// 만약 어떠한 값에 대한 조건문이 여러개가 필요하다면?
// 예시: 나이에 따른 영유아, 어린이, 청소년, 성인 출력
// 그때는 if / else 구조로는 완성시킬수 없다.
// 이럴때에는 if - else if 구조가 나오게된다.
// 첫번째 if 조건식이 false가 나오면
// 그 다음 else if 의 조건식을 체크
// 거기서도 false면 다음 else if로 이동
// .....
// 모두다 false면 else 실행

// else if 구조는 우리가 필요한 만큼의 else if를 넣어줄 수 있다.

public class Ex10ElseIf {
	public static void main(String[] args) {
		int number = 105;
		
		if(number < 0) {
			System.out.println("음수입니다.");
		}else if(number < 10){
			System.out.println("한자리 자연수입니다.");
		}else if(number < 100){
			System.out.println("두자리 자연수입니다.");
		}else {
			System.out.println("그외입니다.");
			
		}
		
	}

}
