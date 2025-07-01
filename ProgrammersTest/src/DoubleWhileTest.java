public class DoubleWhileTest {
    public static void main(String[] args) {
        int i = 1;
        
        // 상단 부분 (피라미드)
        while (i <= 5) {
            int j = 1;
            while (j <= 5 - i) { // 공백 출력
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            while (j <= 2 * i - 1) { // 숫자 출력
                System.out.print(j);
                j++;
            }
            
            System.out.println();
            i++;
        }
        
        i = 4;
        
        // 하단 부분 (역피라미드)
        while (i >= 1) {
            int j = 1;
            while (j <= 5 - i) { // 공백 출력
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            while (j <= 2 * i - 1) { // 숫자 출력
                System.out.print(j);
                j++;
            }
            
            System.out.println();
            i--;
        }
    }
}
