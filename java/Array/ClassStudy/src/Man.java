//이름을 리턴하는 메서드
//getter : 클래스의 각각의 멤버변수 값을 리턴하는 메서드
//       + 메서드명은 반드시 'get멤버변수명' 으로 지정해줘야 함

//이름을 변경하는 메서드
//setter : 클래스가 가진 각각의 멤버변수 값을 변경하는 메서드
//       + 메서드명은 반드시 'set변수명' 으로 지정해줘야 함
public class Man {
  String name;
  int age;
  String addr;

  //모든 멤버변수의 값을 초기화하는 메서드(멤버변수 값 변경 메서드)
  //this.name -> 이 클래스에 정의된 name
  //this 키워드는 멤버변수 및 메서드에 사용가능
  public void initMan(String name, int age, String addr) {
    this.name = name;
    this.age = age;
    this.addr = addr;
  }

  public void aaa() {
    System.out.println("a");
  }

  public void bbb() {
    System.out.println("b");
    this.aaa();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }
  public void printInfo(){
    System.out.println("이름 : " + this.name);
    System.out.println("나이 : " + getAge());
    System.out.println("주소 : " + this.addr);
  }
}