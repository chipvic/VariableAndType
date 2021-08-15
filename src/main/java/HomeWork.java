import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork {

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

