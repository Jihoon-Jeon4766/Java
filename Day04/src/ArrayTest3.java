// 배열에 점수를 저장하고 최대값과 최소값 구하기
public class ArrayTest3 {
	
    public static void main(String[] args) {
    	
        int[] score = {100, 90, 100, 88, 98};
        int max = score[0];
        int min = score[0];
      
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
