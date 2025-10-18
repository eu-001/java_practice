public class Main4_2 {
    public static void main (String[] args){
        one();
    }
//*가 갈수록 감소하는
    public static void one() {
        int i = 5; // 시작점을 5로 두기

        while (i>= 1) { //5에서 1까지 감소
            for (int j = 0; j< i; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        i--; // i를 1씩 줄이기
    }
}
