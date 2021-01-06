package day02;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 순으로 입력 받아서
// 번호: ###번 이름: ###
// 국어 : 0##점 영어: 0##점 수학: 0##점
// 총점: ###점 평균: ##.##점
// 의 형식으로 출력 되는 프로그램을 작성하시오

import java.util.Scanner;
public class Ex04GradeBook {
	final static int SUBJECT_SIZE = 3;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//번호
		System.out.print("번호 입력해주세요: ");
		int id = scanner.nextInt();
		System.out.println("번호: "+id+ "번");
		System.out.println("-----------------------------");
		
		//이름
		System.out.print("이름을 입력해주세요: ");
		scanner.nextLine(); 
		String name = scanner.nextLine();
		System.out.println("이름: " + name);
		System.out.println("-----------------------------");
		
		//국어
		System.out.print("국어 점수 입력해주세요: ");
		int korean = scanner.nextInt();
		System.out.println("국어 점수: "+korean+ "점");
		System.out.println("-----------------------------");
		
		//영어
		System.out.print("영어 점수 입력해주세요: ");
		int english = scanner.nextInt();
		System.out.println("영어 점수: "+english+ "점");
		System.out.println("-----------------------------");
		
		//수학
		System.out.print("수학 점수 입력해주세요: ");
		int math= scanner.nextInt();
		System.out.println("수학 점수: "+math+ "점");
		System.out.println("-----------------------------");
		
		// 총점을 저장할 변수
		int sum = korean + english + math;
	
		// 평균을 저장할 변수
		double average = sum / (double)SUBJECT_SIZE;
		
		// 정보 출력
		System.out.printf("번호: %03d번 이름: %s\n", id, name);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n"
				,korean, english, math);
		System.out.printf("총점: %03d점 평균: %.2f점\n",sum,average);
		
		
		scanner.close();
	}
}