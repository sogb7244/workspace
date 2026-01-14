public class Student {
  String name;
  int age;
  String addr;
  String code;
  String call;
  public void initStudent(String name,int age,String addr,String code,String call){
    this.name = name;
    this.age = age;
    this.addr = addr;
    this.code = code;
    this.call = call;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setAddr(String addr){
    this.addr = addr;
  }
  public void setCode(String code){
    this.code = code;
  }
  public void setCall(String call){
    this.call = call;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public  String getAddr(){
    return addr;
  }
  public  String getCode(){
    return code;
  }
  public String getCall(){
    return call;
  }

  public void printAlldata() {
    System.out.println("이름 = " + this.name);
    System.out.println("나이 = " + getAge());
    System.out.println("주소 = " + this.addr);
    System.out.println("학번 = " + this.code);
    System.out.println("전화번호 = " + getCall());
  }


}

