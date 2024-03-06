package Day1;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		System.out.print("몇명으로 할건가요?>");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		String[] name = new String[num];// 이름
		int[][] score = new int[num][4]; // 국,영,수,총
		float[] avg = new float[num]; // 평균

		// 입력
		for (int i = 0; i < num; i++) {
			System.out.print("이름입력");
			name[i] = sc.next();
			// 국.영.수

			// 이중 for
			for (int j = 0; j < 3; j++) {
				System.out.print("성적"+(j+1));
				score[i][j] = sc.nextInt();
				// 연산
				score[i][3] += score[i][j];
			}
			avg[i] = score[i][3] / 3.f;
		}

		// 출력
		for (int i = 0; i < num; i++) {
			System.out.print(name[i]);
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println(avg[i]);
		}
	}
}

/*
 * // 성적처리 프로그램 중 입력 파트 이름 / 국 / 영 / 수 System.out.print("이름을 입력하세요"); name =
 * sc.next();
 * 
 * System.out.print("국어 점수를 입력하세요"); score[0] = sc.nextInt();
 * 
 * System.out.print("영어 점수를 입력하세요"); score[1] = sc.nextInt();
 * 
 * System.out.print("수학 점수를 입력하세요"); score[2] = sc.nextInt();
 * 
 * // 연산 : 총점, 평균 score[3] = score[0] + score[1] + score[2];
 * 
 * avg = score[3]/3.f;
 * 
 * // 출력 : 이름, 국,영.수,총점,평균 System.out.print(name);
 * System.out.print("국어"+score[0]); System.out.print("수학"+score[1]);
 * System.out.print("영어"+score[2]); System.out.print("총점"+score[3]);
 * System.out.print("평균"+avg);
 */
