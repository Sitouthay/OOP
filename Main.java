public class Main {
    public static void main(String[] args) {
        
        SinhVien sv[] = new SinhVien[3];
        sv[0] = new SinhVien("Nguyen A", new HPLyThuyet("TinLT", 2, 7, 8, 8), new HPThucHanh("TinTH", 3, 6, 7 ,6));
        sv[1] = new SinhVien("Nguyen B", new HPLyThuyet("HoaLT", 2, 5, 8, 5), new HPThucHanh("TinTH", 3, 5, 7 ,8));
        sv[2] = new SinhVien("Nguyen C", new HPLyThuyet("DienLT", 2, 5, 5, 10), new HPThucHanh("TinTH", 3, 6, 4 ,6));

        for(int i = 0 ; i < 3 ; ++i){
            sv[i].hienThi();
        }
    }
}