package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// service 클래스 : interface에서 선언한 추상메서드를 실행할 메서드 구현
// 실제 쿼리 기능을 구현할 클래스
// 초기세팅
// 1. @service 어노테이션을 클래스명 위에 선언
// -> 객체 생성 + 이 클래스가 핵심기능이 구현된 클래스라는 것을 스프링한테 알려줌
// 2. 쿼리 실행 메서드를 호출하기 위해
// 2-1) Mapper interface 객체를 멤버변수로 선언
// 2-2) 생성자 의존성 주입 문법을 사용해서 mapper interface 객체를 생성
public class BoardService {
  private BoardMapper boardMapper;
//  private String name;

  // 2-2 생성자 의존성 주입
  @Autowired // 생성자가 하나라면 @autowired 어노테이션 생략가능
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

//  @Autowired // 생성자가 여러개면
//  public BoardService(BoardMapper boardMapper, String name){
//    this.boardMapper = boardMapper;
//    this.name = name;
//  }

  public List<BoardDTO> getList(){
    //객체명.메서드호출();
    List<BoardDTO> list = boardMapper.selectBoardList();
    return list;
  }
  //게시글 등록 기능메서드
  //만든 메서드에서 매개변수 그대로 전달 받아옴
  public void insertBoard(BoardDTO boardDTO){
    boardMapper.insertBoardList(boardDTO);
  }
//위랑 같은 등록 메서드  public int insertBoard(BoardDTO boardDTO){
//    int insertRowCnt = boardMapper.insertBoardList(boardDTO);
//  }// insert 쿼리결과 리턴되는 데이터는 새롭게 추가된 행의 갯수
//  return insertRowCnt;
public BoardDTO getBoardDetail(int boardNum, String type){
    //게시글 조회 수 증가 쿼리 실행
  //상세 조회 기능에서만 조회수를 1증가
  if (type.equals("get")){
    boardMapper.updateReadCnt(boardNum);
  }
  //게시글 상세 정보 출력 쿼리 실행
   BoardDTO getDetail = boardMapper.getBoardDetail(boardNum);
    return getDetail;
  }

  //삭제 기능
  public void deleteDetail(int boardNum){
    boardMapper.deleteDetail(boardNum);
  }
  //게시글 수정 기능
  public void updateBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);
  }
}
