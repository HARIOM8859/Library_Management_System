public class Book {
    String Book_Title;
    int Book_ID;
    String Book_Author;
    boolean Availability;
    String Department;

    Book(String Book_Title, int Book_ID, String Book_Author, boolean Availability, String Department){
        this.Book_Title = Book_Title;
        this.Book_ID = Book_ID;
        this.Book_Author = Book_Author;
        this.Availability = true;
        this.Department = Department;
    }
}
