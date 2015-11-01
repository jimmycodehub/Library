

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Member> members = new ArrayList<Member>();
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Loan> loans = new ArrayList<Loan>();
	

	public Library() {
		addObjectsToList();
		displayMembers();
		processLoan(books.get(0), members.get(1));
		processLoan(books.get(1), members.get(0));
		
	}
	
	public void addObjectsToList(){
		Member member1 = new Member(689, "Jane Smith", "678690", 34);
		Member member2 = new Member(456, "Tom Dunne", "677450", 13);
		members.add(member1);
		members.add(member2);
		
		Book book1 = new Book(145, "Harry Potter", 18);
		Book book2 = new Book(456, "1984", 30);
		books.add(book1);
		books.add(book2);
	}
	
	public void displayMembers(){
		for(Member member : members){
			System.out.println("Member name is "+member.getName());
		}
	}
	
	public void processLoan(Book book, Member member){
		//check if the person is old enough for the book
		//otherwise give an error message
		//if they are old enough, check if the have more than 3 books out
		//if they don't, create a new Loan object
		//add that loan to the list of loans
		//increase the member's loansOut number by 1
		
		if(member.getAge() >= book.getAudienceAge()){
			if(member.getBooksOnLoan() <3){
				Loan loan = new Loan((int)Math.random(), member, book);
				loans.add(loan);
				member.setBooksOnLoan(member.getBooksOnLoan()+1);
				System.out.println("Loan created");
			}
			else{
				System.out.println("You have max loans");
			}
		}
		else{
			System.out.println("You're too young for this book");
		}

	}
	

	public static void main(String[] args) {
		new Library();

	}

}
