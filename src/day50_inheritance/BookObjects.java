package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Aytmatov";
        book.title = "Erte kelgen turnalar";
        book.price = 12.99;
        book.type = "roman";

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 11.81;
        audioBook.title = "Selenium Cookbook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "java data structures";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readbook();

    }
}
