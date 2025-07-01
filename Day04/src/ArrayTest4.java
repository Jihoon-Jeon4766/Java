// 로또번호 구하기
// 1. 배열에 1번 ~ 45번까지의 숫자를 배열에 저장
// 2. 1번 인덱스에 있는 번호와 임의의 인덱스 영역에 있는 번호를 스왑(교환)시키는 작업을 반복적으로 함
// 3. 6개의 숫자를 뽑아서 출력
public class ArrayTest4 {
    public static void main(String[] args) {
    	
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        // 0번 인덱스 영역에 있는 값과 교환할 값을 저장하고 있는 인덱스 번호를 랜덤하게 가져와 저장할 변수 선언
        int index = -1; // 유효하지 않은, 잘 사용되지 않는 값으로 선언
        int temp = 0; // 0번 인덱스의 값을 임시적으로 백업할 변수 영역

        for (int i = 0; i < 100; i++) {
            index = (int)(Math.random() * 45);
            temp = ball[0];
            ball[0] = ball[index];
            ball[index] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}
