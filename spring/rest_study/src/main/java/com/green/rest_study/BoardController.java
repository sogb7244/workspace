package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//2.3시험
//게시글과 관련된 요청에 대한 응답 클래스
//요청 종류는 대표적으로 CRUD라고 부루는 4개가 존재.
//C : CREATE -> 데이터 생성
//R : READ -> 데이터 조회(전체 조회, 특정 데이터만 조회)
//U : UPDATE -> 데이터 수정
//D : DELETE -> 데이터 삭제

@RestController
@RequestMapping("/boards") //해당 컨트롤러의 URL은 전부 "/boards"로 시작한다
public class BoardController {
  private List<BoardDTO> boardList;

  public BoardController(){
    //게시글 목록이 저장될 List 생성
    boardList = new ArrayList<>();

    //리스트에 게시글을 5개 저장
    boardList.add(new BoardDTO(1, "첫번째글","김자바",5));
    boardList.add(new BoardDTO(2, "두번째글","이자바",0));
    boardList.add(new BoardDTO(3, "세번째글","자바",51));
    boardList.add(new BoardDTO(4, "네번째글","이자바",52));
    boardList.add(new BoardDTO(5, "다섯번째글","김자바",55));
  }
  //게시글 목록을 조회하는 API
  //URL -> (GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    System.out.println("게시글 목록을 조회합니다");
    return boardList;
  }

  //게시글 하나를 조회하는 API
  //URL -> (GET) localhost.8080/boards/1

  //URL에 {}를 변수처럼 활용할 수 있음
  //이 변수는 URL에 적용되었다는 의미에서 URL Parameter라 부름
  //url parameter로 전달되는 데이터는 메서드의 배개변수에 @PathVariable 어노테이션을 사용으로 활용 가능
  //문법 : @PathVariable("url 파라메터 이름") 해당 데이터를 받을 변수
  @GetMapping("/{boardNum}") //=> {boardNum}변수"
  public BoardDTO getBoard(@PathVariable("boardNum") int Num){
    System.out.println(Num);
    System.out.println("5번 게시글을 조회합니다");

    BoardDTO result = null;
    for(BoardDTO e : boardList){
      if(e.getBoardNum() == Num){
        result = e;
      }
    }
    return result;
  }

  //연습용 코드
  //URL ->(GET) localhost:8080/boards/5/java
  @GetMapping("/{age}/{name}")
  public void test1(@PathVariable("age") int age,@PathVariable("name") String name){
    System.out.println(age);
    System.out.println(name);

  }

  //게시글 등록하는 API
  //URL -> (POST) localhost.8080/boards
  //요청 시 글번호, 제목, 작성자, 조회수 , 데이터를 가져옴
  //데이터 등록(POST), 데이터 수정(PUT) 시 요청과 함께 전달되는 데이터는
  //@RequestBody 어노테이션으로 전달받음
  //@RequestBody 어노테이션 다음에 클래스 자료형을 매개변수로 선언하면 해당 클래스에 데이터를 받을 수 있음
  //단 , 해당 클래스의 멤버변수명은 요청 시 전달되는 객체의 key값과 동일!

  @PostMapping("")
  public void regBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    boardList.add(boardDTO);
  }
  //게시글 삭제하는 API
  //URL -> (DELETE) localhost.8080/boards/3
  @DeleteMapping("/{boardNum}")
  public List<BoardDTO> deleteBoard(@PathVariable("boardNum")int boardNum){
    System.out.println(boardNum);

//    for(int i = 0;i<boardList.size() ; i++){
//      if(boardList.get(i).getBoardNum() == boardNum){
//        boardList.remove(i);
//
//
//      }
//    }
    for(BoardDTO e : boardList){
      if(e.getBoardNum() == boardNum){
        boardList.remove(e);
      }
    }
    return boardList;
  }
  //게시글 수정하는 API
  //URL -> (PUT) localhost.8080/boards/3
  //게시글의 제목("집에갑시다")과 작성자("관리자")를 변경하는 기능
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum")int boardNum,@RequestBody BoardDTO boardDTO){
    System.out.println(boardNum);
    System.out.println(boardDTO);

    for(BoardDTO e : boardList){
      if(e.getBoardNum() == boardNum){
        e.setTitle(boardDTO.getTitle());
        e.setWriter(boardDTO.getWriter());
      }
    }

  }
}


