/** 6단계 -  return 함수
 * 
 * return의 의미 : 메소드(함수)가 어떤 계산을 끝내고 결과값을 호출한 쪽으로 돌려주는 것.
 * 
 * return의 기본 구조
 * public static 반환타입 메소드이름(매개변수들) {
    return 결과값;
    }
| 구성요소            | 설명                                 |
| --------------- | ---------------------------------- |
| `public static` | 어디서든 쓸 수 있는 메소드 선언                 |
| `반환타입`          | 돌려줄 데이터 타입 (int, double, String 등) |
| `메소드이름()`       | 함수 이름                              |
| `return`        | 결과값 돌려주는 키워드                       |

 */



public class Main6 {
    public static void main(String[] args) {
        int result = add(5,7);
        System.out.println("결과:" + result);

        one(args);
        two(args);
    }

    public static int add(int a, int b) {
        return a+b;
    }
    /** 이 함수는 a와 b를 더한 결과(int형)를 돌려준다. 
     * 값을 출력하는게 아니라 값을 가져가는 느낌. */

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void one(String[] args) {
        int[] nums = {10,20,30,40,50};
        System.out.println("총합:" + getSum(nums));
    }

    public static double getAverage(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return (double) sum / arr.length;
    }

    public static void two(String[] args) {
        int[] nums = {3,56,2,3,5,3};
        System.out.println("평균값:"+getAverage(nums));
    }

}
