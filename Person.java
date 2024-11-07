package com.choucair.automation.models;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
	private String contactNumber;
    private String vacancyTitle;

    public Person(String firstName, String lastName, String email, String contactNumber, String vacancyTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
		this.contactNumber = contactNumber;
        this.vacancyTitle = vacancyTitle;
    }

    // Getters and setters
}