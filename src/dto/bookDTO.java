package dto;

import Controller.bookController;
import Service.bookService;
import View.bookView;

import java.util.ArrayList;

public class bookDTO {
//    bookView view = new bookView();
//    bookController controller = new bookController();
//
    private String title;
    private String arthur;
    private String isbn;
    private String publisher;
    private int price;
    private int selectNumb;
    private static ArrayList<bookDTO> books = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArthur() {
        return arthur;
    }

    public void setArthur(String arthur) {
        this.arthur = arthur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumb(int numb) {
        this.selectNumb = numb;
    }

    public int getSelectNumb() {
        return selectNumb;
    }

//    public void setBookList(ArrayList a){
//        this.books = a;
//    }
    public static void addBook(bookDTO book) {
        books.add(book);
    }
    public static ArrayList<bookDTO> getBookList(){
        return books;
    }

}
