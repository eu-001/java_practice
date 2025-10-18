class Student1 {
    String name;
    int kor;
    int eng;
    int math;

    void getAverage() {
        double avg = (kor+eng+math)/3.0;
        System.out.println(name+"의 평균은"+avg+"점입니다");
    }

    // double calcAverage(){
    //     return (kor+eng+math)/3.0;
    // }
}

public class Main7_2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "jane";
        s1.kor = 70;
        s1.eng = 55;
        s1.math = 70;
        s1. getAverage();

        //System.out.println("평균은" + s1.calcAverage()+ "점입니다.");
    }
}
