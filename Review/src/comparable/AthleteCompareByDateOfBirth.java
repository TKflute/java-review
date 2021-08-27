package com.comparable;

import java.util.Comparator;

public class AthleteCompareByDateOfBirth implements Comparator<Athlete> {

	@Override
	public int compare(Athlete a1, Athlete a2) {
		// this one needs more thought
//		return a1.getDateOfBirth()
		return -1;
	}

	
}
