public class Student {
    int age;
    public Student(int age){
        if(age < 18) {
            throw new IllegalArgumentException("Age Must be above 18");
        }
        this.age = age;
        super();
    };

    public static void main(String[] args) {
        Student student = new Student(17);
        System.out.println(student.age);

    }
}
