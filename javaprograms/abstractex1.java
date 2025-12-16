abstract class Language {
    public void display() {
        System.out.println("This is a Java language.");
    }
}
class abstractex1 extends Language {
    public static void main(String[] args) {
        abstractex1 obj = new abstractex1();
        obj.display();
    }
}