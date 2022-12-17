package enity;

public class quan_ly extends nhan_vien {
    public quan_ly(){

    }
    public quan_ly(String maNhanVien, float luongTieuChuan, String hoTen, String gioiTinh, int nam, String diaChi, String SDT){
        super(maNhanVien,luongTieuChuan,hoTen,gioiTinh,nam,diaChi,SDT);
    }

    @Override
    public float TienLuong(){
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.1f);
    }

    @Override
    public void xuat(){
        super.xuat();
    }
}
