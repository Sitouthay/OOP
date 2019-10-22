public abstract class DiemHP {
    
    protected String tenHP;
    protected float soTinChi;

    public DiemHP(String tenHP, float soTinChi) {
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public float getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(float soTinChi) {
        this.soTinChi = soTinChi;
    }

    public abstract float tinhDiem();

}