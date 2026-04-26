class Student extends Person {
    private int id;
    private static int totalStudents = 0;

    public Student(String name, int id) {
      super(name);
        this.id = id;
        totalStudents++;
    }

    @Override
    public void showPerson() {
         System.out.println("Student Name: " + name);
    }

    public void display() {
        showPerson();
         System.out.println("ID: " + id);
        
    }

    public static int getTotalStudents() {
      return totalStudents;
    }
}
