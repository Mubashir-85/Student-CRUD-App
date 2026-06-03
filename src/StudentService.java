import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student)throws InterruptedException {
        students.add(student);
        Thread.sleep(2000);
        System.out.println("Student Added Successfully");

    }

    public void viewStudent() throws InterruptedException {
        for (Student student : students) {
            Thread.sleep(2000);
            System.out.println(
                    student.getId() + " " + student.getAge() + " " + student.getName()
            );
        }
    }
    public boolean Studentexist(int id){
        for(Student student: students){
            if(student.getId() == id){
                return true;
            }
        }
        return false;
    }
    public void updateStudent(int id,  String name,int age)throws InterruptedException{
        for(Student student: students){
            if(student.getId()== id){
                student.setAge(age);
                student.setName(name);
                Thread.sleep(2000);
                System.out.println("Student Updated Successfully");
                return;
            }
        }
    }
    public void deleteStudent(int id)throws InterruptedException{
        for(Student student: students){
            if(student.getId()==id) {
                students.remove(student);
                Thread.sleep(2000);
                System.out.println("Deleted Successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void searchStudent(int id)throws InterruptedException{
        for(Student student: students){
            if(student.getId()==id){
                Thread.sleep(2000);
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                return;

            }
        }
        System.out.println("Student Not found");
    }

}
