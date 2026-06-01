//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = new Student(20,1,"Mubashir");
        Student s2 = new Student(20,2,"Ahmed");
        Student s3 = new Student(20,3,"Shaikh");
        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);
        service.updateStudent(2,20,"Baba");
        service.deleteStudent(3);
        service.viewStudent();

    }
}