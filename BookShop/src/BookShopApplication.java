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

// *****************************************************************************
// Call any imports to be used by the program
// *****************************************************************************

    import java.util.*;

// *****************************************************************************
// Main 
// *****************************************************************************

    public class BookShopApplication {
    public static void main(String[] args) {
    
// *****************************************************************************
//  Create and populate where necessary any variables used by this program
// *****************************************************************************
    
    BookShop [] books = new BookShop [10];                                      // 10 values
    Scanner myKeyboard = new Scanner(System.in);
    
// *****************************************************************************
// Obtain the book information from the user via the keyboard
// *****************************************************************************

    for(int NumLoop = 0; NumLoop < books.length; ++NumLoop){
    books[NumLoop] = getBook(myKeyboard);}
     
// *****************************************************************************
// Display the results of books[] array to the user via the screen
// *****************************************************************************
    
    printBookDetails(books);
}
// *****************************************************************************
//  End of program - Job well done!
// *****************************************************************************
    
// *****************************************************************************
// Method getBook() - obtain the information from the user
// *****************************************************************************
    
    private static BookShop getBook(Scanner myKeyboard)
    {
        System.out.print("Please enter the Title of this Book: ");
        String GrabBookName = myKeyboard.nextLine();
        System.out.print("Please enter the Author of this Book: ");
        String GrabAuthorName = myKeyboard.nextLine();

// *****************************************************************************
// Now populate the program variables with the supplied user data
// *****************************************************************************

        BookShop Book;
        if (GrabAuthorName.equals("")){
        Book = new BookShop(GrabBookName);}
        else {Book = new BookShop(GrabBookName, GrabAuthorName);}
        return Book;}
    
// *****************************************************************************
// Method printBookDetails() - Print the data to the screen
// *****************************************************************************
    
    private static void printBookDetails(BookShop[] books){
    System.out.println("\n\nBook list:\nTitle\t\t\t\tAuthor");
    System.out.println("==========\t\t\t==========");
    for (int NumLoop = 0; NumLoop < books.length; NumLoop++) {
    System.out.println(books[NumLoop].getTitle() + "\t\t\t" + books[NumLoop].getAuthor());}
    }
    //Eof.
    }
