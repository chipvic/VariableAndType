public class BaiTH3 extends HomeWork {
    public static void main(String[] args) {

        // Bài 1:
        System.out.println("Nhập năm: ");
        int year = nhapSoInt();
        leapYear(year);

        // Bài 2:



    }

    static void leapYear(int a) {
        if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Năm không nhuận");
        }
    }
}
