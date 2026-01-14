package stu;

import com.sun.source.tree.CaseTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentService {
  //학생 3명이 저장될 공간
  private Student[] students;
  private Scanner sc;
  private int stuCnt; //등록된 학생수

  public StudentService(){
    students = new Student[3];
    sc = new Scanner(System.in);
    stuCnt = 0;
  }




  //학생등록 메서드
  public void regStudent(){
    System.out.println("학생 등록 기능 실행. 학생정보를 입력하세요");
    System.out.println("이름");
    String name = sc.next();
    System.out.println("나이");
    int age = sc.nextInt();
    System.out.println("연락처");
    String tel = sc.next();
    System.out.println("학점");
    String grade = sc.next();
    //입력받은 정보를 가진 학생 객체를 생성
    Student s = new Student(name,age,grade,tel);
    //생성한 객체를 배열에 저장
//    students[stuCnt] = s;
//    stuCnt++;
    students[stuCnt++] = s;


  }
  //학생정보변경(연락처) 메서드
  public void changeStuTel(){



    System.out.println("학생의 연락처를 변경하는 기능 실행~");
    int mat = -1;
    for(int i=0;i<stuCnt;i++){
      String a = sc.next();
      if (students[i].getName().equals(a)){
        mat = i;
        break;
      }
      if(mat == -1){
        System.out.println("일치하는 학생 x");
      }
      else{
        System.out.print("연락처 : ");
        String b = sc.next();
        students[mat].setTel(b);
        System.out.println("변경완료");
      }

    }
  }
  //학생정보출력 메서드
  public void printStuInfo(){
    System.out.println("학생 정보 출력 기능 실행~");
//    for (int i=0; i<students.length;i++){
//      if (students[i].getName()==Student.class.getName()){
//        System.out.println(students[i]);
//      }
//    }
    System.out.print("정보를 열람할 학생 : " );
    String a = sc.next();
    int matchedIndex = -1; //이름이 일치하는 학생의 index
    //학생 이름 찾기
    for(int i=0;i<stuCnt;i++){
      if (students[i].getName().equals(a)){
        System.out.println(students[i]);
        matchedIndex = i;
        break;
      }
    }
    if(matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다");
    }
    else{
      System.out.println("요청하신 학생의 정보입니다");
      System.out.println(matchedIndex);
    }


  }


  //모든학생정보출력 메서드
  public void printStuAll(){
    System.out.print("모든 학생 정보 출력 기능 실행~");
    System.out.println("총학생수는 "+(stuCnt)+"명입니다");
    //student[0] 여기에 학생 한 명이 저장되어 있다.
   for (int i =0;i<students.length;i++){

     if (students[i] != null){
       System.out.println(students[i]);
     }
     else if(students[i] == null){
       System.out.println("");
     }
   }

  }



}
