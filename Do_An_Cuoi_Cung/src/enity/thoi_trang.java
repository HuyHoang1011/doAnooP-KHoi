package enity;

import java.util.Scanner;

public class thoi_trang extends san_pham implements tinh_giaTri {
    private String kieuDang;

    public thoi_trang(){

    }

    public thoi_trang(String kieuDang,String maSP, String tenSP, String thuongHieu, String mauSP, float giaSP){
        super(maSP, tenSP, thuongHieu, mauSP, giaSP);
        this.kieuDang = kieuDang;
    }

    @Override
    public void nhap(){
        boolean a=false;
        super.nhap();
        do{
            System.out.println("Moi nhap kieu dang cua giay");
            kieuDang = new Scanner(System.in).nextLine();
            if(kieuDang.equalsIgnoreCase("co cao") || kieuDang.equalsIgnoreCase("co thap")){
                a=true;
            }else{
                System.out.println("Vui long nhap lai!");
            }
        } while(a!= true);
        // do {
        //     System.out.println("Moi ban nhap gioi tinh: ");
        //     gioiTinh = sc.nextLine();
        //     if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nu")) {
        //         a = true;
        //     }
        // } while (a != true);
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Kieu dang: " + kieuDang);
    }

    @Override
    public String typeShoes(){
        return "THOI TRANG";
    }

    @Override
    public float Thue(){
        return 0.6f*super.getGiaSP();
    }

    @Override
    public float GiaBan(){
        return super.getGiaSP() + Thue();
    }

    @Override 
    public float ThanhTien(){
        return GiaBan();
    }
}
