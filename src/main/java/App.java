public class App {
    public static void main (String[] args){
        String str;
        str="Data Type";
        System.out.println(str);

        final double PI=3.14;
        System.out.println(PI);

        System.out.println("Name\tDOB");
        short s=10;
        int i =100;
        long l =100000000;
        long l2 =100L;

        float f =3.1f;
        double d = 5.7;

        char c='a';
        char c2='5';
        char c3='6';

        boolean b=true;
        boolean b2=false;

        //Integer a =100;
       // Integer b=200;
       // System.out.println("a="+ a +"b="+b);
        //swap(a,b);
        //System.out.println("a="+a+"b="+b);

      SimpleSeason sse = SimpleSeason.SPRING;
       System.out.println(sse);
    }

    static void swap(Integer a, Integer b){
        Integer tmp =a;
        a=b;
        b=tmp;
        System.out.println("a="+a+"b="+b);
    }
}
