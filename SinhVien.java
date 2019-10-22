public class SinhVien {
    private String hoTen;
    private HPLyThuyet hp1;
    private HPThucHanh hp2;

    public SinhVien(String hoTen, HPLyThuyet hp1, HPThucHanh hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public float tinhDTB() {
        float dtb = (hp1.tinhDiem()*hp1.soTinChi + hp2.tinhDiem()*hp2.soTinChi)/(hp1.soTinChi + hp2.soTinChi);
        return dtb;
    }

    public void hienThi(){
        System.out.println("Ten : " + hoTen + ", HP1 : " + hp1.tinhDiem() + ", HP2 : " + hp2.tinhDiem() + ", DTB : " + tinhDTB());
    }

    
}