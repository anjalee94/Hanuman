package co.edu;
public class Author implements Comparable<Author> {

		String firstName;
		String lastName;
		String bookName;
	Author(String first,String last,String book){
			this.firstName = first;
			this.lastName = last;
			this.bookName = book;
		}
	@Override
	public int compareTo(Author au) {
		//sorting by last name compareTo should return < 0 if this(keyword) is supposed to be less than au
				//>0 if this is supposed to be greater than object au and
				// = 0 if they are supposed to be equal
		int last = this.lastName.compareTo(au.lastName);
		// Sorting by first name if last name is same d
		return last ==0 ? this.firstName.compareTo(au.firstName): last;
		
	}
}

//if the things we are comparing are of integer type then we can write like:

//public int compareTo(Employee e) {
//	if(this.empAge==e.empAge)
//		return 0;
//	else if(this.empAge>e.empAge)
//		return 1;
//	else
//		return -1;	
//}

//or
//
//public int compareTo(Employee e) {
//	
//	return this.empAge > e.empAge ? 1: this.empAge < e.empAge ? -1:0;
//}
//
























