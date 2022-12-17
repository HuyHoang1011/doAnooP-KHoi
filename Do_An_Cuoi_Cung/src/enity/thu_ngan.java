package enity;

public class thu_ngan extends nhan_vien {
    public thu_ngan(){
        //loi gi day
    }

    public thu_ngan(String maNhanVien, float luongTieuChuan, String hoTen, String gioiTinh, int nam, String diaChi, String SDT){
        super(maNhanVien,luongTieuChuan,hoTen,gioiTinh,nam,diaChi,SDT);
    }

    @Override
    public float TienLuong(){
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.06f);
    }
    
    @Override
    public void xuat(){
        super.xuat();
    }
}
