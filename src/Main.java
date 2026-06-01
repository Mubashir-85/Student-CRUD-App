//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = new Student(20,1,"Mubashir");
        Student s2 = new Student(20,2,"Ahmed");
        service.addStudent(s1);
        service.addStudent(s2);
        service.updateStudent(3,25,"Shaikh");
        service.viewStudent();

    }
}