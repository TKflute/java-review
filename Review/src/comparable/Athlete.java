package com.comparable;

public class Athlete implements Comparable<Athlete>{

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private Sport sport;
	
	public enum Sport{
		BASKETBALL, BASEBALL, SOCCER, TENNIS
	}

	public Athlete(String firstName, String lastName, String dateOfBirth, Sport sport) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.setSport(sport);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "Athlete [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + "]";
	}

	@Override
	public int compareTo(Athlete otherAthlete) {
		return this.lastName.compareTo(otherAthlete.getLastName());
	}

	
}
