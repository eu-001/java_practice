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

        d();
    }

    public static void d() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("합계" + sum);
    }
    
}
