package test1_4;

public class Member {
  private String name;
  private String id;
  private String pw;

  //생성자 = constructure
  public Member(String name, String id, String pw) {
    this.name = name;
    this.id = id;
    this.pw = pw;
  }
  public Member() {
  }


  //setter : 멤버변수 각각의 데이터를 변경하는 메서드 + set멤버변수명
  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }
  public void setPw(String pw){
    this.pw = pw;
  }
  //getter : 멤버변수 각각의 데이터를 리턴받는 메서드 + get멤버변수명
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public String getPw(){
    return pw;
  }
  public void displayInfo(){
    System.out.println("이름 = "+ name);
    System.out.println("아이디 = "+id);
    System.out.println("비번 = "+pw);
  }

  @Override
  public String toString() {
    return "Member{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            '}';
  }
}
