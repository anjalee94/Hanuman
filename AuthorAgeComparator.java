package co.edu;

import java.util.*;

public class AuthorAgeComparator implements Comparator<AuthorComparator> {

	public int compare(AuthorComparator a1, AuthorComparator a2) {
		if(a1.authAge==a2.authAge)
			return 0;
		else if(a1.authAge>a2.authAge)
			return 1;
		else
			return -1;
	}
	
}
