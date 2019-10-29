public class Main {
    public static void main(String[] args) {
        // demo1();
        str3sv();
    }

    // public static void demo1() {
    //     Diem d1 = new Diem("Toan", 3, 5, 5, 5);
    //     d1.tinhDiem();
    //     System.out.println(d1);

    //     Diem d2 = new Diem("Tin", 2, 5, 9, 10);
    //     System.out.println(d2);
        
    // }

    public static void str3sv(){
        SinhVien sv[] = new SinhVien[3];
        sv[0] = new SinhVien("Nguyen Thu", 7, 8);
        sv[0].tinhDTB();
        System.out.println(sv[0]);
        
    }
}