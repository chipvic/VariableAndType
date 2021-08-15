public class BaiTH4 {

    public static boolean isSymmetry(int[] a) {
        int b = a.length;
        boolean result = true;
        for (int i = 0; i <= (b / 2); i++) {
            for (int j = (b - 1)-i; j >= (b / 2); j--) {
                if (a[i] != a[j]) {
                    result = false;
                    return result;
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

    public static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static int sumPrimeNum(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (isPrimeNum(i)) {
                sum = sum + i;
            }
        }
        return sum;

    }

    public static int swapNum(int a) {
        int tmp = 0;
        int swap = 0;
        do {
            tmp = a % 10;
            a = a / 10;
            swap = (swap * 10) + tmp;
        } while (a > 0);
        return swap;
    }

    public static void findNum() {
        int j, k;
        for (int i = 10; i < 100; i++) {
            j = i / 10;
            k = i % 10;
            if (j * k == 2 * (j + k)) {
                System.out.format("%d ,", i);
            }
        }
    }

    public static int uCLN(int a, int b) {
        int tmp;
        if (a >= b) {
            tmp = b;
        } else {
            tmp = a;
        }
        for (int i = tmp; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                return i;
            }

        }
        return -1;
    }

    public static int fibonacci(int num) {
        int a = 1;
        int b = 1;
        int temp;

        while (num > 0) {
            temp = a;
            a = a + b;
            b = temp;
            num--;
        }

        return b;
    }

}


