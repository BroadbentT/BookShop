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
// Details : Call any imports to be used by the program.
// Modified: N/A
// *****************************************************************************

import java.util.*;

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : The main program.
// Modified: N/A
// *****************************************************************************

 public class BookShopApplication {
    public static void main(String[] args) {
        
// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Create and populate program variables.
// Modified: N/A
// *****************************************************************************

    BookShop [] books = new BookShop [10];                                      // 10 books max.
    Scanner myKeyboard = new Scanner(System.in);

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Obtain the book information from the user via the keyboard.
// Modified: N/A
// *****************************************************************************

    for(int NumLoop = 0; NumLoop < books.length; ++NumLoop){
    books[NumLoop] = getBook(myKeyboard);}
    
// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : now display the results of book[] to the user.
// Modified: N/A
// *****************************************************************************    

    printBookDetails(books);
}

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Method getBook() - Obtain the book information from the user.
// Modified: N/A
// *****************************************************************************
    
    private static BookShop getBook(Scanner myKeyboard){
    System.out.print("Please enter the Title of this Book: ");
    String GrabBookName = myKeyboard.nextLine();
    System.out.print("Please enter the Author of this Book: ");
    String GrabAuthorName = myKeyboard.nextLine();

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Now populate the program variables with the supplied user data.
// Modified: N/A
// *****************************************************************************

    BookShop Book;
    if (GrabAuthorName.equals("")){
    Book = new BookShop(GrabBookName);}
    else {Book = new BookShop(GrabBookName, GrabAuthorName);}
    return Book;}

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : All done, print the stock of books to the screen.
// Modified: N/A
// *****************************************************************************    
 
    private static void printBookDetails(BookShop[] books){
    System.out.println("\n\nBook list:\nTitle\t\t\t\tAuthor");
    System.out.println("==========\t\t\t==========");
    for (int NumLoop = 0; NumLoop < books.length; NumLoop++) {
    System.out.println(books[NumLoop].getTitle() + "\t\t\t" + books[NumLoop].getAuthor());}}}

//Eof...
