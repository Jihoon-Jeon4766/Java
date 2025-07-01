import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 표준 콘솔에서 사용자가 입력한 값을 읽어들이는 Scanner 객체 생
	
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 읽어들이기
		// 라인복사 : cmd + option + 아랫방향키
		// 라인이동 : option + 방향키
		// 끝에 한글 씹힐경우 - 입력후 esc 키 입력
		// 임포트 - cmd + shift + o
		// content assist - eclipse > setting -> general -> keys
		// 에서 설정
		// 바탕화면 바로가기 : fn + f11
		// 화면 이동 : cmd + tab
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.println("name = " + name);
		
		// 숫자 읽어들이기
		// 한줄 제거 : cmd + d
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		
	}

}
