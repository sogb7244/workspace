import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

//컴포넌트가 마운트될떄 게시글 목록을 spring에서 조회한 후 화면에 띄워준다
const BoardList = () => {
  const nav = useNavigate();

  //조회한 게시글 목록 데이터를 저장할 state 변수
  const [boardList, setBoardList] = useState([]);

  //입력한 검색 내용을 저장할 state 변수
  const [searchData, setSearchData] = useState({
    searchKeyword : 'TITLE',
    searchValue : ''
  });

  //입력값 저장 함수
  const handleSearchData = (e) => {
    setSearchData({
      ...searchData,
      [e.target.name] : e.target.value
    });
  }
  
  console.log(boardList);
  //마운트 시 게시글 목록 조회
  useEffect(() => {
    getBoardList();
  }, []);

  //게시글 목록 조회 함수
  const getBoardList = () => {
    axios.get('http://localhost:8080/boards', {params : searchData})
    .then(response => {
      //console.log(response);
      // console.log(response.data);
      setBoardList(response.data);
    })
    .catch(e => {
      console.log('오류발생')
      //e.reponse.data는 받아오는 데이터를 받아볼수있다.
      console.log(e.response)//응답정보(오류가 날 때)
    });
  }

  return (
    <div className={styles.container}>
      <div className={styles.search_div}>
        <select 
          value={searchData.searchKeyword}
          name='searchKeyword'
          onChange={e => handleSearchData(e)}
        >
          <option value='TITLE'>제목</option>
          <option value='WRITER'>작성자</option>
        </select>
        <input 
          type="text" 
          value={searchData.searchValue}
          name='searchValue'
          onChange={e => handleSearchData(e)}
        />
        <button type='button' onClick={e => getBoardList()}>검색</button>
      </div>
      <div className={styles.list_div}>
        <table className={styles.list_table}>
          {/* 테이블의 각 컬럼 너비값 지정 */}
          <colgroup>
            <col width='10%'/>
            <col width='*'/>
            <col width='13%'/>
            <col width='30%'/>
            <col width='13%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>제 목</td>
              <td>작성자</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
          {
            boardList.map((board, i) => {
              return (
                <tr key={board.boardNum}>
                  <td>{boardList.length - i}</td>
                  <td>
                    <span onClick={e => {nav(`/detail/${board.boardNum}`)}}>
                      {board.title}
                    </span>
                  </td>
                  <td>{board.writer}</td>
                  <td>{board.createDate}</td>
                  <td>{board.readCnt}</td>
                </tr>
              )
            })
          }  
          </tbody>
        </table>
      </div>
      <div className={styles.btn_div}>
        <button type='button' onClick={e => {nav('/reg')}}>글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList