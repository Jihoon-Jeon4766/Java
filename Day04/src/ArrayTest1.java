import java.util.Arrays;

//배열과 변수의 차이 : 변수 - 메모리에 데이터를 하나를 저장, 배열 - 데이터를 여러 개 저장
public class ArrayTest1 {
    void printInfo(String[] infoArray) {  // 파라미터를 String 배열로 수정
        for (int i = 0; i < infoArray.length; i++) {
            System.out.println("infoArray[" + i + "] = " + infoArray[i]);
        }
    }

    public static void main(String[] args) {
        // 데이터타입[] 배열명; (또는) 데이터타입 배열명[];
        // 1. 배열 선언
        int[] arr1;
        int arr2[];

        // 2. 배열 객체 생성
        // 배열명 = new 데이터타입[배열의 크기];
        // 자바에서 배열은 객체임. 즉, 힙 영역에 생성됨.
        arr1 = new int[3];

        // 3. 배열의 각 영역에 값 할당
        // 배열의 각 영역을 구분할 때는 인덱스를 사용
        // 인덱스 값은 0번부터 시작
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // 4. 배열의 각 영역에 저장된 값을 사용
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        // 처음부터 배열에 값을 할당하면서 배열객체 생성
        // 배열에 처음 할당하는 값의 갯수가 배열의 크기가 됨
        // 1.
        int[] arr3 = {1, 2, 3, 4};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
        // 2.
        int[] arr4 = new int[]{2, 3, 4, 5, 6};
        for (int i = 0; i < arr4.length; i++) {
            System.out.println("arr4[" + i + "] = " + arr4[i]);
        }

        // 두 가지 방식의 차이점 :
        // 1) 배열의 선언과 생성이 분리될 때는 2번 방식만 허용함
        int[] arr5;
        arr5 = new int[] {2, 3, 4};

        // 2) 자바에서 메소드(클레스에서 제공하는 기능)를 호출하면서 인자(파라미터)로
        // 배열객체를 생성해서 전달할 때는 2번 방식만 허용함
        // 자바에서 클래스에 정의된 인스턴스메소드를 호출하려면 클래스 객체를 생성해야 함
        ArrayTest1 arrayTest1 = new ArrayTest1();
        arrayTest1.printInfo(new String[] {"aaa", "bbb", "ccc"});
    }
}
