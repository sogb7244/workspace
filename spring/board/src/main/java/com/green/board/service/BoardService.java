package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//실제 쿼리 기능을 구현할 클래스

//초기세팅
//1. @Service 어노테이션을 클래스명 위에 선언
//   -> 객체 생성 + 이 클래스가 핵심기능이 구현된 클래스라는 것을 스프링한테 알려줌
//2. 쿼리 실행 메서드를 호출하기 위해
//2-1) Mapper Interface 객체를 맴버변수로 선언
//2-2) 생성자 의존성 주입 문법을 사용해서 Mapper Interface 객체를 생성

@Service
public class BoardService {
  private BoardMapper boardMapper; //2-1 코드.

  //2-2 코드
  //생성자 의존성 주입
  @Autowired //생성자가 하나라면 @autowired 어노테이션 생략 가능
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //게시글 목록 조회 기능
  public List<BoardDTO> getList(SearchDTO searchDTO){
    List<BoardDTO> list = boardMapper.selectBoardList(searchDTO);
    return list;
  }

  //게시글 등록 기능 메서드
  public int regBoard(BoardDTO boardDTO){
    //insert 쿼리 결과 리턴되는 데이터는 새롭게 추가된 행 갯수를 의미
    int insertedRowCnt = boardMapper.insertBoard(boardDTO);
    return insertedRowCnt;
  }

  //게시글 상세 조회 기능
  public BoardDTO getBoard(int boardNum, String type){

    //상세 조회 기능에서만 조회수를 1증가
    if(type.equals("get")){
      boardMapper.updateReadCnt(boardNum);
    }

    //게시글 상세 정보 조회 쿼리 실행
    BoardDTO dto = boardMapper.selectBoard(boardNum);
    return dto;
  }

  //게시글 삭제 기능
  public int deleteBoard(int boardNum){
    int deletedRowCnt = boardMapper.deleteBoard(boardNum);
    return deletedRowCnt;
  }

  //게시글 수정 기능
  public void updateBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);
  }


}







