/** 3단계 - 연산자 + 조건문 if */

public class main3 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        main1();
        main2();
        main4();
        main5();

        /**파일 하나당 클래스 하나를 맡으므로, 출력을 여러개 하고 싶으면 클래스 안에 static void를 여러개 두고 
        실행 할 수 있다. 대신 안에 다음 static 이름을 적어줘야 다음게 실행됨.*/
    }

    public static void main1() {
        int score = 85;

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

    public static void main2() {
        int age = 25;
        boolean hasTicket = true;
         //    &&: 그리고(and) ||:또는(or)  -- 두 좋건 모두가 true일 때만 실행이 가능함.
        if (age >= 20 && hasTicket == true) {
            System.out.println("입장 가능합니다.");
        } else {
            System.err.println("입장 불가.");
        }
    }

    public static void main4() {
        String password = "java1234" ; 
        //문자열 비교시 ==가 아니라 .equals()를 사용함
        if (password.equals("java1234")) {
            System.out.println("로그인 성공");
        } else {
            System.err.println("비밀번호가 틀렸습니다");
        }
    }

    public static void main5() {
        int age = 19 ;
        boolean hasId = false ;

        if (age >= 19) {
            if (hasId == true) {
                System.out.println("입장 허가");
            } else {
                System.out.println("신분증이 필요합니다");
            }
        } else {
                System.out.println("미성년자 입장 불가");
            }
    }
}

