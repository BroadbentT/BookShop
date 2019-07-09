// *****************************************************************************
//                     JAVA BOOKSHOP - STOCK UTILITY FILE
//           BY TERENCE BROADBENT BSC CYBER SECURITY (FIRST CLASS)
// *****************************************************************************

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Load required imports.
// Modified: N/A
// *****************************************************************************

package Application;

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Create and populate program variables.
// Modified: N/A
// *****************************************************************************

public class BookShop {

final private String title;
final private String author;

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
this.author = author;}}

//Eof....
