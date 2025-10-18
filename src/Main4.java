/** 4단계 - 반복문 for/while */

/** 
 * 1. for문 기본 구조
 * for (초기식; 조건식; 증감식) {
 *      실행문;}
 * 초기식: 변수 시작값 , 조건식: 조건이 true인 동안 반복, 증감식: 매 반복마다 값 변화 (i++ 등)
 */


 public class Main4 {
    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++) { //i++은 i=i+1의 줄임말
            System.out.println(i);
        }

        a();
        b();
        c();
    }

    public static void a() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("합계" + sum);
    }

    public static void b() {
        for(int i = 1; i<= 10; i++){
            if (i%2 ==0) {
                System.out.println(i);
            }
        }
    }

    public static void c() {
        int i = 1;
        while ( i <= 5) {
            System.out.println(i);
            i++;
        }
    } //for문이랑 다르게 촉기값, 조건, 증감이 분리돼 있어.
    // 반복 구조 같지만 "언제 멈출지 직접 제어할 때" 더 자주 쓴다.
}
