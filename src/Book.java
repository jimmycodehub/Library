

public class Book {
	
	private int id;
	private String title;
	private int audienceAge;
	
	public Book(int id, String title, int audienceAge) {
		this.id = id;
		this.title = title;
		this.audienceAge = audienceAge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAudienceAge() {
		return audienceAge;
	}

	public void setAudienceAge(int audienceAge) {
		this.audienceAge = audienceAge;
	}

	

}
