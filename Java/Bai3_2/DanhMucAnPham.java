package Bai3_2;


import java.util.LinkedList;
import java.util.Scanner;
public class DanhMucAnPham {
    private  LinkedList<SachThamKhao> sachTk = new LinkedList<>();
    private LinkedList<TapChi> tapC = new LinkedList<>();
// phương thức lấy danh sách sách tham khảo
    public LinkedList<SachThamKhao> getListSachThamKhao(){
        return sachTk;
    }
// phương thức lấy danh sách tap chí
    public LinkedList<TapChi> getListTapChi(){
        return tapC;
    }
// phương thức thêm sách tham khảo vào danh sách
    public void AddItemSachThamKhao(SachThamKhao e){
        sachTk.add(e);
    }
// phương thức thêm tạp chí vào danh sách
    public void AddItemTapChi(TapChi e){
        tapC.add(e);
    }
// phương thức xuất danh sách sách tham khảo ra màn hình console
    public void XuatDsSachThamKhao(){
        for(SachThamKhao tk: sachTk){
            tk.inAp();
        }
    }

// phương thức xuất danh sách tạp chí ra màn hình console
    public void XuatDsTapChi(){
        for(TapChi tc: tapC){
            tc.inAp();
        }
    }
    
// phương thức so sánh hai loại ấn phẩm có cùng loại hay không
    public static boolean SoSanhHaiAnPham(AnPham a, AnPham b)
    {
        if(a.getTacGia().compareToIgnoreCase(b.getTacGia())==0 && a.loatAnPham().compareToIgnoreCase(b.loatAnPham())==0 )
        {
            return true;
        }
        return false;
    }
// phương thức tính tổng tiền các loại ấn phẩm 
    public  double TongTienAnPham(){
        double kq=0;
        for(SachThamKhao tk: sachTk){
            kq+=tk.getGiaTien();
        }
        for(TapChi tc: tapC){
            kq+=tc.getGiaTien();
        }
        return kq;
    }
// phương thức tìm sách tham khảo có chương sách nhiều trang nhất
    public void TimSachThamKhaoNhieuChuongNhat(){
        int max=0;
        for(SachThamKhao tk: sachTk){
            if(tk.getSoTrangCuaChuong()>max)
            max=tk.getSoTrangCuaChuong();
        }
    }
// tìm tạp chí theo tên
    public boolean TimTapChi(String ten)
    {
        for(TapChi tc: tapC){
            if(tc.getTenTapChi().compareToIgnoreCase(ten)==0)
            return true;
        }
        return false;
    }
// In danh sách các tạp chí xuất bản cách đây 1 năm
    public void DanhSachTapChiXuatBanCachDay1Nam(){
            for(TapChi tc: tapC){
                if(tc.soNamXbChoDenNay()==1)
                {
                    tc.inAp();
                }
            }
    }
// Sắp xếp danh mục ấn phẩm giảm dần theo năm xuất bản
    public void sapXepGiamDanTheoNamXb(){
        int n=sachTk.size();
       for(int i=0; i<n-1;i++)
        for(int j=i+1; j<n;j++){
            if(sachTk.get(i).getNamXB()<sachTk.get(j).getNamXB())
            {
                SachThamKhao t=sachTk.get(i);
                sachTk.set(i, sachTk.get(j));
                sachTk.set(j, t);
            }
        }
        int n1=tapC.size();
       for(int i=0; i<n1-1;i++)
        for(int j=i+1; j<n1;j++){
            if(tapC.get(i).getNamXB()<tapC.get(j).getNamXB())
            {
                TapChi t=tapC.get(i);
                tapC.set(i, tapC.get(j));
                tapC.set(j, t);
            }
        }
    }
// sắp xếp tăng dần theo tiêu đề
    public void sapXepTangDanTheoTieuDe(){
        int n=sachTk.size();
       for(int i=0; i<n-1;i++)
        for(int j=i+1; j<n;j++){
            if((sachTk.get(i).getTieuDe()).compareToIgnoreCase(sachTk.get(j).getTieuDe())>0)
            {
                SachThamKhao t=sachTk.get(i);
                sachTk.set(i, sachTk.get(j));
                sachTk.set(j, t);
            }
        }
        int n1=tapC.size();
       for(int i=0; i<n1-1;i++)
        for(int j=i+1; j<n1;j++){
            if((tapC.get(i).getTieuDe()).compareToIgnoreCase(tapC.get(j).getTieuDe())>0)
            {
                TapChi t=tapC.get(i);
                tapC.set(i, tapC.get(j));
                tapC.set(j, t);
            }
        }
    }
// Thống kê số lượng ấn phẩm theo năm
    public void ThongKeSoLuongAnPhamTheoNam()
    {
        sapXepGiamDanTheoNamXb();
        System.out.print("\nNam phat hanh va so sach tham khao cua tung nam");
        int flag=0,count;
        int n=sachTk.size();
        for(int i=flag; i<n;i++)
        {
             count=1;
            for(int j=flag+1; j<n;j++){
                if(sachTk.get(i).getNamXB()==sachTk.get(j).getNamXB())
                count++;
                else break;
            }
            System.out.print("\nNam "+sachTk.get(flag).getNamXB()+" co "+count+" sach tham khao");
            flag+=count;
        }
        System.out.print("\nNam phat hanh va so tap chi cua tung nam");
       
        int n1=tapC.size();
        flag=0;
        for(int i=flag; i<n1;i++)
        {
             count=1;
            for(int j=flag+1; j<n1;j++){
                if(tapC.get(i).getNamXB()==tapC.get(j).getNamXB())
                count++;
                else break;
            }
            System.out.print("\nNam "+tapC.get(flag).getNamXB()+" co "+count+" tap chi");
            flag+=count;
        }

    }
    // Nhập sách tham khảo
    public  SachThamKhao  inputSTK(){
        Scanner scanner= new Scanner(System.in);
        String tieuDeSach;
        int soTrang;
        int namXuatBan;
        String tacGia;
        double giaTien;
        String linhVuc;
        String tieuDeChuong;
        int soTrangTrongChuong;
        System.out.print("\nNhap tieu de cua sach: ");
        tieuDeSach=scanner.nextLine();
        System.out.print("\nNhap so trang cua sach: ");
        soTrang=scanner.nextInt();
        System.out.print("\nNhap nam xuat ban cua sach: ");
        namXuatBan=scanner.nextInt();
        System.out.print("\nNhap tac gia cua sach: ");
        scanner.nextLine();
        tacGia=scanner.nextLine();
        System.out.print("\nNhap gia tien cua sach: ");
        giaTien=scanner.nextDouble();
        System.out.print("\nNhap linh vuc cua sach: ");
        scanner.nextLine();
        linhVuc=scanner.nextLine();
        System.out.print("\nNhap tieu de chuong cua sach: ");
        tieuDeChuong=scanner.nextLine();
        System.out.print("\nNhap so trang cua chuong: ");
        soTrangTrongChuong=scanner.nextInt();
        ChuongSach c= new ChuongSach(tieuDeChuong, soTrangTrongChuong);
        SachThamKhao a=new SachThamKhao(tieuDeSach, soTrang, namXuatBan, tacGia, giaTien, linhVuc, c);
        return a;
    }
// Nhập tạp chí
    public  TapChi  inputTapChi(){
        Scanner scanner= new Scanner(System.in);
        String tieuDeSach;
        int soTrang;
        int namXuatBan;
        String tacGia;
        double giaTien;
        String tenTapChi;
        System.out.print("\nNhap tieu de cua tap chi: ");
        tieuDeSach=scanner.nextLine();
        System.out.print("\nNhap so trang cua tap chi: ");
        soTrang=scanner.nextInt();
        System.out.print("\nNhap nam xuat ban cua tap chi: ");
        namXuatBan=scanner.nextInt();
        System.out.print("\nNhap tac gia cua tap chi: ");
        scanner.nextLine();
        tacGia=scanner.nextLine();
        System.out.print("\nNhap gia tien cua tap chi: ");
        giaTien=scanner.nextDouble();
        System.out.print("\nNhap ten cua tap chi: ");
        scanner.nextLine();
        tenTapChi=scanner.nextLine();
        TapChi a=new TapChi(tieuDeSach, soTrang, namXuatBan, tacGia, giaTien, tenTapChi);
        return a;
    }
    
    
     
}
