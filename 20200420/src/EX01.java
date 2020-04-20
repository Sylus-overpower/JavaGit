import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		/*
		 * 
		 * git 회원가입
		 * 
		 * yum -y install java1.8*
		 *javac명령어로 컴파일
		 * 이클립스 사용하기때문에 자동 컴파일됨
		 * 
		 * java EX01.class 실행명령어
		 * debug 모드는 이클립스에서(만) 사용하는 개발자 개발도구.
		 * f6으로 한줄씩 진행가능 (라인진행)
		 * f8디버그 모드 종료 or 다음 브레이크 포인트진행 f8
		*/
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		/*
		 *char a[30]; 
		 *fgets( a, stdin ); // 파괴적방식 내부에서 값을 변경해서 출력?
		*/
		System.out.println("입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine(); //비파괴적방식 - 반환값을 살려서?
		System.out.println("inputValue ="+inputValue);
	}
}
