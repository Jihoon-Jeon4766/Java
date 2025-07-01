package vo;

public class IdolGroupVO {
	private String idolGroupName;// 식별자
	private String company;
	private String gender;
	private String genre;
	private int year;
	private String song;
    private int generation; // option + command + s
    
	public IdolGroupVO(String idolGroupName, String company, String gender, String genre, int year, String song,
			int generation) {
		super();
		this.idolGroupName = idolGroupName;
		this.company = company;
		this.gender = gender;
		this.genre = genre;
		this.year = year;
		this.song = song;
		this.generation = generation;
	}

	public String getIdolGroupName() {
		return idolGroupName;
	}

	public String getCompany() {
		return company;
	}

	public String getGender() {
		return gender;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

	public String getSong() {
		return song;
	}

	public int getGeneration() {
		return generation;
	}
    
    
}
