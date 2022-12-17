package enity;


import java.util.Scanner;

public abstract class nhan_vien extends human {
    private String maNhanVien;
    private float luongTieuChuan;

   public nhan_vien(){
    
   }

    public nhan_vien(String maNhanVien, float luongTieuChuan, String hoTen, String gioiTinh, int nam, String diaChi, String SDT){
        super(hoTen, gioiTinh, nam, diaChi, SDT);
        this.maNhanVien = maNhanVien;
        this.luongTieuChuan = luongTieuChuan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }


    public float getLuongTieuChuan() {
        return luongTieuChuan;
    }

    public void setLuongTieuChuan(float luongTieuChuan) {
        this.luongTieuChuan = luongTieuChuan;
    }



    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do{
            System.out.println("Moi ban nhap Ma Nhan Vien: ");
            maNhanVien = sc.nextLine();
        }while(Integer.parseInt(maNhanVien)<0);
        do{
            System.out.println("Moi ban nhap Luong co ban");
            luongTieuChuan = Float.parseFloat(sc.nextLine());
        }while(luongTieuChuan<0);
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Ma Nhan Vien: " + maNhanVien);
        // System.out.println("Cap Bac: " + capBac);
        System.out.println("Luong tieu chuan: " + luongTieuChuan);
        System.out.println("Tong tien luong: " + TienLuong());
    }
    public abstract float TienLuong();

    public String toString(){
        super.toString(); 
        return "Ma Nhan Vien" + maNhanVien + "Luong Tieu Chuan" + luongTieuChuan + "Tong tien luong" + TienLuong(); 
    }
}

