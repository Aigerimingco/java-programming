package day50_inheritance;

public class EBook extends Book{

    int size;
    int pages;
    public void  readbook(){
        System.out.println("Reading book: ");
        System.out.println("Title: "+title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);;
    }
}
