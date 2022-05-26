package Bai3_2;

public class ChuongSach {
    private String tieuDe;
    private int soTrangTrongChuong;

    // Hàm tạo của lớp chương sách
    public ChuongSach(String tieuDe, int soTrangTrongChuong)
    {
        this.tieuDe=tieuDe;
        this.soTrangTrongChuong=soTrangTrongChuong;
    }
    // phương thức lấy tiêu đề của chương sách
    public String getTieuDe(){return tieuDe;}
    // phương thức lấy số trang của chương sách
    public int getSoTrangCuaChuong(){return soTrangTrongChuong;}
}
