public class ClassRoom{

  public Student[]  register;

  public ClassRoom(){
    this.register = new Student[7];
  }

  public int count(){
      int count = 0;

      for (Student student : register) {
        if (student != null){
          count++;
        }
      }
      return count;
    }

    public boolean isFull(){
      return count() == register.length;
    }

    public void addStudent(Student student){
      if (this.isFull()){
      return;}
      int index = count();
      register[index] = student;
    }
  }

