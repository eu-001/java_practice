public class Main4_1 {
    public static void main(String[] args) {
        one();
        two();
        three();
        four(3);
        five();
    }

    public static void one() {
        for (int i =1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void two() {
        int sum = 0;

        for(int i = 1; i <=100; i++) {
            sum = sum + i ;  // sum += i ;

        }

        System.out.println("합계:"+sum);
    }

    public static void three() {
        int sum = 0;
        //2부터 2씩 증가로 for문을 구성하면 if 없어도 됨
        // for ( int i =2 ; i<=50; i +=2) ~~~ sum +=i; 
        for(int i = 1; i<=50; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("합계"+sum);
    }

    public static void four(int x) {
        for (int i =1 ; i <=9 ; i++) {
             System.out.println("3x"+ i + "=" + x*i); // (x + "x" + i + "=" + ( x*i));
        }
    }

    public static void five() {
        int i =1;
        while (i <= 5) { 
           //  System.out.println("*".repeat(i));는 자바 11에서만 지원
           for (int j = 0; j < i; j++) System.out.print("*");
           System.out.println();
            i++;
        }
    }
}
