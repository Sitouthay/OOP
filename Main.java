public class Main{
    public static void main(String [] args){
        ATM tk1 = new ATM("1111", 2000);
        ATM tk2 = new ATM("2222", 1000);
            tk1.rutTien(500);
            tk2.napTien(900);
            tk1.chuyenTien(tk2, 500);
        System.out.println("tk1 : " + tk1 + "VND");
        System.out.println("tk2 : " + tk2 + "VND");
    }
}