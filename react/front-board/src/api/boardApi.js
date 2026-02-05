
//게시판 테이블과 관련된 api 요청을 보내는 함수 모음 파일

import axios from "axios";

/**
 * 게시글 목록 조회 함수
 * @param {Object} searchData 검색데이터
 * @param {string} searchData.searchKeyword 검색키워드(제목,작성자)
 * @param {string} searchData.searchValue 검색내용
 * @returns 게시글 목록 데이터 리턴
 */

export const getList = async (searchData) => {
    try{
      const response = await axios.get(
        'http://localhost:8080/boards', 
        {params : searchData});
        return response;
    }catch(e){
       console.log('게시글 목록 조회 실행 중 오류')
       console.log(e)
    } 
}

export const saveOne = async (boardData) => {
  try{
    const response = await axios.post('http://localhost:8080/boards', boardData);
    return response;
  }catch(e){
    console.log('게시글 등록 중 오류 발생');
    console.log(e);
  }
}

/**
 * 게시글 삭제
 * @param {number} boardNum 삭제할 게시글 글번호
 * @returns 
 */
export const delBoard = async (boardNum) => {
  try{
    const response = await axios.get(`http://localhost:8080/boards/get/${boardNum}`)
    return response;
  }catch(e){
    console.log('게시글 삭제 중 에러')
    console.log(e)
  }
}