import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;
// Library management system. where we can add, issue, return, and check available books in library
class Book{
    String BookName;
    String BookAuthor;

    Book(String BookName,String BookAuthor){
        this.BookName=BookName;
        this.BookAuthor=BookAuthor;
        
    }
}

public class Library {

    static ArrayList<Book> avlbook = new ArrayList<>();
    static ArrayList<Book> issuedbooks = new ArrayList<>();

    static public void addBook(){ 
        Scanner sc = new Scanner(System.in);
        while(true){
        
        System.out.println("Enter the name of the book:");
        String bookName = sc.nextLine();

        
        if(bookName.equalsIgnoreCase("Null")){
            break;
        }

        System.out.println("Enter the name of the author:");
        String bookAuthor = sc.nextLine();
    
        avlbook.add(new Book(bookName, bookAuthor));
        System.out.println("Book added successfully");

        System.out.println("Enter 'Null' if all books are added if not");
        }  
        
    }

     static void availableBooks(){
         if(avlbook.isEmpty()){
            System.out.println("Library has no book");
         }
         else{
            System.out.println("Available books are");
            for(Book b : avlbook){
                System.out.println(b.BookName+" by "+b.BookAuthor);
        }
         }
        
    }
    
    static void returnBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        String returnBook = sc.nextLine();
        System.out.println("You returned: " + returnBook);

        for(Book b : issuedbooks){
            if(b.BookName.equalsIgnoreCase(returnBook)){
                avlbook.add(b);
                issuedbooks.remove(b);
        }
        }  
    }

    static void issueBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        String issuedbook = sc.nextLine();
        for(Book b : avlbook){
            if(b.BookName.equalsIgnoreCase(issuedbook)){
                issuedbooks.add(b);
                avlbook.remove(b);
            }
        }
        LocalDateTime now = LocalDateTime.now();
        System.out.println(issuedbook+" is issued on: "+now);
    }
    public static void main(String[] args) {
    System.out.println("Welcome to Library");
    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("What operation you want to perform: ");
    System.out.println("Press 1 to add a book");
    System.out.println("Press 2 to return a book");
    System.out.println("Press 3 to issue a book");
    System.out.println("Press 4 to check available book");
    System.out.println("Enter 'exit' to exit from the library");
    
        String operation =sc.nextLine();
        if(operation.equalsIgnoreCase("exit")){
            break;
        }
            try {
                int choice = Integer.parseInt(operation);
            switch (choice) {
                case 1:
                    addBook();
                    break;
            
                case 2:
                    returnBook();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    availableBooks();

                default:
                    break;
            }
        }
             catch (Exception e) {
                System.out.println("Enter a valid number ");
            }
        }
       sc.close();  
    }    
}

