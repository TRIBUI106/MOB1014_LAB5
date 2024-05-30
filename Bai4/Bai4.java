package Bai4;

import java.util.HashMap;
import java.util.Map;

public class Bai4 {
    public static void main(String[] args) {
//        Gọi map = Map mới
        Map<String, String> map = new HashMap<String, String>();

//        Insert Data cho map
        map.put("PC08044","Ly Chi Thanh");
        map.put("PC08122","Nguyen Thanh Dat");
        map.put("PC08503","Nguyen Nhat Tien");
        map.put("PC09014","Nguyen Van Vi");

//        y1b4l5
        System.out.println("\n" + "Tên của SV có mã số PC08503 là : ");
        System.out.println(">> " + map.get("PC08503"));


//        y2b4l5
        System.out.println("\n" + "Tên của SV có mã số PC08503 là : ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Nguyen Thanh Dat")) {
                System.out.println(entry.getKey());
            }
        }


//        y3b4l5
        System.out.println("\n" + "Kiểm tra tên Nguyen Van Binh");
        if (!map.containsKey("Nguyen Van Binh")) {
            System.out.println("Không tìm thấy tên Nguyen Van Binh");
        } else {
            System.out.println("Tìm thấy tên Nguyen Van Binh");
        }

    }
}
