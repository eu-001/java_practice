public class Main5_1 {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
    }

    public static void one() {
        int[] nums = {5,8,12,20,1};
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("총합계"+sum);
    }

    public static void two() {
        int[] nums = {5,8,12,20,1};
        int min = nums[0];

        for(int i = 0; i<nums.length; i++) {
            if (nums[i]< min) {
                min = nums[i];
            }
    }
    System.out.println("최솟값:"+min);
    }

    public static void three() {
        int[] nums = new int[10]; //빈 배열 생성
        
        for (int i = 0; i < 10; i++) {
         nums[i] = i+1; //빈 배열 안에 값 넣기   
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]); // 한줄씩 출력
        }

    /** for (int num : nums) {
            System.out.println(num);
        } */ //for -each 문법으로 배열 전체를 한번에 순회 할수도 있음.
        
    }

    public static void four() {
        int[] nums = {2,4,6,8,10};
        int sum = 0;

        for(int i = 0; i < nums.length ; i++) {
            sum += nums[i];
        }

        System.out.println("평균값:" + sum/nums.length);
        /*int끼리 나누면 소수점이 버려지므로,
        System.out.println("평균값:" + (double) sum/ nums.length); **/
    }
}
