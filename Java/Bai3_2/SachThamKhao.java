package Bai3_2;

public class SachThamKhao extends AnPham{

    
    private String linhVuc;
    private ChuongSach chuongSach;
// Hàm tạo sách tham khảo
    public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String linhVuc, ChuongSach chuongSach) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.linhVuc=linhVuc;
        this.chuongSach=chuongSach;
    }
    @Override
// Kiểm tra loại ấn phẩm
    public String loatAnPham() {
        
        return "Sach tham khao";
    }
    @Override
// Kiểm tra xem tạp chí có xuất bản cách đây 10 năm hay không
    public boolean tapChiXbCachDay10Nam() {    
        return false;
    }
// Lấy thông tin lĩnh vực của sách tham khảo
    public String getLinhVuc(){return linhVuc;}
// Lấy thông tin số trang của chương sách
    public int getSoTrangCuaChuong(){return chuongSach.getSoTrangCuaChuong();}
// Lấy thông tin tiêu đề của chương
    public String getTieuDeCuaChuong(){return chuongSach.getTieuDe();}
    @Override
//  In thông tin sách tham khảo ra màn hình console
    public void inAp() {
        System.out.print("\n===============**************===================");
        System.out.print("\n\t\tLinh vuc: "+linhVuc);
        System.out.print("\n\t\tTieu de: "+tieuDe);
        System.out.print("\n\t\tSo trang: "+soTrang);
        System.out.print("\n\t\tTieu de chuong: "+getTieuDeCuaChuong());
        System.out.print("\n\t\tSo trang cua chuong: "+getSoTrangCuaChuong());
        System.out.print("\n\t\tNam xuat ban: "+namXuatBan);
        System.out.print("\n\t\tTac gia: "+tacGia);
        System.out.print("\n\t\tGia tien: "+giaTien);

    }
    
}
