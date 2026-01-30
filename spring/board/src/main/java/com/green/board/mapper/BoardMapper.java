package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
// 해당파일의 목적 : xml 만든 쿼리문을 실행할 추상 메서드를 선언
// 1. xml파일의 namespace 확인
// 2. mapper라는 어노테이션 넣어야 함.
// @mapper : 객체 생성 + 해당 인터페이스가 쿼리를 실행시키는 메서드가 있는 파일임을 스프링한테 알려줌
// 메서드 선언에는 메서드명, 리턴타입, 매개변수 정보를 결정할 수 있어야 함
// 메서드명 : 실행할 쿼리문의 id 값
// 리턴타입 : 쿼리 실행결과 전체 데이터를 받을 수 있는 자료형
// 조회일 경우에는 조회된 데이터에 따라 리턴타입이 달라짐
// update, insert, delete 쿼리의 경우는 리턴타입을 void 혹은 int로 지정
// void - 조회되는 데이터가 없기때문에 사용 가능
// int - 쿼리 실행에 영향을 받은 행의 갯수
// 매개변수 : 쿼리 실행 시 빈 값을 채울 수 있는 데이터

public interface BoardMapper {
  //게시글 목록 조회 쿼리 실행 메서드
  List<BoardDTO> selectBoardList();
  //게시글 등록 쿼리 실행 메서드
  //등록되면 1개가 등록되므로 int(영향받은 행의 갯수)
  void insertBoardList(BoardDTO boardDTO);
  BoardDTO getBoardDetail(int boardNum);
  //조회수 증가 쿼리 실행 메서드
  void updateReadCnt(int boardNum);
  //삭제 쿼리 실행 메서드
  void deleteDetail(int boardNum);
  //게시글 수정 쿼리
  void updateBoard(BoardDTO boardDTO);
}