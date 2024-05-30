package Bai1;

import java.util.ArrayList;

public class TinhTong {

    public static void TinhTong(ArrayList<Double> list) {
        double tong = 0;
        System.out.println("\nDanh Sách Các Số");
        for ( double s : list ) {
            System.out.print(s + "  ");
            tong += s;
        }

        System.out.println("\n\nTổng của các số vừa đưa vào là : " + tong);
    }
}
