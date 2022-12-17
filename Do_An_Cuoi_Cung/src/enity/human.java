package enity;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class human {
    private String hoTen;
    private String gioiTinh;
    private int namSinh;
    private String diaChi;
    private String SDT;

    public human() {

    }

    public human(String hoTen, String gioiTinh, int nam, String diaChi, String SDT) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = nam;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        SDT = SDT;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("Moi ban nhap ho ten: ");

        hoTen = sc.nextLine();

        boolean a = false;

        do {
            System.out.println("Moi ban nhap gioi tinh: ");
            gioiTinh = sc.nextLine();
            if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nu")) {
                a = true;
            }
        } while (a != true);

        do {
            System.out.println("Moi ban nhap nam sinh: ");
            namSinh = Integer.parseInt(sc.nextLine());
        } while (namSinh > localDate.getYear() || namSinh <= 1900);
        // t ep kieu o day ne
        System.out.println("Moi ban nhap dia chi: ");
        diaChi = sc.nextLine();

        System.out.println("Moi ban nhap so dien thoai: ");
        SDT = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Gioi Tinh: " + gioiTinh);
        System.out.println("Nam Sinh: " + namSinh);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("So Dien Thoai: " + SDT);
    }
    //khong co dau ngoac {} 
    public String toString(){
        return  "Ho Ten: " + hoTen + "Gioi Tinh: " + gioiTinh + "Nam Sinh: " + namSinh + "Dia Chi: " + diaChi + "So Dien Thoai: " + SDT; 
    }
}
