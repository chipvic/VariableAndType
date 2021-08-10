public class BaiTH4 {

    public static boolean isSymmetry(int[] a) {
        int b = a.length;
        boolean result = true;
        for (int i = 0; i < (b / 2); i++) {
            for (int j = (b - 1) - i; j > (b / 2); j--) {
                if (a[i] != a[j]) {
                    result = false;
                }
                break;
            }
        }
        return result;

    }

    public static boolean isSquareNum(int a) {
        double b = Math.sqrt(a);
        boolean result = true;
        if (b % 1 != 0) {
            result = false;
        }
        return result;
    }

    public static int factorial(int a) {
        int gt = 1;
        for (int i = 1; i <= a; i++) {
            gt = gt * i;
        }
        return gt;
    }

    public static int sumFactorial(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + factorial(i);
        }
        return sum;
    }

    static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    static int sumPrimeNum(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (isPrimeNum(i)) {
                sum = sum + i;
            }
        }
        return sum;

    }

    static int swapNum(int a) {
        int tmp = 0;
        int swap = 0;
        do {
            tmp = a % 10;
            a = a / 10;
            swap = (swap * 10) + tmp;
        } while (a > 0);
        return swap;
    }


}


