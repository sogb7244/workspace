package com.green.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//html로 데이터를 전송하는 클래스
@RestController//bean : 객체
public class TestController {

  @GetMapping("/test1")
  public String aaa(){
    return "java";
  }
  @GetMapping("/test2")
  public int bbb(){
    return 10;
  }
  @GetMapping("/test3")
  public Student ccc(){
    Student s = new Student("kim", 20);
    return s;
  }
  @GetMapping("/test4")
  public List<Student> ddd(){
    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("kim",20));
    stuList.add(new Student("kim",20));
    stuList.add(new Student("kim",20));
    return stuList;
  }
}
