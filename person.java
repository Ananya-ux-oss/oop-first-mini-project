class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showPerson() {
        System.out.println("Name: " + name);
    }

    
    public void showPerson(String msg) {
        System.out.println(msg + " " + name);
    }
}
