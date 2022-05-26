package Bai3_2;

import java.time.LocalDate;
import java.time.Period;

public class TapChi extends AnPham{
    
    private String tenTapChi;

// Hàm tạo của lớp tạp chí
    public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String tenTapChi) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.tenTapChi=tenTapChi;
        
    }
    @Override
// Phương thức kiểm tra loại ấn phẩm
    public String loatAnPham() {
        
        return "Tap chi";
    }
// Phương thức lấy năm xuất bản cho đến nay   
    public int soNamXbChoDenNay(){
        LocalDate dob = LocalDate.of(getNamXB(), 0, 0);
        LocalDate curDate = LocalDate.now();  
        Period period = Period.between(dob, curDate);  
         return period.getYears();
         
    }
    @Override
// Phương thức kiểm tra năm xuất bản có cách đây 10 năm hay không
    public boolean tapChiXbCachDay10Nam() {
        
        
        if(soNamXbChoDenNay()>=10)
        return true;
        return false;
    }

// Phương thức lấy tên tạp chí
    public String getTenTapChi(){return tenTapChi;}
    @Override
// Phương thức in thông tin tạp chí ra màn hình console
    public void inAp(){
        System.out.print("\n===============**************===================");
        System.out.print("\n\t\tTen tap chi: "+tenTapChi);
        System.out.print("\n\t\tTieu de: "+tieuDe);
        System.out.print("\n\t\tSo trang: "+soTrang);
        System.out.print("\n\t\tNam xuat ban: "+namXuatBan);
        System.out.print("\n\t\tTac gia: "+tacGia);
        System.out.print("\n\t\tGia tien: "+giaTien);

    }
    
    
}
