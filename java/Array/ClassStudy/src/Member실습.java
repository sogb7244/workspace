public class Member실습 {
  String name;
  String id;
  String pw;
  int age;

  public Member실습(String name,String id){
    this.name = name;
    this.id = id;
    this.pw = "***";
    this.age = 25;
  }

  public void printAlldata(){
    System.out.println("id : " + id);
    System.out.println("이름 : " + name);
    System.out.println("비번 : " + pw);
    System.out.println("나이 : " + age);
  }
}
