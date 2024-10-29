package View;

import Service.bookService;
import dto.bookDTO;

import java.util.ArrayList;

public class bookView{

    public void menuPrint(){
        System.out.println("Shifty 도서 정보시스템입니다. \n반갑습니다.");
        System.out.println("------------------------------------------------");
        System.out.println("|1. 도서 정보 추가 |");
        System.out.println("|2. 도서 조회     |");
        System.out.println("|3. 도서 정보 수정 |");
        System.out.println("|4. 도서 정보 삭제 |");
        System.out.println("|5. 도서 정보 전체 출력 |");
        System.out.println("------------------------------------------------");
        System.out.print("메뉴를 선택하세요. ");
    }
    public void add1(){
        System.out.println("1. 도서명을 입력하세요.");
    }
    public void add2(){
        System.out.println("2. 저자를 입력하세요.");
    }
    public void add3(){
        System.out.println("3. 출판사를 입력하세요.");
    }
    public void add4(){
        System.out.println("4. 가격을 입력하세요.");
    }
    public void add5(){
        System.out.println("5. ISBN을 입력하세요.");
    }

    public void booksAllPrint(){
        System.out.println("5. 도서 정보 전체 출력");
        ArrayList<bookDTO> bookList = bookDTO.getBookList();
        if (bookList == null || bookList.isEmpty()) {
            System.out.println("아무것도 없는데요?");
        }
        for (bookDTO book : bookList) {
            System.out.println("------------------------------------------------");
            System.out.println("|도서명 : " + book.getTitle());
            System.out.println("|저자명 : " + book.getArthur());
            System.out.println("|출판사 : " + book.getPublisher());
            System.out.println("|가격   : " + book.getPrice());
            System.out.println("|ISBN  : " + book.getIsbn());
            System.out.println("------------------------------------------------");
        }
    }
    public void printBookInfo(bookDTO book) {
        System.out.println("------------------------------------------------");
        System.out.println("|도서명 : " + book.getTitle());
        System.out.println("|저자명 : " + book.getArthur());
        System.out.println("|출판사 : " + book.getPublisher());
        System.out.println("|가격   : " + book.getPrice());
        System.out.println("|ISBN  : " + book.getIsbn());
        System.out.println("------------------------------------------------");
    }

    public void secondPrint(){
        System.out.print("2. 도서 조회를 선택하셨습니다.\n");
        System.out.print("조회할 도서의 번호를 입력하세요: ");
    }

    public void thirdPrint(){
        System.out.print("3. 도서 정보 수정을 선택하셨습니다.\n");
        System.out.print("수정할 도서의 번호를 입력하세요: ");
    }

    public void fourthPrint(){
        System.out.print("4. 도서 정보 삭제를 선택하셨습니다.\n");
        System.out.print("삭제할 도서의 번호를 입력하세요: ");
    }

    public void selectNull(){
        System.out.println("없는 걸 선택하시면?");
    }
    public void selectFirst(){System.out.print("1. 도서 정보 추가를 선택하셨습니다.\n");}
    public void modifiedInfo(){
        System.out.println("수정할 정보를 선택하세요 (title/arthur/publisher/price/isbn): ");
    }
    public void modifiedInfo2(){
        System.out.println("새로운 값을 입력하세요: ");
    }
    public void modifiedInfo3(){
        System.out.println("도서 정보가 수정되었습니다.");
    }
    public void wrongSelec(){
        System.out.print("이 세상에 없는 걸 선택하셨습니다. 다시 선택하세여");
    }
}
