public class Teacher{

  public static void main(String[] args) {
    ClassRoom classroom = new ClassRoom();
    Student student = new Student();
    classroom.addStudent(student);
    classroom.addStudent(student);
    classroom.addStudent(student);
    classroom.addStudent(student);
    classroom.addStudent(student);
    classroom.addStudent(student);
    classroom.addStudent(student);
    int register = classroom.count();
    System.out.println(register);
  }

  
}