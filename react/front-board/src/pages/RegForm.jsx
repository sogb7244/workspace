import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const RegForm = () => {
  const nav = useNavigate();

  //입력한 게시글 정보를 저장할 satate 변tn
  const [boardData, setBoardData] = useState({
    title : '',
    writer : '',
    content : ''
  });

  console.log(boardData);

  //입력한 정보를 state 변수에 저장하는 함수
  const handleBoardData = (e) => {
    setBoardData({
      ...boardData,
      [e.target.name] : e.target.value 
    })
  }

  //글 등록 함수
  const regBoard = () => {
    //제목과 작성자를 입력하지 않으면 함수 종료
    if(boardData.title === '' || boardData.writer === ''){
      alert('제목과 작성자는 필수 입력입니다');
      return;//리턴 데이터는 없다 -> 실행 시 함수 종료하겠다는 의미
    }

    axios.post('http://localhost:8080/boards', boardData)
    .then(response => {
      if(response.status === 201){
        alert('새로운 게시글이  등록되었습니다');
        nav('/');
      }
      else{
        alert('알수 없는 이유로 등록에 실패했습니다');
      }
      
    })
    .catch(e => console.log(e));
  }

  return (
    <div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input 
                  type="text" 
                  name='title'
                  value={boardData.title}
                  onChange={e => handleBoardData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
               <td>
                <input 
                  type="text" 
                  name='writer'
                  value={boardData.writer}
                  onChange={e => handleBoardData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
               <td>
                <textarea
                  name='content'
                  value={boardData.content}
                  onChange={e => handleBoardData(e)}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button type='button' onClick={e => {regBoard()}}>글등록</button>
      </div>
    </div>
  )
}

export default RegForm