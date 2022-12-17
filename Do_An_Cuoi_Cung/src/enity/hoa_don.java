package enity;

import java.util.Scanner;

public class hoa_don extends san_pham {
    private String maHD;
    private String maKH;

    public hoa_don(){
    }

    public hoa_don(String maHD, String maKH){
        this.maHD = maHD;
        this.maKH = maKH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Moi ban nhap ma hoa don: ");
            maHD = sc.nextLine();
        }while(Integer.parseInt(maHD)<0);

        do{
            System.out.println("Moi ban nhap ma khach hang: ");
            maKH = sc.nextLine();
        }while(Integer.parseInt(maKH)<0);
    }

    public void xuat(){
        System.out.println("Ma hoa don:" + maHD);
        System.out.println("Ma khach hang:" + maKH);
    }
}
//12 50 600k
//42 100 4200k
//20 500 10000k
//26 200 5200k