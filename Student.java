public class Student {
    private String name = "John";
    private String classes = "C02";
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        return "Student:" + "name=" + name + ","+" classes=" + classes ;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nam");
        student.setClasses("A122I1");
        System.out.println(student);
    }
}
