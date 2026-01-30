import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import BoardList from './BoardList';

const RegPage = () => {
  //url parameter 데이터 받기
  const params = useParams();
  console.log(params);
  const nav = useNavigate();


//조회한 상세정보를 저장할 state 변수
  const [boardInfo, setBoardInfo] = useState({});
//상세화면이 마운트되면 상세 정보를 조회
  useEffect(() =>{
    axios
      .get(`http://localhost:8080/boards/get/
        ${params.boardNum}`)
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
                 nav(`/update/${params.boardNum}`)
              }
            }
          >수정</button>
          <button 
            type='button'
            onClick={
              () => {
              //confirm() -> 확인,취소 버튼이 따라 리턴값 결정. 확인 -> true, 취소 -> false
                const result = confirm('정말 삭제할까요?');
                //확인 눌렀을 경우.+
                if(result){
                  axios
                .delete(`http://localhost:8080/boards/${params.boardNum}`)
                .then(response => {
                  alert('삭제완료 후 목록으로 돌아갑니다')
                  nav('/');
                })
                .catch(e => console.log(e))
                }
              }
            }
            >
            삭제
          </button>
        </div>
  
      

    </div>
  )
}

export default RegPage