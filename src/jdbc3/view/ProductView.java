package jdbc3.view;

import jdbc3.entity.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductView {
    public String title="Product List";
    public void printProduct(ArrayList<Product> proList) {
        for(Product product: proList) {
            System.out.printf("- 제품번호 : %s\n",product.getSerial());
            System.out.printf("- 제품명 : %s\n",product.getName());
            System.out.printf("- 재고량 : %d\n",product.getStock());
            System.out.printf("- 단가 : %s\n",product.getPrice());
            System.out.printf("- 제조업체 : %s\n\n",product.getManufacturer());
        }
    }

    public void printHead(){
        System.out.println("************************************");
        System.out.println("*********   "+title+"   *********");
        System.out.println("************************************");
    }

    public void printFooter(){
        System.out.println("************************************");
        System.out.println("=========    Print End     =========");
        System.out.println("************************************");
    }
}
