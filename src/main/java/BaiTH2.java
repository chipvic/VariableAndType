import java.util.Scanner;

public class BaiTH2 extends HomeWork {
    public static void main(String[] args) {
        // Bài 1:
        System.out.println("Nhập số bất kỳ từ 1 đến 9");
        int num = nhapSoInt();
        readNum(num);

        // Bài 2:
        System.out.println("Nhập chữ cái bất kỳ");
        String text = nhapChuoi();
        lowerUpperChar(text);

        //Bài 3:
        System.out.println("Nhập a: ");
        double a1 = nhapSoDouble();
        System.out.println("Nhập b: ");
        double b1 = nhapSoDouble();
        giaiPT1(a1,b1);

        //Bài 4:
        //Bài 5:
        System.out.println("Nhập 4 số nguyên:");
        int so1 = nhapSoInt();
        int so2 = nhapSoInt();
        int so3 = nhapSoInt();
        int so4 = nhapSoInt();
        min(so1, so2, so3, so4);

        // Bài 6:
        // Bài 7:
        System.out.println("Nhập số Km cần đi: ");
        int km = nhapSoInt();
        receipt(km);

        //Bài 8:
        System.out.println("Nhập tháng: ");
        int month = nhapSoInt();
        System.out.println("Nhập năm: ");
        int year = nhapSoInt();
        days(month, year);

        //Bài 9:
        System.out.println("Nhập 3 cạnh của tam giác: ");
        int c1 = nhapSoInt();
        int c2 = nhapSoInt();
        int c3 = nhapSoInt();
        typeTriangle(c1, c2, c3);


    }

    static void readNum(int a) {
        switch (a) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Số nằm ngoài từ 1 đến 9");
        }
    }

    static void lowerUpperChar(String a) {
        String tmp = a;
        String str = new String(tmp);
        if (a.equals(str.toLowerCase())) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
    static void giaiPT1(double a, double b){
        if((a==0) && (b==0)){
            System.out.println("Phương trình vô số nghiệm");
        } else{
            if ((a==0) && (b!=0)){
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm x: "+(-b/a));
            }
        }
    }

    static void min(int a, int b, int c, int d) {
        int x = Math.min(a, b);
        int y = Math.min(c, d);
        int z = Math.min(x, y);
        System.out.println("Min là: " + z);
    }

    static void receipt(int a) {
        double total = 0;
        if (a <= 1) {
            System.out.println("Tiền taxi là: 15000vnđ");
        } else {
            if (a <= 5) {
                total = ((a - 1) * 13500) + 15000;
                System.out.println("Tiền taxi là: " + total);
            } else {
                if (a < 120) {
                    total = ((a - 5) * 11000) + (4 * 13500) + 15000;
                    System.out.println("Tiền taxi là: " + total);
                } else {
                    total = (((a - 5) * 11000) + (4 * 13500) + 15000) * 0.9;
                    System.out.println("Tiền taxi là: " + total);
                }
            }
        }
    }

    static void days(int a, int b) {
        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println("Tháng có 31 ngày");
        } else {
            if (a == 4 || a == 6 || a == 9 || a == 11) {
                System.out.println("Tháng có 30 ngày");
            } else {
                if (((b % 100 == 0) && (b % 400 != 0)) || (b % 4 != 0)) {
                    System.out.println("Tháng có 28 ngày");
                } else {
                    System.out.println("Tháng có 29 ngày");
                }

            }
        }

    }

    static void typeTriangle(int a, int b, int c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Không phải tam giác");
        } else {
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều");
            } else {
                if ((a == b) || (b == c) || (c == a)) {
                    System.out.println("Tam giác cân");
                } else {
                    if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                        System.out.println("Tam giác vuông");
                    }
                }
            }
        }

    }
}
