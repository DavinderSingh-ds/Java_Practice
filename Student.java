//Copy COnstructor
public class Student {
        String name;
        int age;
        Student(Student s1){
            this.name = s1.name;
            this.age = s1.age;
        }
        Student(){

        }
        void print(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Davinder";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.print();
    }
}
