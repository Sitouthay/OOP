
public class Diem {
    private String tenHocPhan;
    private float soTinChi;
    private float chuyenCan, giuaKy, cuoiKy;

    public Diem(String tenHocPhan, float soTinChi, float chuyenCan, float giuaKy, float cuoiKy){
        this.tenHocPhan = tenHocPhan;
        setSoTinChi(soTinChi);
        setChuyenCan(chuyenCan);
        setGiuaKy(giuaKy);
        setCuoiKy(cuoiKy);
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public float getSoTinChi() {
        return soTinChi;
    }

    public float getChuyenCan() {
        return chuyenCan;
    }

    public float getGiuaKy() {
        return giuaKy;
    }

    public float getCuoiKy() {
        return cuoiKy;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public void setChuyenCan(float chuyenCan){
        if(chuyenCan <= 10){
            this.chuyenCan = chuyenCan;
        }else {
            throw new IllegalArgumentException("Diem ChuyenCan ko the hon 10");
        }
    }

    public void setCuoiKy(float cuoiKy){
        if(cuoiKy <= 10){
            this.cuoiKy = cuoiKy;
        }else {
            throw new IllegalArgumentException("Diem cuoiKy ko the hon 10");
        }
    }

    public void setGiuaKy(float giuaKy){
        if(giuaKy <= 10){
            this.giuaKy = giuaKy;
        }else {
            throw new IllegalArgumentException("Diem GiuaKy ko the hon 10");
        }
    }

    public void setSoTinChi(float soTinChi){
        if(soTinChi <= 4){
            this.soTinChi = soTinChi;
        }else {
            throw new IllegalArgumentException("soTinChi chi 1-4");
        }
    }
    public float tinhDiem() {
        float x = (float) (chuyenCan * 0.1 + giuaKy * 0.2 + cuoiKy * 0.7);
        return x;
    }

}