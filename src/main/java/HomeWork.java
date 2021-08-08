import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // Bài 4
        System.out.println("Bài 4:");
        System.out.println("Nhập năm sinh của bạn:");
        int year = nhapSoInt();
        tinhTuoi(year);

        // Bài 5
        System.out.println("Bài 5:");
        System.out.println("Nhập số a: ");
        double a = nhapSoDouble();
        System.out.println("Nhập số b: ");
        double b = nhapSoDouble();
        tinhTong(a, b);
        tinhHieu(a, b);
        tinhTich(a, b);
        tinhThuong(a, b);

        //Bài 6
        System.out.println("Bài 6:");
        System.out.println("Nhập tên sản phẩm: ");
        String name = nhapChuoi();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quality = nhapSoInt();
        System.out.println("Nhập đơn giá sản phẩm: ");
        int price = nhapSoInt();

        System.out.println("Tên sản phẩm là: " + name);
        int tien = tinhTien(quality, price);
        System.out.println("Tổng tiền sản phẩm là: " + tien);
        double thue = tinhThue(tien);
        System.out.println("Thuế 10% là: " + thue);

        // Bài 7
        System.out.println("Bài 7:");
        System.out.println("Nhập điểm Toán: ");
        double toan = nhapSoDouble();
        System.out.println("Nhập điểm Lý: ");
        double ly = nhapSoDouble();
        System.out.println("Nhập điểm Hóa: ");
        double hoa = nhapSoDouble();
        double avg = trungBinh(toan, ly, hoa);
        System.out.println("Điểm trung bình của học sinh là:" + avg);

        // Bài 8
        System.out.println("Bài 8:");
        System.out.println("Nhập bán kính đường tròn: ");
        double r = nhapSoDouble();
        double c = chuVi(r);
        double s = dienTich(r);
        System.out.println("Chu vi là: " + c);
        System.out.println("Diện tích là: " + s);

        // Bài 9
        System.out.println("Bài 9:");
        System.out.println("Nhập biển số xe của bạn: ");
        int[] arr = new int[5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            Scanner myNumber = new Scanner(System.in);
            int tmp = myNumber.nextInt();
            arr[i] = tmp;
            k = k + tmp;
        }
        int point = k % 10;
        System.out.println("Xe của bạn " + point + " nút");

        // Bài 10
        System.out.println("Bài 10:");
        System.out.println("Nhập số x: ");
        double x = nhapSoInt();
        System.out.println("Nhập số y: ");
        double y = nhapSoInt();
        soSanh(x, y);


    }

    public static int nhapSoInt() {
        Scanner myInt = new Scanner(System.in);
        int numInt = myInt.nextInt();
        return numInt;
    }

    ;

    static double nhapSoDouble() {
        Scanner myDouble = new Scanner(System.in);
        double numDoub = myDouble.nextDouble();
        return numDoub;
    }

    ;

    public static String nhapChuoi() {
        Scanner prodName = new Scanner(System.in);
        String text = prodName.nextLine();
        return text;
    }

    ;

    static void tinhTuoi(int year) {
        int age;
        age = 2021 - year;
        System.out.println("Tuổi của bạn là:" + age);
    }

    ;

    static void tinhTong(double a, double b) {
        double tong = a + b;
        System.out.println("Tổng là: " + tong);
    }

    ;

    static void tinhHieu(double a, double b) {
        double hieu = a - b;
        System.out.println("Hiệu là: " + hieu);
    }

    ;

    static void tinhTich(double a, double b) {
        double tich = a * b;
        System.out.println("Tích là: " + tich);
    }

    ;

    static void tinhThuong(double a, double b) {
        double thuong = a / b;
        System.out.println("Thương là: " + thuong);
    }

    ;

    static int tinhTien(int a, int b) {
        int tongTien = a * b;
        return tongTien;
    }

    ;

    static double tinhThue(int a) {
        double tienThue = (a / 100) * 10;
        return tienThue;
    }

    ;

    static double trungBinh(double a, double b, double c) {
        double tb = (a + b + c) / 3;
        return tb;
    }

    ;

    static double chuVi(double a) {
        double c = 2 * a * Math.PI;
        return c;
    }

    ;

    static double dienTich(double a) {
        double s = a * a * Math.PI;
        return s;
    }

    static void soSanh(double a, double b) {
        if (a < b) {
            System.out.println("Min: " + a);
            System.out.println("Max: " + b);
        } else {
            if (a > b) {
                System.out.println("Min: " + b);
                System.out.println("Max: " + a);
            } else {
                System.out.println("Hai số bằng nhau");
            }
        }

    }
}

