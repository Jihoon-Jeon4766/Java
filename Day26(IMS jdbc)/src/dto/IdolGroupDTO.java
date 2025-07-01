package dto;
// 클래스 설계-데이터를 저장하는 클래스
public class IdolGroupDTO {

	private String idolGroupName; // 식별자
	private String company;
	private String gender;
	private String genre;
	private int year;
	private String song;
    private int generation; // option + command + s
	
	public String getIdolGroupName() {
		return idolGroupName;
	}
	public void setIdolGroupName(String idolGroupName) {
		this.idolGroupName = idolGroupName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이돌 그룹 이름 = " + idolGroupName + ", 아이돌 그룹 소속사 = " + company
				+ ", 대표곡 = " + song + ", 데뷔년도 = " + year + ", 나이대 = " + generation;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	
}
