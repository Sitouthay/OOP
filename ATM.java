public class ATM{
    private String soTK;
    private double soDu;

    public ATM(String stk, double sdu){
        this.soTK = stk;
        this.soDu = sdu;
    }
    public String laySTK(){
        return soTK;
    }
    public double laySDU(){
        return soDu;
    }
    public String toString(){
        return "soTK: " + soTK + "\nsoDu: " + soDu;
    }
    public void napTien(double st){
        soDu = soDu + st;
    }
    public boolean rutTien(double st){
        if(soDu > st){
            soDu = soDu - st;
            return true;
        }else return false;
    }
    public boolean chuyenTien(ATM tk, double st){
        if(soDu > st){
            soDu = soDu - st - (st * 0.01);
            tk.soDu = tk.soDu + st;
            return true;
        }
        else return false;
    }
}