package day02;
// Scanner
// 스캐너는 자바가 기본적으로 제공해주는 클래스로써
// 외부로부터의 입력을 담당한다.
// 키보드 입력, 파일 입력 등 입력과 관련된걸 모두다 처리해준다.
// 하지만 우리 패키지 내부에는 Scanner가 없기 때문에
// "수입" 해 와야한다.
// 외부 클래스를 수입할 때에는
// import 패키지.클래스이름;
// 으로 수입해야한다.
import java.util.Scanner;
public class Ex03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. 사용자로부터 정수(int)를 입력받아보자
		System.out.print("숫자를 입력해주세요: ");
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 정수: "+number);
		System.out.println("-----------------------------");

		// 2. 사용자로부터 실수(double)을 입력받아보자
		System.out.print("실수를 입력해주세요: ");
		double userDouble = scanner.nextDouble();
		System.out.println("사용자가 입력한 실수: " +userDouble);
		System.out.println("-----------------------------");
		
		// 3. 사용자로부터 String을 입력받아보자.
		System.out.print("이름을 입력해주세요: ");
		// 스캐너에는 유명한 버그가 하나 있는데
		// nextInt(), nextDouble() 등의 숫자를 입력받고 나서
		// nextLine()을 실행하면
		// 버퍼메모리에 남아있는 엔터키 때문에
		// 사용자가 실제론 아무런 입력도 못하게 되는 버그이다.
		// 이버그를 해결하는 방법은 간단한데
		// scanner.nextLine()을 실행해주면 된다.
		// 단, 앞에 숫자값 입력이 없을 경우에는 nextLine()은 한번만 써주어야 한다.
		scanner.nextLine(); //버퍼메모리의 엔터키를 비워주는 역할을 할 nextLine()
		
		String name = scanner.nextLine();
		System.out.println("사용자의 이름: " + name);
		System.out.println("-----------------------------");
		
		// scanner는 버퍼메모리라는 곳을 참조하는데
		// 이렇게 외부메모리를 참조하거나 읽어오는 클래스 변수는
		// 제일 마지막에 close() 메소드를 실행해주면 좋다.
		scanner.close();
		
	}

}
