/** 7단계 - class 와 객체(object) 
 * 
 *  class란? - 객체를 만들기 위한 설계도
 * 
 * class Student {
    // 속성 (필드, Field)
    String name;
    int score;

    // 기능 (메소드, Method)
    void study() {
        System.out.println(name + "이(가) 공부 중입니다.");
    }
}
 * 
 * public class Main {
    public static void main(String[] args) {
        // Student 설계도로 객체(실제 학생) 생성
        Student s1 = new Student();
        s1.name = "강나비";
        s1.score = 95;
        s1.study(); // "강나비이(가) 공부 중입니다." 출력
    }
}
| 코드              | 의미                            |
| --------------- | ----------------------------- |
| `new Student()` | Student 설계도를 이용해 새로운 객체 하나 만듦 |
| `s1.name`       | s1 객체의 name 속성에 접근            |
| `s1.study()`    | s1 객체의 study 기능 실행            |

 * 
 * 주의 사항 - 클래스 이름은 파일면과 같아야 함
 *          - main()은 객체 실행 테스트용 메소드
*/

class Student {
    String name;
    int score;

    void printInfo() {
        System.out.println(name + "의 점수는 " + score + "점입니다.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jane";
        s1.score = 90;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "chris";
        s2.score = 100;
        s2.printInfo();
    }
}
