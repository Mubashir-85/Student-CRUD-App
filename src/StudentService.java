import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully");

    }

    public void viewStudent() {
        for (Student student : students) {
            System.out.println(
                    student.getId() + " " + student.getAge() + " " + student.getName()
            );
        }
    }
    public void updateStudent(int id, int age, String name){
        for(Student student: students){
            if(student.getId()== id){
                student.setAge(age);
                student.setName(name);
            }
        }
    }
}
