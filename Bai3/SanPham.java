package Bai3;

public class SanPham {
    public String tenSp;
    public double donGia;

//    Constructor
    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    public SanPham() {
        this.tenSp = null;
        this.donGia = 0;
    }
}
