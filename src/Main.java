import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View ");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter Name");
                    String name = sc.nextLine();

                    System.out.println("Enter Age");
                    int age = sc.nextInt();

                    service.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    service.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter ID:");

                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter New Name");
                    String updatedName = sc.nextLine();

                    System.out.println("Enter new Age");
                    int updatedAge = sc.nextInt();
                    service.updateStudent(updateId, updatedName, updatedAge);
                    break;
                case 4:
                    System.out.println("Enter Id");
                    int deletedId = sc.nextInt();
                    service.deleteStudent(deletedId);
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }
        }

//       1 Student s1 = new Student(20,1,"Mubashir");
//        Student s2 = new Student(20,2,"Ahmed");
//        Student s3 = new Student(20,3,"Shaikh");
//        service.addStudent(s1);
//        service.addStudent(s2);
//        service.addStudent(s3);
//        service.updateStudent(2,20,"Baba");
//        service.deleteStudent(3);
//        service.viewStudent();

    }
}