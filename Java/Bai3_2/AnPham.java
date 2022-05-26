package Bai3_2;

public abstract class AnPham {
    protected String tieuDe;
    protected int soTrang;
    protected int namXuatBan;
    protected String tacGia;
    protected double giaTien;
// hàm tạo của lớp ấn phẩm
    public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien){

        this.tieuDe=tieuDe;
        this.soTrang=soTrang;
        this.namXuatBan=namXuatBan;
        this.tacGia=tacGia;
        this.giaTien=giaTien;

    }
// phương thức lấy tiêu đề
    public String getTieuDe(){return this.tieuDe;}
// phương thức lấy số trang
    public int getSoTrang(){return this.soTrang;}
// phương thức lấy năm xuất bản
    public int getNamXB(){return this.namXuatBan;}
// phương thứ lấy tên tác giả
    public String getTacGia(){return this.tacGia;}
// phương thức lấy giá tiền
    public double getGiaTien(){return this.giaTien;}
// phương thức lấy thông tin loại ấn phẩm
    public abstract String loatAnPham();
// phương thức kiểm tra loại ấn phẩm có xuất bản cách đây 10 năm không
    public abstract boolean tapChiXbCachDay10Nam();
//phương thức in ấn phẩm ra màn mình console
    public abstract void inAp();
}
