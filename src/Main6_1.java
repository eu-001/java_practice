public class Main6_1 {
    public static void main(String[] args) {
        //multiply
        int result = multiply(5,4);
        System.out.println("결과:"+result);
        //getsum
        int[] nums = {5,10,15,20,25};
        System.out.println("총합은" + getSum(nums) + "입니다.");
        //getAverage
        int[] nums1 = {10,20,30,40,50};
        System.out.println("평균은" + getAverage(nums1) + "입니다.");
        //getResult
        System.out.println(getResult(70));
        
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int getSum(int[] arr) {
        int sum = 0;

        for(int i =0; i< arr.length ; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double getAverage(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static String getResult(int score){
        if (score >= 60) {
            return "합격";
            
        } else {
            return "불합격";
        }
    }
}