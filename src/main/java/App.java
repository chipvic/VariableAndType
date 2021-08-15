import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//=============================================================================================
        //BAITH4
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

//=============================================================================================
        //BAITH3

        // Bài 1:
        System.out.println("Nhập năm: ");
        int year = HomeWork.nhapSoInt();
        BaiTH3.leapYear(year);

        // Bài 2:
        // Câu a:
        System.out.println("Nhập ngày: ");
        int d = HomeWork.nhapSoInt();
        System.out.println("Nhập tháng: ");
        int m = HomeWork.nhapSoInt();
        System.out.println("Nhập năm: ");
        int y = HomeWork.nhapSoInt();
        BaiTH3.checkDay(d, m, y);


//=============================================================================================
        // BAITH2

        // Bài 1:
        System.out.println("Nhập số bất kỳ từ 1 đến 9");
        int num = HomeWork.nhapSoInt();
        BaiTH2.readNum(num);

        // Bài 2:
        System.out.println("Nhập chữ cái bất kỳ");
        String text = HomeWork.nhapChuoi();
        BaiTH2.lowerUpperChar(text);

        //Bài 3:
        System.out.println("Giải phương trình bậc 1:");
        System.out.println("Nhập a: ");
        double a1 = HomeWork.nhapSoDouble();
        System.out.println("Nhập b: ");
        double b1 = HomeWork.nhapSoDouble();
        BaiTH2.giaiPT1(a1, b1);

        //Bài 4:
        System.out.println("Giải phương trình bậc 2:");
        System.out.println("Nhập a: ");
        double a2 = HomeWork.nhapSoDouble();
        System.out.println("Nhập b: ");
        double b2 = HomeWork.nhapSoDouble();
        System.out.println("Nhập c: ");
        double c2 = HomeWork.nhapSoDouble();
        BaiTH2.giaiPT2(a2, b2, c2);

        //Bài 5:
        System.out.println("Nhập 4 số nguyên:");
        int so1 = HomeWork.nhapSoInt();
        int so2 = HomeWork.nhapSoInt();
        int so3 = HomeWork.nhapSoInt();
        int so4 = HomeWork.nhapSoInt();
        BaiTH2.min(so1, so2, so3, so4);

        // Bài 6:
        int[] arr1 = BaiTH2.nhapMang();
        BaiTH2.upSort(arr1);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Bài 7:
        System.out.println("Nhập số Km cần đi: ");
        int km = HomeWork.nhapSoInt();
        BaiTH2.receipt(km);

        //Bài 8:
        System.out.println("Nhập tháng: ");
        int month = HomeWork.nhapSoInt();
        System.out.println("Nhập năm: ");
        int yyyy = HomeWork.nhapSoInt();
        BaiTH2.days(month, yyyy);

        //Bài 9:
        System.out.println("Nhập 3 cạnh của tam giác: ");
        int canh1 = HomeWork.nhapSoInt();
        int canh2 = HomeWork.nhapSoInt();
        int canh3 = HomeWork.nhapSoInt();
        BaiTH2.typeTriangle(canh1, canh2, canh3);

//=============================================================================================

        //HOMEWORK
        // Bài 4
        System.out.println("Bài 4:");
        System.out.println("Nhập năm sinh của bạn:");
        int year1 = HomeWork.nhapSoInt();
        HomeWork.tinhTuoi(year1);

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
        System.out.println("Nhập số z: ");
        double z = HomeWork.nhapSoInt();
        HomeWork.soSanh(x, z);


    }

}

