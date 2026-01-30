import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
const BoardList = () => {
  const nav = useNavigate();
  // 컴포넌트가 마운트될 때 게시글 목록을 spring에서 조회한 후
  //화면에 띄워준다.
  //마운트 시 게시글 목록 조회
  const [boardList, setBoardList] = useState([]);
  useEffect(() => {
    axios
    .get('http://localhost:8080/boards')
    .then(response => {
      console.log(response.data)
      setBoardList(response.data)})
    .catch(e => console.log(e))
  },[]);

  return (
    <>
    
    <div className={styles.container}>
      <h2>자유게시판</h2>
      <div className={styles.searchDiv}>
        <select>
          <option value="">제목</option>
          <option value="">작성자</option>
        </select>
        <input type="text"
         
       
         onChange={e => {
          setData({
            ...data,
            [e.target.name] : e.target.value
          })
         }}
         />
        <button 
      
          
        >검색</button>
      </div>
      <table className='tables' >
        {/* 테이블의 각 컬럼 너비값 지정 */}
        <colgroup>
          <col width='10%'/>
          <col width='*'/>
          <col width='15%'/>
          <col width='20%'/>
          <col width='15%'/>
        </colgroup>
        <thead>
          <tr>
            <td>No</td>
            <td>제목</td>
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
                <td>{boardList.length-i}</td>
                <td>
                  <span onClick={() => {
                    nav(`detail/${board.boardNum}`)

                }}>{board.title}</span></td>
                {/* 인라인태그는 내용만큼만 사용가능함 */}
                <td>{board.writer}</td>
                <td>{board.createDate}</td>
                <td>{board.readCnt}</td>
              </tr>
            )
          })
         }
        </tbody>
      </table>
      <div className={styles.btnbottom}>
        <button 
        onClick={e =>{{nav('/reg')}
// route에 적은 path 보고 적으면됨
        }}>글쓰기</button>
      </div>
    </div>
    </>
  )
}

export default BoardList