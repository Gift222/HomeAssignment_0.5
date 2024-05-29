public class BookShop {
    // Creating an instance and printing
    public static void main(String[] args) {
        Book book = new Book ("Things fall apart ", "Gift");

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.isbn);

//Using Constructor to create multiple instances of the class with different parameter and printing the value
        Book Book = new Book(book.title, book.author);
        Book Book1 = new Book("Joy of motherhood", "Jason");
        Book Book2 = new Book("Hamlet", "William");
        Book Book3 = new Book("Oliver twist", "John");
        Book Book4 = new Book("Romeo and Juliet", "Shakespeare");

        System.out.println(Book1.title);
        System.out.println(Book1.author);
        System.out.println(Book1.isbn);

        System.out.println(Book2.title);
        System.out.println(Book2.author);
        System.out.println(Book2.isbn);

        System.out.println(Book3.title);
        System.out.println(Book3.author);
        System.out.println(Book3.isbn);

        System.out.println(Book4.title);
        System.out.println(Book4.author);
        System.out.println(Book4.isbn);

        // creating an instance with two parameters
        Book book1 = new Book("Revolution", "Napoleon");
        System.out.println(title.);
        System.out.println(author);



























    }
}
