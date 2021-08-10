import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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


    }
}

