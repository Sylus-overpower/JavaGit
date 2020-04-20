import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력하세요");
		int a = scan.nextInt(); //Integer.parseInt(scan.nextLine()); 스트링을 인트로 형변환해서 입력
		
		System.out.println("숫자 입력하세요");
		int b = scan.nextInt();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a>b) {
			System.out.println("a가 큽니다.");
		}else if(a<b) {
			System.out.println("b가 큽니다");
		}else {
			System.out.println("a와b는 같습니다");
		}
	}
}
