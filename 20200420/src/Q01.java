/*
 * 구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을 작성하되 2단은 2*2까지 4단은
 * 4*4까지 출력하도록 작성하자
 */
public class Q01 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i+=2) {

			for (int j = 1; j < i+1; j++) {

				System.out.println(i + "x" + j + "=" + (i * j));

			}

		}
	}
}
