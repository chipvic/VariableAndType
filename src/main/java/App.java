import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //BaiTH3
        // Bài 4
        System.out.println("Bài 4:");
        System.out.println("Nhập năm sinh của bạn:");
        int year = HomeWork.nhapSoInt();
        HomeWork.tinhTuoi(year);

        // Bài 5
        System.out.println("Bài 5:");
        System.out.println("Nhập số a: ");
        double a = HomeWork.nhapSoDouble();
        System.out.println("Nhập số b: ");
        double b = HomeWork.nhapSoDouble();
        HomeWork.tinhTong(a, b);
        HomeWork.tinhHieu(a, b);
        HomeWork.tinhTich(a, b);
        HomeWork.tinhThuong(a, b);

        //Bài 6
        System.out.println("Bài 6:");
        System.out.println("Nhập tên sản phẩm: ");
        String name = HomeWork.nhapChuoi();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quality = HomeWork.nhapSoInt();
        System.out.println("Nhập đơn giá sản phẩm: ");
        int price = HomeWork.nhapSoInt();

        System.out.println("Tên sản phẩm là: " + name);
        int tien = HomeWork.tinhTien(quality, price);
        System.out.println("Tổng tiền sản phẩm là: " + tien);
        double thue = HomeWork.tinhThue(tien);
        System.out.println("Thuế 10% là: " + thue);

        // Bài 7
        System.out.println("Bài 7:");
        System.out.println("Nhập điểm Toán: ");
        double toan = HomeWork.nhapSoDouble();
        System.out.println("Nhập điểm Lý: ");
        double ly = HomeWork.nhapSoDouble();
        System.out.println("Nhập điểm Hóa: ");
        double hoa = HomeWork.nhapSoDouble();
        double avg = HomeWork.trungBinh(toan, ly, hoa);
        System.out.println("Điểm trung bình của học sinh là:" + avg);

        // Bài 8
        System.out.println("Bài 8:");
        System.out.println("Nhập bán kính đường tròn: ");
        double r = HomeWork.nhapSoDouble();
        double c = HomeWork.chuVi(r);
        double s = HomeWork.dienTich(r);
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
        double x = HomeWork.nhapSoInt();
        System.out.println("Nhập số y: ");
        double y = HomeWork.nhapSoInt();
        HomeWork.soSanh(x, y);

 //======================================================================


        //BaiTH4
        //Bài 1:
        // Câu a:

        int[] n = BaiTH2.nhapMang();
        if (BaiTH4.isSymmetry(n)) {
            System.out.println("Số đối xứng");
        } else {
            System.out.println("Số không đối xứng");
        }
        // Câu b:
        System.out.println("Nhập số cần kiểm tra: ");
        int num1 = HomeWork.nhapSoInt();
        if (BaiTH4.isSquareNum(num1)) {
            System.out.println("Là số Chính Phương");
        } else {
            System.out.println("Không là số Chính Phương");
        }

        // Bài 2:
        //Câu d:
        System.out.println("Nhập số cần tính giai thừa");
        int num2 = HomeWork.nhapSoInt();
        int fac = BaiTH4.factorial(num2);
        System.out.println("Giai thừa là: " + fac);

        //Câu e:
        System.out.println("Nhập số cần tính tổng các giai thừa");
        int num3 = HomeWork.nhapSoInt();
        int sumFac = BaiTH4.sumFactorial(num3);
        System.out.println("Tổng các giai thừa là: " + sumFac);

        // Bài 4:
        System.out.println("Nhập số nguyên lớn hơn 0 và nhỏ hơn 50");
        int num4 = HomeWork.nhapSoInt();
        if ((num4 <= 0) || (num4 >= 50)) {
            System.out.println("Số nhập không hợp lệ");
        } else {
            int sumPri = BaiTH4.sumPrimeNum(num4);
            System.out.println("Tổng các số nguyên tố nhỏ hơn n: " + sumPri);
        }

        // Bài 5:
        System.out.println("Nhập số nguyên n: ");
        int num5 = HomeWork.nhapSoInt();
        int swap = BaiTH4.swapNum(num5);
        System.out.println("Số sau khi đổi: " + swap);

        // Bài 6:
        BaiTH4.findNum();

        // Bài 7:
        System.out.println("Tìm ước chung lớn nhất");
        System.out.println("Nhập số nguyên dương thứ nhất : ");
        int num6 = HomeWork.nhapSoInt();
        System.out.println("Nhập số nguyên dương thứ hai: ");
        int num7 = HomeWork.nhapSoInt();
        int ucln = BaiTH4.uCLN(num6, num7);
        System.out.format("Ước chung lớn nhất của %d và %d là %d", num6, num7, ucln);

        // Bài 8:
        //Cho 1 số N, trả về số fibonacci thứ N, trong đó chuỗi đó như sau: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        //Mỗi phần tử trong chuỗi là tổng của 2 phần tử liền trước nó.
        System.out.println("Nhập n càn tình Finbonacci: ");
        int num8 = HomeWork.nhapSoInt();
        int fib = BaiTH4.fibonacci(num8);
        System.out.format("F(%d) = %d", num8, fib);
    }

}

