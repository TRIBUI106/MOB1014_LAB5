package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 extends TinhTong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();

//        TinhTong tinh = new TinhTong();

        while ( true ) {

            try {
                System.out.print("Nhập số: ");
                double x = sc.nextDouble();
                list.add(x);
            } catch (Exception err) {
                System.out.println("Vui lòng chỉ nhập số ! ");
            }

            System.out.print("Nhập thêm số ? [ Y / N ] : ");
            String option = sc.next();
            option.toUpperCase();
            if ( option.equals("N") ) {
                TinhTong.TinhTong(list);
                System.exit(0);
            } if ( option.equals("Y") ) {
                continue;
            }

        }

    }



}
