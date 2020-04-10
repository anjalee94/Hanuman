package co.edu;

import java.util.*;

public class BookNameComparator implements Comparator<AuthorComparator>{
	public int compare(AuthorComparator a1, AuthorComparator a2) {
		return a1.bookName.compareTo(a2.bookName);
	}

}
