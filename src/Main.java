import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Ugly Love",1,"Colleen Hoover", true, "HSS");
        Book b2 = new Book("Java Programming",2,"James Gosling", true, "CSE");
        Book b3 = new Book("Operating Systems",3,"Galvin", true, "CSE");
        Book b4 = new Book("Database Systems",4,"Korth", true, "IT");
        Features f1 = new Features();
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.View();
        f1.search(2);
        f1.search(10);
        f1.Availability("Ugly Love");
        f1.issued("Ugly Love");
        f1.Availability("Ugly Love");
        f1.Return(1);
        f1.Availability("Ugly Love");
        f1.Update(2,"Advanced Java",2,"CSE","James Gosling");
        f1.search(2);
        f1.Delete(3);
        f1.View();
        f1.Delete(100);
    }
}