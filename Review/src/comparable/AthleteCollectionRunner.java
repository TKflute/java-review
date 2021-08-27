package com.comparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.comparable.Athlete.Sport;

public class AthleteCollectionRunner {

	public static void main(String[] args) {
		
		List<Athlete> athleteList = new ArrayList<>();
		
		athleteList.add(new Athlete("Susan", "Morris", "08/10/1988", Sport.TENNIS));
		athleteList.add(new Athlete("Bob", "Jackson", "06/07/1990", Sport.BASEBALL));
		athleteList.add(new Athlete("Sharon", "White", "10/20/1986", Sport.BASKETBALL));
		athleteList.add(new Athlete("David", "Smith", "11/03/1991", Sport.SOCCER));
		athleteList.add(new Athlete("Mary", "Riviera", "01/10/1989", Sport.SOCCER));
		
		System.out.println("Unsorted list:");
		for(Athlete a : athleteList) {
			System.out.println(a);
		}
		
		Collections.sort(athleteList);
		
		System.out.println("---------");
		System.out.println("Sorted list:");
		for(Athlete a : athleteList) {
			System.out.println(a);
		}
		
		Set<Athlete> athleteSet = new TreeSet<>();
		athleteSet.add(new Athlete("Susan", "Morris", "08/10/1988", Sport.TENNIS));
		athleteSet.add(new Athlete("Bob", "Jackson", "06/07/1990", Sport.BASEBALL));
		athleteSet.add(new Athlete("Sharon", "White", "10/20/1986", Sport.BASKETBALL));
		athleteSet.add(new Athlete("David", "Smith", "11/03/1991", Sport.SOCCER));
		athleteSet.add(new Athlete("Mary", "Riviera", "01/10/1989", Sport.SOCCER));
		
		System.out.println("---------");
		// default TreeSet sorting
		System.out.println("Default TreeSet (sorts by last name):");
		for(Athlete a : athleteSet) {
			System.out.println(a);
		}
		
		System.out.println("----------");
		// sort by first name w/ Comparator
		Set<Athlete> athleteSetSorted = new TreeSet<>(new AthleteCompareByFirstName());
		athleteSetSorted.add(new Athlete("Susan", "Morris", "08/10/1988", Sport.TENNIS));
		athleteSetSorted.add(new Athlete("Bob", "Jackson", "06/07/1990", Sport.BASEBALL));
		athleteSetSorted.add(new Athlete("Sharon", "White", "10/20/1986", Sport.BASKETBALL));
		athleteSetSorted.add(new Athlete("David", "Smith", "11/03/1991", Sport.SOCCER));
		athleteSetSorted.add(new Athlete("Mary", "Riviera", "01/10/1989", Sport.SOCCER));
		
		System.out.println("TreeSet sorted by first name:");
		for(Athlete a : athleteSetSorted) {
			System.out.println(a);
		}

	}
	
}
