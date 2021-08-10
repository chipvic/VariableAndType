public class BaiTH3 extends HomeWork {
    public static void main(String[] args) {

        // Bài 1:
        System.out.println("Nhập năm: ");
        int year = nhapSoInt();
        leapYear(year);

        // Bài 2:
        // Câu a:
        System.out.println("Nhập ngày: ");
        int d = nhapSoInt();
        System.out.println("Nhập tháng: ");
        int m = nhapSoInt();
        System.out.println("Nhập năm: ");
        int y = nhapSoInt();
        checkDay(d,m,y);
        

    }

    static void leapYear(int a) {
        if ((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0)) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Năm không nhuận");
        }
    }

    static void checkDay(int a, int b, int c){
        if((a<=0)||(a>31)){
            System.out.println("Ngày không hợp lệ");
        } else{
            if ((a>30)&&(b == 4 || b == 6 || b == 9 || b == 11)){
                System.out.println("Ngày không hợp lệ");
            } else{
                if ((a==29)&&(b==2)&&(((c % 100 == 0) && (c % 400 != 0)) || (c % 4 != 0))){
                    System.out.println("Ngày không hợp lệ");
                } else {
                    System.out.println("Ngày: "+a+" Tháng: "+b+ " Năm: " +c);
                }

            }
        }
    }


}
