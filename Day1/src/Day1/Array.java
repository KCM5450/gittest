/* 
 * 사람의 성적처리프로그램
 * 입력 : 이름,국,영,수
 * 연산 : 총점,평균
 * 출력 : 이름, 국,영.수,총점,평균  */

package Day1;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String name; // 이름
		int score[] = new int[4]; // 국,영,수,총
		float avg;
	
		Scanner sc = new Scanner(System.in);
	
	// 성적처리 프로그램 중 입력 파트 이름 / 국 / 영 / 수 
		System.out.print("이름을 입력하세요");
        name = sc.next();
     
        System.out.print("국어 점수를 입력하세요");
        score[0] = sc.nextInt();

        System.out.print("영어 점수를 입력하세요");
        score[1] = sc.nextInt();

        System.out.print("수학 점수를 입력하세요");
        score[2] = sc.nextInt();
	
      // 연산 : 총점, 평균
        score[3] = score[0] + score[1] + score[2];
                     
        avg = score[3]/3.f;
	
      // 출력 : 이름, 국,영.수,총점,평균
        System.out.print(name);
        System.out.print("국어"+score[0]);
        System.out.print("수학"+score[1]);
        System.out.print("영어"+score[2]);
        System.out.print("총점"+score[3]);
        System.out.print("평균"+avg);
	}

}