import java.util.Date;

public class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;

    public SV(String hoTen, Date ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String layHo(){
        return hoTen;
    }

    public int getTuoi(){
        int year = new Date().getYear() + 1900;
        int yob = ngaySinh.getYear() + 1900;
        int tuoi = year - yob;
        return tuoi;
    }

    public String layXepLoai() {
        String b = "";
        if(dtb >= 8) {
            b = "Gioi";
        }else if(dtb < 8 && dtb >= 7) {
            b = "Kha";
        }else if(dtb < 7 && dtb >= 5) {
            b = "Trung Binh";
        }else if(dtb < 5) {
            b = "Yeu";
        }return b;
    }

    public String layHo(String ht) {
        String Ho;
        this.hoTen = ht;
        Ho = ht.substring(0, ht.indexOf(" "));
        return Ho;
    }

    public String layTen(String ht) {
        String Ten;
        this.hoTen = ht;
        Ten = ht.substring(ht.lastIndexOf(" ") +1);
        return Ten;
    }

    public String layDem(String ht) {
        String Dem;
        this.hoTen = ht;
        Dem = ht.substring(ht.indexOf(" "), ht.lastIndexOf(" "));
        return Dem;
    }

    public void hienThi() {
        System.out.println("Ten : " + hoTen + "\nTuoi : " + getTuoi() + "\nDTB : " + dtb + "\nXep loai : " + layXepLoai() + "\nHo la : " +
                            layHo(hoTen) +  "\nDem la : " + layDem(hoTen) + "\nTen la : " + layTen(hoTen)) ;
    }
}


    // @Override
    // public String toString() {
    //     return String.format("Ten : " + hoTen + "\n" + "Tuoi : " + getTuoi());
    // }
