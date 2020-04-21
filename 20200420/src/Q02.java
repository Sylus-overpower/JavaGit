/*
 * 다음식을 만족하는 모든 a와 b의 조합을 구하는 프로그램을 작성하자
 *   a b
 *   b a
 *  +9 9
 */
public class Q02 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<=10; j++) {
				if(i+j==9) {
					System.out.println("i = "+ i + " j = " + j + " = " +9);
				}
			}
		}
	}
}
