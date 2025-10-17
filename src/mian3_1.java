public class mian3_1 {
    public static void main(String[] args) {

        sayhello();
        sumNumbers(3, 9);
        cheackEvenadd(10);
        printGrade(85);
    }

    public static void sayhello() {
        System.out.println("안녕하세요! 자바 공부 시작!");
    }

    public static void sumNumbers(int a, int b) {
        int add = a+b;
        
        System.out.println(add);
    }

    public static void cheackEvenadd(int c) {
        int num= c;

        if (num % 2 == 0) { 
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
    }

    public static void printGrade(int score) {
        if (score >= 90) {
            System.out.println("a학점");
        } else if (score >= 80) {
            System.out.println("b학점");
        } else if (score >= 70) {
            System.out.println("c학점");
        } else {
            System.out.println("f학점");
        } 
    } 
    
}
