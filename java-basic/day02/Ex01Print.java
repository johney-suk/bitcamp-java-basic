package day02;
// 자바 콘솔 화면에 출력하는 3가지 방법
// 1. print(): 괄호안의 내용을 출력하고 그 다음 출력할 때에는 그 오른쪽 칸에 출력되도록한다.
// 2.println(): 괄호안의 내용을 출력하고 그 다음 출력 할때에는 그다음줄 첫번째 칸에 출력되도록 한다.
// 3. printf(): 괄호안의 내용을 양식에 맞추어 출력하고 그 다음 출력할때 에는 그 오른쪽 칸에 출력되도록한다.

public class Ex01Print {
	public static void main(String[] args) {
		String string1 = new String("abcDEF");
		String string2 = new String("ghiJKL");
		// 1. print() 의 경우
		System.out.print(string1);
		System.out.print(string2);
		// 2. println() 의 경우
		System.out.println(string1);
		System.out.println(string2);
		// 3. printf() 의 경우
		System.out.printf("%s", string1);
		System.out.printf("%s", string2);
		
		// 4. 공백문자
		//   공백문자란 탭 공백 혹은 개행문자를 담당하는 문자로써
		//	2글자로 적지만 실제론 1글자로 취급된다.
		System.out.print(string1 + "\n");
		// \n은 개행문자로써 무조건 한줄 띄운다.
		System.out.print("\t"+string2);
		// \t는 탭 공백으로써 스페이스 4개분량 어치만큼 띄어준다.
		


		
	}

}
