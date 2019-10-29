
public class SinhVien extends Diem {
    private String hoTen;
    private float dm1, dm2;

    public SinhVien(String tenHocPhan, float soTinChi, float chuyenCan, float giuaKy, float cuoiKy,
                    String hoTen, float dm1, float dm2) {
        super(tenHocPhan, soTinChi, chuyenCan, giuaKy, cuoiKy);
        this.hoTen = hoTen;
        this.dm1 = dm1;
        this.dm2 = dm2;
    }

    public SinhVien(String hoTen, float dm1, float dm2){
        super("", 0, 0, 0, 0);
        this.hoTen = hoTen;
        this.dm1 = dm1;
        this.dm2 = dm2;
    }

	public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDm1() {
        return dm1;
    }

    public float getDm2() {
        return dm2;
    }

    public void hienThi(){
        System.out.print(hoTen + ", " + dm1 + ", " + dm2);
    }

    public float tinhDTB(){
        float x = (dm1 + dm2) / 2 ;
        return x;
    }

    public void setDm1(float dm1) {
        this.dm1 = dm1;
    }

    public void setDm2(float dm2) {
        this.dm2 = dm2;
    }

    public String toString() {
        return String.format("" + hoTen + " co DTB la  " + tinhDTB());
    }

    
}