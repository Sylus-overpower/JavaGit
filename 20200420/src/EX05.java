import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		System.out.println("스위치 공부하라고");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		//ctrl shift f 자동정렬
		switch (input) {
		case 1:
			System.out.println("1입력했누?");
			break;
		case 2:
			System.out.println("2입력했누?");
			break;
		case 3:
			System.out.println("3? 돌았?");
			break;

		default:
			System.out.println("있는거만 적어라 좀");
			break;
		}
	}
}
