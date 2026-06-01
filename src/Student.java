public class Student {
    private int id;
    private int age;
    private String name;

    public Student(int age, int id , String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name= name;
    }
}
