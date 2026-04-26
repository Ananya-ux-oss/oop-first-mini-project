public class main {
    public static void main(String[] args) {

        Student s1 = new Student("Ananya", 101);
        Student s2 = new Student("Bemnet", 102);

        s1.display();
        s2.display();

        s1.showPerson("Hello");

        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}
