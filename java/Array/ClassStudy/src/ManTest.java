public class ManTest {
  public static void main(String[] args) {

    Man m1 = new Man();
    //객체의 값 변경
    m1.name = "kim";
    m1.age = 20;
    m1.addr = "울산";
    //객체의 값 출력
    System.out.println(m1.name);
    System.out.println(m1.age);
    System.out.println(m1.addr);

    Man m2 = new Man();
    m2.setName("Lee");
    m2.setAge(20);
    m2.setAddr("부산");
    System.out.println(m2.getName());
    System.out.println(m2.getAge());
    System.out.println(m2.getAddr());



    Man m3 = new Man();
    m3.initMan("park",40,"서울");
    m3.printInfo();
  }
}
