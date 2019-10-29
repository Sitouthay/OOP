public class HPThucHanh extends DiemHP {

    private float db1, db2, db3;

    public HPThucHanh(String tenHP, float soTinChi, float db1, float db2, float db3) {
        super(tenHP, soTinChi);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }

    public float tinhDiem(){
        float diem = (db1 + db2 + db3)/3;
        return diem;
    }

    @Override
    public String toString() {
        return "DTH : " + tinhDiem();
    }

    

}