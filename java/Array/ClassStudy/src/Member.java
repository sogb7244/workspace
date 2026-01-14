public class Member {
  String name;
  String id;
  String pwd;
  int age;


  public void setMemberInfo(String name1, String id1, String pwd1, int age1) {
    name = name1;
    id = id1;
    pwd = pwd1;
    age = age1;
  }

  public void printAlldata() {
    System.out.println("이름 : " + name);
    System.out.println("id : " + id);
    System.out.println("pwd : " + pwd);
    System.out.println("age : " + age);
  }
}


