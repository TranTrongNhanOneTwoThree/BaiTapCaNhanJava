package Bai3_2;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI {
	static JFrame f = new JFrame("DANH MỤC ẤN PHẨM");
	
//Phương thức hiển thị danh mục ấn phẩm với giao diện đồ họa thông 
	public static  void HienThi(DanhMucAnPham a) {
		

		String colunm[] = { "TÊN ẤN PHẨM", "TIÊU ĐỀ", "SỐ TRANG", "NĂM XUẤT BẢN", "TÁC GIẢ","GIÁ TIỀN","THỂ LOẠI","TIÊU ĐỀ CHƯƠNG","SỐ TRANG CỦA CHƯƠNG"};

		DefaultTableModel model = new DefaultTableModel(colunm, 0);
		JTable table = new JTable(model);
		table.setBounds(30, 40, 200, 300);
		for(TapChi tc: a.getListTapChi()) {
					Object row[] = {tc.getTenTapChi(),
                        tc.getTieuDe(),
                        tc.getSoTrang(),
                        tc.getNamXB(),
                        tc.getTacGia(),
                        tc.getGiaTien(),
                        tc.loatAnPham(),
					};
					model.addRow(row);

			}
        for(SachThamKhao stk: a.getListSachThamKhao()){
            Object row[] ={
                stk.getLinhVuc(),
                stk.getTieuDe(),
                stk.getSoTrang(),
                stk.getNamXB(),
                stk.getTacGia(),
                stk.getGiaTien(),
                stk.loatAnPham(),
                stk.getTieuDeCuaChuong(),
                stk.getSoTrangCuaChuong(),

            };
            model.addRow(row);

        }
		JScrollPane sp = new JScrollPane(table);
		f.add(sp);
		f.setSize(1000, 500);
		f.setVisible(true);

	}
// phương thức main để chạy chương trình
    public static void main(String[] args){
        DanhMucAnPham a= new DanhMucAnPham();
        TapChi tc=a.inputTapChi();
        TapChi tc1=a.inputTapChi();
        SachThamKhao stk=a.inputSTK();
        SachThamKhao stk1=a.inputSTK();
        a.AddItemTapChi(tc);
        a.AddItemTapChi(tc1);
        a.AddItemSachThamKhao(stk);
        a.AddItemSachThamKhao(stk1);
        HienThi(a);
    }
    
}
