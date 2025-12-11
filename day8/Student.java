class Parent{
    void showRole(){
        System.out.println("Godly Person");
    }
}
class Student extends Parent {
    int id;
    String name;
    Student() {
        System.out.println("Default constructor called.");
    }
    Student( int r, String n) {
        id = r;
        name = n;
        System.out.println("Parameterized constructor called.");
    }
    void printMessage() {
        System.out.println("Welcome to the class!");
    }
    void printMessage( String msg) {
        System.out.println(msg);
    }
    void printline(){
        System.out.println("......................................................");
    }
    void insertRecord(int r, String n) {
        id=r;
        name =n;
    }
    void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(100, "Aadhith");
        s1.id = 101;
        s1.name = "Aishuu";
        s2.id = 102;
        s2.name = "Abhitha";
        System.out.println("Student 3: " + s3.id + ", " + s3.name);
        System.out.println("Student 1: " + s1.id + ", " + s1.name);
        s1.printline();
        s1.printMessage();
        s1.printMessage("Hello from Student 1!");
        s1.showRole();
        System.out.println("Student 2: " + s2.id + ", " + s2.name);
        s2.printline();
        s2.printMessage("Hello from Student 2!");
        System.out.println("End of the program.");
        s1.insertRecord(121, "Ajith");
        s1.printStudent();
        s2.insertRecord(122, "Anjali");
        s2.printStudent();
    }
}