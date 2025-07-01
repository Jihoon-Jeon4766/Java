/* 문제2.	영화 Movie클래스를 정의하여 보자. Movie클래스는 영화제목,평점,감독,발표된연도				
	등의 필드를 가진다. 영화의 모든 정보를 화면에 출력하는 print()라는 메소드를 				
	구현하라. Movie클래스를 작성하고 객체를 생성하여 테스트하라. MovieTest클래스로 테스트하라. */
class Movie {
	String movieTitle;
	double score;
	String director;
	int openYear;
	
	void print() {
		System.out.println("영화제목 : " + movieTitle);
		System.out.printf("평점 : %.1f\n", score);
		System.out.println("감독 : " + director);
		System.out.println("발표된연도 : " + openYear);
	}
}
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		String title = movie.movieTitle = "a";
		double score = movie.score = 4.2;
		String director = movie.director = "ab";
		int year = movie.openYear = 2020;
		
		movie.print();
	}

}
