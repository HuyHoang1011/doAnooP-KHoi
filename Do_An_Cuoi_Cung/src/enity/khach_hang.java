package enity;

import java.util.Scanner;

public class khach_hang extends human {
    private String maKhachHang;

    public khach_hang(){
        
    }

    public khach_hang(String maKhachHang, String hoTen, String gioiTinh, String namSinh, String diaChi, String SDT){
        super(hoTen, gioiTinh, namSinh, diaChi, SDT);
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    
    @Override 
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap ma khach hang: ");
        maKhachHang = new Scanner(System.in).nextLine();
    }

    @Override 
    public void xuat(){
        super.xuat();
        System.out.println("Ma Khach Hang: " + maKhachHang);
    }
}
