class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "aadhith";
        System.out.println(s1.id);
        System.out.println(s1.name);
        
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "avinash";
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}   
