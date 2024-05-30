package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        Control ctrl = new Control();
        int option;

        do {
//          PRINT OUT MENU
            System.out.println("+============= MENU =============+");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Thoát Chương Trình");
            System.out.println("+============= MENU =============+");
            System.out.print("Nhập lựa chọn của bạn: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    ctrl.addSanPham();
                    System.out.println();
                    break;
                case 2:
                    ctrl.sortReverseSanPham();
                    System.out.println();
                    break;
                case 3:
                    ctrl.findAndDeleteSanPham();
                    System.out.println();
                    break;
                case 4:
                    ctrl.printAverageDonGia();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\n\n\t BẠN ĐÃ THOÁT CHƯƠNG TRÌNH\n");
                    System.exit(0);
            }

        } while (option != 0);
    }
}
