public class HPLyThuyet extends DiemHP {

    private float CC, GK, CK;

    public HPLyThuyet(String tenHP, float soTinChi, float cC, float gK, float cK) {
        super(tenHP, soTinChi);
        CC = cC;
        GK = gK;
        CK = cK;
    }

    public float tinhDiem(){
        float diem = (float) (CC * 0.1 + GK * 0.2 + CK * 0.7);
        return diem;
    }

    @Override
    public String toString() {
        return "DLT : " + tinhDiem();
    }
}