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
        System.out.println("Giải phương trình bậc 1:");
        System.out.println("Nhập a: ");
        double a1 = nhapSoDouble();
        System.out.println("Nhập b: ");
        double b1 = nhapSoDouble();
        giaiPT1(a1,b1);

        //Bài 4:
        System.out.println("Giải phương trình bậc 2:");
        System.out.println("Nhập a: ");
        double a2 = nhapSoDouble();
        System.out.println("Nhập b: ");
        double b2 = nhapSoDouble();
        System.out.println("Nhập c: ");
        double c2 = nhapSoDouble();
        giaiPT2(a2,b2,c2);

        //Bài 5:
        System.out.println("Nhập 4 số nguyên:");
        int so1 = nhapSoInt();
        int so2 = nhapSoInt();
        int so3 = nhapSoInt();
        int so4 = nhapSoInt();
        min(so1, so2, so3, so4);

        // Bài 6:
        int[] arr = nhapMang();
        upSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

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
        int canh1 = nhapSoInt();
        int canh2 = nhapSoInt();
        int canh3 = nhapSoInt();
        typeTriangle(canh1, canh2, canh3);


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

    static void giaiPT2(double a, double b, double c){
        double delta = ((b*b)-(4*a*c));
        if (delta <0){
            System.out.println("Phương trình vô nghiệm");
        } else{
            if (delta == 0){
                double x = (-b/(2*a));
                System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ x);
            } else{
                double x1= ((-b + Math.sqrt(delta))/(2*a));
                double x2= ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Phương trình có nghiệm x1 = " + x1);
                System.out.println("Phương trình có nghiệm x1 = " + x2);
            }
        }
    }

    static void min(int a, int b, int c, int d) {
        int x = Math.min(a, b);
        int y = Math.min(c, d);
        int z = Math.min(x, y);
        System.out.println("Min là: " + z);
    }

    static int[] nhapMang(){
        int n;
        System.out.println("Nhập mảng gồm bao nhiêu số nguyên: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    static void upSort(int[] arr) {
        int n = arr.length;
        int tmp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }

            }
        }

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
