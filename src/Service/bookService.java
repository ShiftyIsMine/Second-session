package Service;

import java.util.ArrayList;

import View.bookView;
import dto.bookDTO;
import java.util.Scanner;

public class bookService {
//    public ArrayList<bookDTO> booksList = new ArrayList<bookDTO>();
    bookDTO dto = new bookDTO();
    bookView view = new bookView();
    Scanner sc = new Scanner(System.in);
    public void selectMenu(int a){
        ArrayList<bookDTO> bookList = dto.getBookList();
//        int a=dto.getSelectNumb();
        switch(a){
            case 1:
                try {
                    view.selectFirst();
                    bookDTO newBook = new bookDTO();
                    view.add1();
                    newBook.setTitle(sc.next());
                    view.add2();
                    newBook.setArthur(sc.next());
                    view.add3();
                    newBook.setPublisher(sc.next());
                    view.add4();
                    newBook.setPrice(sc.nextInt());
                    view.add5();
                    newBook.setIsbn(sc.next());
                    bookDTO.addBook(newBook);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                view.secondPrint();
                int index = sc.nextInt();
                if (bookList == null || index < 0 || index >= bookList.size()) {
                    view.selectNull();
                } else {
                    bookDTO book = bookList.get(index);
                    view.printBookInfo(book);
                }
                break;
            case 3:
                view.thirdPrint();
                int indexs = sc.nextInt();
                if (bookList == null || indexs < 0 || indexs >= bookList.size()) {
                    view.selectNull();
                } else {
                    bookDTO book = bookList.get(indexs);
                    view.modifiedInfo();
                    String field = sc.next();
                    view.modifiedInfo2();
                    String value = sc.next();
                    switch (field) {
                        case "title":
                            book.setTitle(value);
                            break;
                        case "arthur":
                            book.setArthur(value);
                            break;
                        case "publisher":
                            book.setPublisher(value);
                            break;
                        case "price":
                            book.setPrice(Integer.parseInt(value));
                            break;
                        case "isbn":
                            book.setIsbn(value);
                            break;
                        default:
                            view.wrongSelec();
                            return;
                    }
                    view.modifiedInfo3();
                }
                break;
            case 4:
                view.fourthPrint();
                int indexss = sc.nextInt();
                if (bookList == null || indexss < 0 || indexss >= bookList.size()) {
                    view.selectNull();
                } else {
                    bookDTO removedBook = bookList.remove(indexss);
                    System.out.println("도서가 삭제되었습니다: " + removedBook.getTitle());
                }
                break;
            case 5:
                view.booksAllPrint();
                break;
            default :
                view.wrongSelec();
        }
    }
}
