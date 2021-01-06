package day02;
// printf
// printf는 우리가 출력할 내용을 특정 형식에 맞추어
// 출력가능하게 한다.
public class Ex02Printf {
	public static void main(String[] args) {
		// 1. 10진법 정수('d'ecimal)
		int number = 1234;
		// A. 10진법 정수를 그대로 출력하라
		System.out.printf("1-A. %d\n", number);
		// B. 10진법 정수를 오른쪽 정렬 6자리로 출력해라
		System.out.printf("1-B. %6d\n", number);
		// C. 10진법 정수를 오른쪽 정렬 3자리로 출력해라
		System.out.printf("1-C. %3d\n", number);
		// D. 10진법 정수를 왼쪽 정렬 6자리로 출력해라
		System.out.printf("1-D. %-6d(끝)\n", number);
		// E. 10진법 정수를 오른쪽 정렬 6자리로 출력하되
		//	왼쪽 빈자리는 0으로 채워라
		System.out.printf("1-E.%06d\n", number);
		
		// 2. 16진법 정수(he'x'adecimal
		number = 93;
		// A. 16진법 정수를 출력하되 알파벳이 있으면 소문자로 출력해라
		System.out.printf("2-A. %x\n", number);
		// B. 정수를 16진법으로 표시하고 알파벳이 있으면 대문자로 출력해라.
		System.out.printf("2-B. %X\n", number);
		// C. 16진법 정수를 출력하되 알파벳이 있으면 대문자로 출력하고
		//	오른쪽 정렬 8자리로 출력해라
		System.out.printf("2-C. %8X\n", number);
		// D. 16진법 정수를 출력하되 알파벳이 있으면 소문자로 출력하고 
		//	왼쪽 정렬 4자리로 출력해라
		System.out.printf("2-D. %-4x\n", number);
		// E. 16진법 정수를 출력하되 알파벳이 있으면 대문자로 출력하고
		//	오른쪽 정렬 5자리로 출력하되 왼쪽 빈 공간은 0으로 채워라
		System.out.printf("2-E. %05X\n", number);
		
		// 3. 실수('f'loat)
		double myDouble = 123.4567;
		// A. 실수를 그대로 표시해
		System.out.printf("3-A. %f\n", myDouble);
		// B. 실수를 오른쪽 정렬 12자리로 출력해라
		System.out.printf("3-B.%12f\n", myDouble);
		// C. 실수를 소숫점 2번째 자리까지 출력해라
		System.out.printf("3-C.%.2f\n", myDouble);
		// D. 실수를 오른쪽 정렬 8자리로 출력하되 소숫점은 2번째 자리까지 출력해라
		System.out.printf("3-D.%8.2f\n", myDouble);
		
		// 4. 문자열('S'tring)
		String string1 =new String("abcDEFghi");
		// A. 문자열 그대로 출력해라
		System.out.printf("4-A. %s\n", string1);
		// B. 문자열을 출력하되 소문자는 전부 대문자로 바꿔서 출력해라
		System.out.printf("4-B. %S\n", string1);
		
		
		//printf를 사용할때 유의할점
		// 1. 존재하지 않는 %문자를 사용하면 에러가 난다.
		//System.out.printf("%p\n", 123456);
		//여러분들이 자주 하시는 실수 중에 다음과 같은 경우가 있다.
		//System.out.printf("학생의 점수: %(점)",80);
		
		// 2. %문자의 종류와 뒤에 넘겨주는 값의 종류가 일치하지 않으면 에러가 난다.
		//System.out.printf("%d\n", 12.45);
		
		// 3. %문자보다 뒤의 넘겨주는 값이 더많은건 문제가 되지 않는다.
		System.out.printf("1. %d, 2. %d, 3. %d\n", 10, 20, 30, 40);
		// 하지만 뒤의 넘겨주는 값의 갯수가 %문자보다 적으면 에러가 난다.
		//System.out.printf("1. %d, 2. %d, 3. %d\n", 10, 20);

		




		
	}

}
