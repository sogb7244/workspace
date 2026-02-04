import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import ReplyInfo from '../components/ReplyInfo';

const BoardDetail = () => {
  const nav = useNavigate();

  //url parameter 데이터 받기
  const params = useParams();
  console.log(params); //{boardNum:3}

  //조회한 상세정보를 저장할 state 변수
  const [boardInfo, setBoardInfo] = useState({}); 

  //상세화면이 마운트되면 상세 정보를 조회
  useEffect(() => {
    axios.get(`http://localhost:8080/boards/get/${params.boardNum}`)
    .then(response => {
      console.log(response.data);
      setBoardInfo(response.data);
    })
    .catch(e => console.log(e));
  }, []);

  //게시글 삭제 함수
  const deleteBoard = () => {
    //comfirm() -> 확인, 취소 버튼이 따라 리턴값 결정. 확인 -> true, 취소 -> false
    const result = confirm('정말 삭제할까요?');

    //확인 눌렀을 경우...
    if(result){
      axios.delete(`http://localhost:8080/boards/${params.boardNum}`)
      .then(response => {
        if(response.data === 1){
          alert('삭제되었습니다');
          nav('/');
        }
        else{
          alert('오류 발생!!!!');
        }
      })
      .catch(e => console.log(e));
    }
  }

  return (
    <div>
      <div>
        <table border={1}>
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
      </div>
      <div>
        <button type='button' onClick={e => {nav(-1)}}>목록가기1</button>
        
        <button type='button' onClick={e => {nav('/')}}>목록가기2</button>

        <button type='button' onClick={e => {nav(`/update/${params.boardNum}`)}}>수정</button>

        <button type='button' onClick={e => {deleteBoard()}}>삭제</button>
      </div>

      {/* 글번호를 ReplyInfo에 전달 */}
      <ReplyInfo boardNum={params.boardNum}/>

    </div>
  )
}

export default BoardDetail