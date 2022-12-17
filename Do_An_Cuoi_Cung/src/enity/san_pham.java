package enity;

import java.util.Scanner;

public class san_pham {
    private String maSP;
    private String tenSP;
    private String thuongHieu;
    private String mauSP;
    private float giaSP;

    public san_pham() {

    }

    public san_pham(String maSP, String tenSP, String thuongHieu, String mauSP, float giaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.thuongHieu = thuongHieu;
        this.mauSP = mauSP;
        this.giaSP = giaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getMauSP() {
        return mauSP;
    }

    public void setMauSP(String mauSP) {
        this.mauSP = mauSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public float ThanhTien() {
        return 1;
    }

    public float Thue() {
        return 1;
    }

    public String typeShoes() {
        return "";
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap thuong hieu: ");
        thuongHieu = sc.nextLine();
        System.out.println("Nhap mau san pham");
        mauSP = sc.nextLine();
        System.out.println("Nhap gia san pham");
        giaSP = Float.parseFloat(sc.nextLine());
    }

    public void xuat(){
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + maSP);
        System.out.println("Thuong hieu san pham: " + maSP);
        System.out.println("Mau san pham: " + maSP);
        System.out.println("Gia san pham: " + maSP);
    }
    
}
