/** 5단계 - 배열 
 * 
 * 
 * int[] scores = {80, 90, 100};
System.out.println(scores[0]); // 80 출력
System.out.println(scores[1]); // 90 출력
System.out.println(scores[2]); // 100 출력

| 문법                                 | 의미           |
| ---------------------------------- | ------------ |
| `int[] arr = new int[5];`          | 빈 배열 생성 (5칸) |
| `arr[0] = 10;`                     | 0번째 칸에 값 저장  |
| `arr.length`                       | 배열 길이        |
| `for (int i=0; i<arr.length; i++)` | 배열 순회        |


*/


public class Main5  {
    public static void main(String[] args) {
        int[] scores = {90, 80, 70, 85, 95};
        int sum = 0;
                            // scores.length를 쓰면 배열 크기가 바뀌어도 자동 대응됨.
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
 
        System.out.println("총합" + sum);
        System.out.println("평균" + (sum/ scores.length));        
    }
}
