package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//해당 파일의 목적 : xml에서 만든 쿼리문을 실행할 추상메서드 선언

//초기세팅
//1. xml파일과 Mapper Interface를 연결 - xml 파일의 namespace확인!
//2. interface 위에 @Mapper 어노테이션을 적용
//   @Mapper : 객체생성 + 해당 interface가 쿼리를 실행시키는 메서드가 있는 파일임을 스프링한테 알려줌

//쿼리문을 실행할 추상메서드를 선언
//메서드 선언에는 메서드명, 리턴타입, 매개변수 정보를 결정할 수 있어야 함
//메서드명 : 실행할 쿼리문의 id 값
//리턴타입 : 쿼리 실행결과 전체 데이터를 받을 수 있는 자료형
//조회일 경우에는 조회된 데이터에 따라 리턴타입이 달라짐
//update, insert, delete 쿼리의 경우는 리턴타입을 void 혹은 int로 지정
//void - 조회되는 데이터가 없기 때문에 사용 가능
//int - 쿼리 실행에 영향을 받은 행의 갯수
//매개변수 : 쿼리 실행 시 빈 값을 채울 수 있는 데이터

@Mapper
public interface BoardMapper {
  //게시글 목록 조회 쿼리 실행 메서드
  List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  //게시글 등록 쿼리 실행 메서드
  int insertBoard(BoardDTO boardDTO);

  //게시글 상세 조회
  BoardDTO selectBoard(int boardNum);

  //조회수 증가 쿼리 실행 메서드
  void updateReadCnt(int boardNum);

  //삭제 쿼리 실행 메서드
  int deleteBoard(int boardNum);

  //게시글 수정 쿼리
  void updateBoard(BoardDTO boardDTO);

}







