

public class Loan {
	
	private int id;
	private Member member;
	private Book book;
	
	public Loan(int id, Member member, Book book){
		this.id = id;
		this.member = member;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
