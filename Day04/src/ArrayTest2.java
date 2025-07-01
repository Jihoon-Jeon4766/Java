// 배열에 점수를 저장하고, 총점과 평균 구하기

public class ArrayTest2 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0;

        int[] score = {100, 90, 100, 88, 98};

        // 총점
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f", average);

    }
}
