package day03;
// 중첩 반복문
// 중첩 반복문이란?
// 하나의 커다란 반복문 안에
// 다른 반복문이 들어가 있는 형태
// 큰 반복문이 한번 실행될때마다
// 작은 반복분은 지정된 횟수가 전부다 실행이 된다!

public class Ex10NextedForLoop {
	public static void main(String[] args) {
		// i의 현재값: 2
		// j의 현재값: 11
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("-------i 포문 시작--------");
			for(int j = 11; j <= 14; j++) {
				System.out.printf("i의 현재값: %d, j의 현재값: %d\n", i, j);				
			}
			
			
			
			System.out.println("-------i 포문 끝--------");

		}
	}

}
