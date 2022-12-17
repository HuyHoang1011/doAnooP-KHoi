package enity;

public class ban_hang extends nhan_vien {
    
    /**
     * 
     */
    public ban_hang(){
        //sao xoa duoc
        // co hoi thi s 
    }

    public ban_hang(String maNhanVien, float luongTieuChuan, String hoTen, String gioiTinh, int nam, String diaChi, String SDT){
        super(maNhanVien,luongTieuChuan,hoTen,gioiTinh,nam,diaChi,SDT);
    }

    
    @Override
    public float TienLuong() {
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.04f);
    }

    @Override
    public void xuat(){
        super.xuat();
    }

    
}
