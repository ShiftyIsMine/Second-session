package Controller;

import Service.bookService;
import View.bookView;
import dto.bookDTO;

import java.util.Scanner;

public class bookController {
    public static void main(String[] args){
        Scanner select = new Scanner(System.in);
        bookView view = new bookView();
        bookService service = new bookService();
        bookDTO dto = new bookDTO();
        while(true) {
            view.menuPrint();
            try {
                dto.setNumb(select.nextInt());
            } catch (Exception e) {
                view.wrongSelec();
                select.nextLine();
            }
            try {
                service.selectMenu(dto.getSelectNumb());
            } catch (Exception e) {
                view.wrongSelec();
                select.nextLine();
            }
        }
    }
}
