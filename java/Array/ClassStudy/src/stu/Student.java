package stu;

public class Student {
  private String name;
  private int age;
  private String grade;
  private String tel;

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", grade='" + grade + '\'' +
            ", tel='" + tel + '\'' +
            '}';
  }

  public Student(String name, int age, String grade, String tel) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.name = tel;
  }
}
