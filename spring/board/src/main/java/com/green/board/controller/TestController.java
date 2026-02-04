package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    String name = "kim";
    //body안에 있는 데이터의 자료형으로 <> 넣어줌
    return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(name);

  }
  @GetMapping("/test2")
  public ResponseEntity<BoardDTO> test2(){
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(1);
    dto.setTitle("제목");
    dto.setWriter("작성자");
    dto.setContent("내용");
    //body안에 있는 데이터의 자료형으로 <> 넣어줌
    //헤더에 실을 데이터
    HttpHeaders headrs = new HttpHeaders();
    headrs.add("myName","kim");
    headrs.add("myAge","30");
    return ResponseEntity
            .status(HttpStatus.CREATED).headers(headrs)
            .body(dto);
  }

  @GetMapping("/test3")
  //자료형에 '?' 는 와일드카드이다.
  public ResponseEntity<?> test3(){
    System.out.println("기능성공");
    //return할 데이터가 없으면 build() 메서드를 마지막에 호출!
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

  }
}
