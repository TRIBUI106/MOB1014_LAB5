package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Control {

    public ArrayList<SanPham> SP = new ArrayList<SanPham>();

    public void addSanPham() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(">> Nhập tên và đơn giá của sản phẩm");
            System.out.print(">> Tên : ");
            String addName = sc.nextLine();
            if (addName.isEmpty() || addName.equals(" ") || addName == null) {
                System.out.println("Đã nhập xong, thoát.");
                break;
            }
            System.out.print(">> Giá : ");
            double addPrice = sc.nextDouble();
            SP.add(new SanPham(addName, addPrice));
        } while (true);
    }

    public void showSanPham() {
        System.out.println("Danh Sách Sản Phẩm Hiện Có");
        System.out.println(" Tên\t\t Giá");
        for (SanPham sanPham : SP) {
//            System.out.println(sanPham.tenSp + " " + sanPham.donGia);
            System.out.printf(" %s\t\t\t %.0f\n",sanPham.tenSp,sanPham.donGia);
        }
    }


    public void sortReverseSanPham() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(SP, comp);
        Collections.reverse(SP);
        showSanPham();
    }

    public String xuatSanPham(SanPham sp){
        return sp.tenSp + sp.donGia;
    }

    public void findIfExist(String findSp) {
        for( SanPham sp : SP){
            int stt = this.xuatSanPham(sp).indexOf(findSp);
//            System.out.println(stt);
            int count = 0;
            count += 1;
            if ( stt == 0) {
                System.out.println("Đã tìm thấy sản phẩm, đang xóa sản phẩm...");
                SP.remove(count);
                break;
            }
        }
    }

    public void findAndDeleteSanPham() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên sản phẩm cần tìm : ");
            System.out.print(">> ");
            String findSp = sc.nextLine();
            findIfExist(findSp);
        } catch (Exception e) {
            System.out.println("Bạn đã nhập sai ! Chỉ nhập các sản phẩm");
        }
    }


    public void printAverageDonGia() {

        double sum = 0;
        double count = 0;

        for (SanPham sanPham : SP) {
            sum += sanPham.donGia;
            count += 1;
        }

        double Average = sum / count;

        System.out.println("Giá trung bình của các sản phẩm là : ");
        System.out.printf(">> %.0f", Average);

    }

}
