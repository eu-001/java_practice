class Book {
    String title;
    int price;

    void printInfo() {
        System.out.println("제목: " + title + ", 가격: " + price + "원.");
    }
}

public class Main7_1 {
    public static void main(String[] args) {
        Book s1 = new Book();
        s1.title = "어린왕자";
        s1.price = 12000;
        s1.printInfo();

        Book s2 = new Book();
        s2.title = "희랍어 시간";
        s2.price = 18000;
        s2.printInfo();
    }
}

