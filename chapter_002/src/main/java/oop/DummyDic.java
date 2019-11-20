package oop;

public class DummyDic {
    public String engToRus() {
        String word = "goodmood";
        return word;
    }

    public static void main(String[] args) {
        DummyDic qwe = new DummyDic();
        String eng = qwe.engToRus();
        System.out.println("Неизвестное слово " + eng);
    }
}
