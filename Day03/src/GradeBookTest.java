import java.util.Scanner;

public class GradeBookTest {
	static final int ID_MIN = 1;
	// 상수이름은 변수이름과 구분하기 위해서 전체를 다 대문자로 사용해야 하며
	// 두 단어가 합쳐질때는 "_" 로 구분함
	static final int ID_MAX = 10;
	static final int SCORE_MIN = 0;
	static final int SCORE_MAX = 100;
	static final int SUBJECT_SIZE = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 번호 입력 : ");
		int id = scanner.nextInt();
		while(!(id >= ID_MIN && id <= ID_MAX)) {
			System.out.println("잘못 입력했습니다.");
			System.out.print("번호 : ");
			id = scanner.nextInt();
		}
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
		while(!(kor >= SCORE_MIN && kor <= SCORE_MAX)) {
			System.out.println("잘못 입력했습니다.");
			System.out.print("국어 : ");
			kor = scanner.nextInt();
		}
		
		System.out.print("영어 : ");
		int eng = scanner.nextInt();
		while(!(eng >= SCORE_MIN && eng <= SCORE_MAX)) {
			System.out.println("잘못 입력했습니다.");
			System.out.print("영어 : ");
			eng = scanner.nextInt();
		}
		
		System.out.print("수학 : ");
		int mat = scanner.nextInt();
		while(!(mat >= SCORE_MIN && mat <= SCORE_MAX)) {
			System.out.println("잘못 입력했습니다.");
			System.out.print("수학 : ");
			mat = scanner.nextInt();
		}
		
		// 총점과 평균 구하기
		int sum = kor + eng + mat;
		double avg = sum / (double)SUBJECT_SIZE;
		
		System.out.printf("번호 : %03d번 이름 : %s\n", id, name);
		System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, mat);
		System.out.printf("총점 : %03d점 평균 : %06.2f점\n", sum, avg);
		scanner.close();
		
	}

}
