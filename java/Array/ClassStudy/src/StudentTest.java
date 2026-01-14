public class StudentTest {
  public static void main(String[] args) {

    Student m1 = new Student();

    m1.initStudent("허",20,"울산","01010","01044");
    m1.printAlldata();

    Student m2 = new Student();

    m2.setName("wad");
    m2.setAddr("awdaw");
    m2.setAge(20);
    m2.setCall("a01010");
    System.out.println(m2.getAddr());
    System.out.println(m2.getName());
    System.out.println(m2.getAge());
    System.out.println(m2.getCall());
  }


}
