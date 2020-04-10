package co.edu;

public class AuthorComparator implements Comparable<AuthorComparator> {

	String firstName;
	String bookName;
	int authAge;
	AuthorComparator(String first, String book, int Age){
		this.firstName = first;
		this.bookName = book;
		this.authAge = Age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String lastName) {
		this.bookName=bookName;
	}
	public int 	getAuthAge() {
		return authAge;
	}
	public void setAuthAge(int authAge) {
		this.authAge=authAge;
	}

	@Override
	public int compareTo(AuthorComparator au) {
		return this.firstName.compareTo(au.firstName);
	}
	
}
































