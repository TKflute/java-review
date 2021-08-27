package com.comparable;

import java.util.Comparator;

public class AthleteCompareByFirstName implements Comparator<Athlete>{

	// compare by first name
	@Override
	public int compare(Athlete a1, Athlete a2) {
		
		return a1.getFirstName().compareTo(a2.getFirstName());
	}

}
