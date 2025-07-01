
public class TvMain {
    public static void main(String[] args) {
        Tv<String> tv = new Tv<>();

        tv.setTvName("삼성 TV");

        System.out.println("나의 Tv는 " + tv.getTvName() + " 입니다.");
    }
}
