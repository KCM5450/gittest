package Day1;
import java.util.Scanner;
public class Star {
	public static void main(String[] args) {
		String[] name = new String[3];// 이름
		int[][] score = new int[3][4]; // 국,영,수,총
		float[] avg = new float[3]; // 평균

		
		Scanner sc = new Scanner(System.in);

		// 입력
		for (int i = 0; i < 3; i++) {
			
			nameInput(scoName,name,sc,i);
			// 국.영.수

			// 이중 for
			for (int j = 0; j < 3; j++) {
				System.out.println("성적");
				score[i][j] = sc.nextInt();
				// 연산
				score[i][3] += score[i][j];
			}
			avg[i] = score[i][3] / 3.f;
		}

		// 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(name[i]);
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println(avg[i]);
		}
	}
	private static void nameInput(String[] scoName, String[] name, Scanner sc, int i) {
	
	    System.out.print(scoName[0]+"input: ");
	name[i]=sc.next();
    }
}
