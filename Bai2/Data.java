package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Data {
    public Scanner sc = new Scanner(System.in);

    public ArrayList<String> data = new ArrayList<String>();

    public void addData() {
        String input;
        while ( true ) {
            System.out.print("Nhập tên : ");
            input = sc.nextLine();
            data.add(input);
            System.out.print("Nhập nữa ? [ ~ / K ]: ");
            String YesNo = sc.nextLine();
            if(YesNo.equals("K")) {
                exitData();
                break;
            } else if (YesNo.equals("k")) {
                exitData();
                break;
            }
        }
    }

    public void printData() {
        if (data.isEmpty()) {
            System.out.println("Thí chủ chưa nhập tên nào !");
        } else {
            System.out.println("Các tên vừa nhập là: ");
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
        }
    }

    public void printDataForEach() {
        System.out.println("Các tên vừa nhập là: ");
        for ( String s : data ) {
            System.out.println(s);
        }
    }

    public void shuffleData() {
        if (data.isEmpty()) {
            System.out.println("Thí chủ chưa nhập tên nào !");
        } else {
            Collections.shuffle(data);
            System.out.println("Đã đổi vị trí ngẫu nhiên");
            printData();
        }
    }

    // Sort from _a_ to _z_ then reverse
    public void sortReverse() {
        Collections.sort(data);
        Collections.reverse(data);
        printData();
    }

    public void deleteData() {
        System.out.println("Nhập tên cần xoá: ");
        System.out.print(">> ");
        String findName = sc.nextLine();
        if ( data.indexOf(findName) == -1 ) {
            System.out.println("Không có tên này trong danh sách");
        } else {
            data.remove(findName);
            System.out.println("Đã xóa " + findName + " ra khỏi danh sách");
        }
    }

    // Exit of option
    public void exitData() {
        System.out.println("Thoát");
        System.out.println("\n");
    }
}
