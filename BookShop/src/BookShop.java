// *****************************************************************************
//  STAFFORDSHIRE UNIVERSITY
//  FACILITY OF COMPUTING, ENGINEERING & SCIENCE 
//  SCHOOL OF COMPUTING
//
//  CESMCOM10070/4 DATA STORAGE AND SOFTWARE DEVELOPMENT - SEMESTER 2
//  TUTORIAL SESSIONS EXERCISES & PORTFOLIO ASSIGNMENTS 43
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 26.02.2014 VERSION 1.0
//
//  TASK 1
// *****************************************************************************

public class BookShop {

private String title;
private String author;

public String getTitle() {
return title;
}

public String getAuthor() {
return author;
}

public BookShop(String title) {
this.title = title;
author = "Anon";
}
public BookShop(String title, String author) {
this.title = title;
this.author = author;
}
// Eof.
}
