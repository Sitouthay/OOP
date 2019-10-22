import java.util.Date;

public class Main {
    public static void main(String[] args) {
        demo1();
        // demo2();
    }

    public static void demo1() {
        SV y1 = new SV("Nguyen Van A", new Date("11/11/2000"), 4.1);
        y1.hienThi();
    }

    // public static void demo2() {
    //     Date y = new Date();
    //     int yearnow = y.getYear() + 1900;
    //     System.out.println(yearnow);
    // }
}