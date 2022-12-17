package enity;

import java.util.Scanner;

public class cao_got extends san_pham implements tinh_giaTri {
    private String chieuCao;
    Scanner sc = new Scanner(System.in);
    public cao_got(){

    }

    public cao_got(String chieuCao,String maSP, String tenSP, String thuongHieu, String mauSP, float giaSP){
        super(maSP, tenSP, thuongHieu, mauSP, giaSP);
        this.chieuCao = chieuCao;
    }

    public String getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override 
    public void xuat(){
        super.xuat();
        System.out.println("Chieu cao cua giay: " + chieuCao);
    }

    @Override
    public void nhap(){
        super.nhap();
        do{
            System.out.println("Moi ban nhap chieu cao giay: ");
            chieuCao = sc.nextLine();
            if(Integer.parseInt(chieuCao) > 15){
                System.out.println("Qua cao! Vui long nhap lai");
            }
        }while(Integer.parseInt(chieuCao) > 15);
    }

    @Override
    public String typeShoes(){
        return "CAO GOT";
    }

    @Override 
    public float Thue(){
        return 0.2f * super.getGiaSP();
    }

    @Override
    public float GiaBan(){
        return super.getGiaSP() + Thue()*2;
    }

    @Override
    public float ThanhTien(){
        return GiaBan();
    }

 


}
