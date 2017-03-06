import static org.junit.Assert.assertEquals;
import org.junit.*;


  public class ClassRoomTest{
    ClassRoom classRoom;
    Student student;
  

    @Before 
    public void before() {
      classRoom = new ClassRoom();
      student = new Student();
    }


  @Test
  public void classEmpty(){
    assertEquals(0 , classRoom.count());
  }

  @Test
  public void addStudent(){
      classRoom.addStudent(student);
    assertEquals(1, classRoom.count());
  }
}
