package test1_4;

public class MemberTest {
  public static void main(String[] args) {

    Member m1 = new Member();
    Member m2 = new Member("자바","java","zz");
    m1.setId("java");
    m1.setName("자바");
    m1.setPw("zz");
    System.out.println(m1.getName());
    System.out.println(m1.getId());
    System.out.println(m1.getPw());
    /// /////////////////////////////////////////
    m2.displayInfo();
    System.out.println(m2.toString());
    //객체명만 출력하면 자동으로 toString()메서드가 호출됨
    System.out.println(m2);
  }
}
