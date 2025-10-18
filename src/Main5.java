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
            sum += scores[i]; //첫 sum 값이 0인데 거깃다 배열 순회를 하면서 각 값을 더하는 것
        }
 
        System.out.println("총합" + sum);
        System.out.println("평균" + (sum/ scores.length));     
        
        add();
    }

    public static void add() {
        int[] nums = {3,7,2,9,5};
        int max = nums [0]; //첫값으로 초기화

        for (int i =1 ; i<nums.length; i++){
            if (nums[i]> max) {
                max = nums[i];// nums[i] 가 배열의 첫값보다 크면 그게 max값으로 변환된다는 뜻
            }
        }
        System.out.println("최댓값" + max);
    }
}
