import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const RegPage = () => {
  //url parameter 데이터 받기
  const params = useParams();
  console.log(params);
  const nav = useNavigate();
//상세화면이 마운트되면 상세 정보를 조회

//조회한 상세정보를 저장할 state 변수
  const [boardInfo, setBoardInfo] = useState({
  });

      useEffect(() =>{
        axios
          .get(`http://localhost:8080/boards/${params.boardNum}`)
          .then(response => {
            console.log(response.data)
            setBoardInfo(response.data)
          })
          .catch(e => console.log(e))
        },[])
  return (
    <div>
      <table>
        <tbody>
        <tr>
          <td>작성일</td>
          <td>{boardInfo.createDate}</td>
          <td>작성자</td>
          <td>{boardInfo.writer}</td>
          <td>조회수</td>
          <td>{boardInfo.readCnt}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={5}>{boardInfo.title}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={5}>{boardInfo.content}</td>
        </tr>
        </tbody>
      </table>
        <div>
          <button  
            type='button'
            onClick={
              () => {
              nav('/');
              }
              //
            }>목록가기</button>
            <button type='button'
              onClick={e => {nav(-1)}}>목록가기2</button>
          <button
            type='button'
            onClick={
              () => {
                axios
              .put('http://localhost:8080/')
              .then()
              .catch()
              }
            }
            >수정</button>
          <button 
            type='button'
            onClick={
              e => {}
            }
            >
            삭제
          </button>
        </div>
  
      

    </div>
  )
}

export default RegPage