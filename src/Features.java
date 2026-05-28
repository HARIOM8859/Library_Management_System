public class Features {
    Book[] bookarr = new Book[10];
    int bookcount = 0;
    public void add(Book b1){
        if(bookcount >= 10){
            System.out.println("No More Books Can be Added Stock Full");
            return;
        }
        bookarr[bookcount] = b1;
        bookcount++;
    }
    public void View(){
        System.out.println("The BOOKS THAT ARE AVAILABE IN THE LIBRARY ARE: ");
        for(int i=0; i<bookcount; i++){
            System.out.println("The ID of the book is: "+ bookarr[i].Book_ID);
            System.out.println("The title of the book is: "+ bookarr[i].Book_Title);
            System.out.println("The Author of the book is: "+ bookarr[i].Book_Author);
            System.out.println("Is the BOOK Available "+ bookarr[i].Availability);
            System.out.println("The Book is Of : "+ bookarr[i].Department+ " Department");
            System.out.println("-------------------------------------------------------------");
        }
    }
    public void search(int target_id){
            for(int i=0; i<bookcount; i++){
                if(bookarr[i].Book_ID == target_id){
                    System.out.println("Yes the Book is there in the library");
                    System.out.println("The Book Name is :"+ bookarr[i].Book_Title);
                    System.out.println("It is available in the Department of "+ bookarr[i].Department);
                    return;
                }
            }
        System.out.println("The BOOK is not available");
    }
    public void Availability(String SearchBook){
        for(int i=0; i<bookcount; i++){
            if(bookarr[i].Book_Title.equals(SearchBook) && bookarr[i].Availability == true){
                System.out.println("The Book is Available and can be issued");
                return;
            }
            else if(bookarr[i].Book_Title.equals(SearchBook) && bookarr[i].Availability == false){
                System.out.println("Books is Available but cannot be issued");
                return;
            }
        }
        System.out.println("Book is not found");
    }
    public void issued(String targetbook){
        for(int i=0; i<bookcount; i++){
            if(bookarr[i].Book_Title.equals(targetbook) && bookarr[i].Availability == true){
                System.out.println("The Book "+ targetbook+ " is issued to you");
                bookarr[i].Availability = false;
                return;
            }
        }
        System.out.println("Sorry! The Book can't be issued");
    }
    public void Return(int returnid){
        for(int i=0; i<bookcount; i++){
            if(bookarr[i].Book_ID == returnid){
                bookarr[i].Availability = true;
                return;
            }
        }
        System.out.println("Tell me the correct BookID");
    }
    public void Delete(int RemoveID){
        for(int i=0; i<bookcount; i++){
            if (bookarr[i].Book_ID == RemoveID) {
                for(int j=i; j<bookcount-1; j++) {
                    bookarr[j] = bookarr[j+1];
                }
                bookarr[bookcount-1] = null;
                bookcount--;
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book Not Found");
    }
    public void Update(int prevID, String updatedname, int updatedID, String updatedDepartment, String updatedAuthor){
        for(int i=0; i<bookcount; i++){
            if(bookarr[i].Book_ID == prevID){
                bookarr[i].Book_ID = updatedID;
                bookarr[i].Book_Title = updatedname;
                bookarr[i].Department = updatedDepartment;
                bookarr[i].Book_Author = updatedAuthor;
                return;
            }
        }
        System.out.println("Everything is up to date!");
    }
}
