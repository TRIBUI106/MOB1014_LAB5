package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        int option;
        Data data = new Data();

        do {
//          PRINT OUT MENU
            System.out.println("+============= MENU =============+");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Thoát chương trình");
            System.out.println("+============= MENU =============+");
            System.out.print("Nhập lựa chọn của bạn: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Nhập danh sách họ và tên");
                    data.addData();
                    break;
                case 2:
                    System.out.println("Xuất danh sách vừa nhập");
                    data.printData();
                    break;
                case 3:
                    System.out.println("Xuất danh sách ngẫu nhiên");
                    data.shuffleData();
                    break;
                case 4:
                    System.out.println("Sắp xếp giảm dần và xuất danh sách");
                    data.sortReverse();
                    break;
                case 5:
                    System.out.println("Tìm và xóa họ tên nhập từ bàn phím");
                    data.deleteData();
                    break;
                case 6:
                    System.out.println("\n\n\t BẠN ĐÃ THOÁT CHƯƠNG TRÌNH\n");
                    System.exit(0);
            }

        } while (option != 0);
    }
}
