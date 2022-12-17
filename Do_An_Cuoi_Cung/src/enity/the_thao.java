package enity;

import java.util.Scanner;

public class the_thao extends san_pham implements tinh_giaTri{
    private String linh_vuc;


    public the_thao(){

    }

    public the_thao(String linh_vuc,String maSP, String tenSP, String thuongHieu, String mauSP, float giaSP){
        super(maSP, tenSP, thuongHieu, mauSP, giaSP);
        this.linh_vuc = linh_vuc;
    }


    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi ban nhap linh vuc the thao: ");
        linh_vuc = new Scanner(System.in).nextLine();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Linh vuc the thao: " + linh_vuc);  
    }

    @Override 
    public String typeShoes(){
        return "THE THAO";
    }

    @Override
    public float Thue(){
        return 0.4f*super.getGiaSP();
    }

    @Override
    public float GiaBan() {
        // TODO Auto-generated method stub
        return super.getGiaSP() + Thue();
    }
    
    @Override 
    public float ThanhTien(){
        return GiaBan();
    }
}
