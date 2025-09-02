package encapsulation;

public class Library {
	private int rollno;
	private int borrowed_books;
	final private int MAX_BORROW=5;
	
	public void borrowBook() {
		if(borrowed_books<MAX_BORROW) {
			borrowed_books++;
			System.out.println("The book has borrowed and the borrowed books are "+borrowed_books);
		}else {
			System.out.println("Can not borrow the book more than 5");
		}
	}
	
	public void returnBook() {
		if(borrowed_books>0) {
			borrowed_books--;
			System.out.println("the book has been returned and the returned books are "+borrowed_books);
		}else {
			System.out.println("No book returned");
		}
	}
	public int getborrowed_books () {
		return borrowed_books;
	}
	public static void main(String args[]) {
		
	}
	

}
