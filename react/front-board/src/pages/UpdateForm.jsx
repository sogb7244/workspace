import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const UpdateForm = () => {
  const nav = useNavigate();

  //URL Parameter로 전달된 데이터 받기
  const {boardNum} = useParams();
  console.log(boardNum); //글번호

  //조회한 게시글 정보를 저장할 satate 변수
  const [boardInfo, setBoardInfo] = useState({});

  //수정한 내용을 저장할 state변수 
  const [updateData, setUpdateData] = useState({
    title : '',
    content : ''
  });

  //입력할때마다 입력한 값을 저장하는 함수
  const handleUpdateData = (e) => {
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    });
  }

  //마운트되면 기존 내용이 보여야 한다
  // -> 기존 내용을 DB에서 조회한다
  useEffect(() => {
    axios.get(`http://localhost:8080/boards/update/${boardNum}`)
    .then(response => {
      console.log(response.data);
      setBoardInfo(response.data);
    })
    .catch(e => console.log(e));
  }, []);

  //마운트 시 실행 x, boardInfo 값이 변경될때만 실행
  //boardInfo의 데이터를 updateData에 저장
  useEffect(() => {
    //boardInfo가 빈 객체가 아닐떄만.. -> 객체의 키가 0개가 아닐때..
    if(Object.keys(boardInfo).length !== 0 ){
      //boardInfo 객체에 저장된 title, content 값을 updateData에 저장
      setUpdateData({
        title : boardInfo.title,
        content : boardInfo.content
      });
    }
  }, [boardInfo]);

  //수정 함수
  const updateBoard = () => {
    axios.put(`http://localhost:8080/boards/${boardNum}`, updateData)
    .then(response => {
      alert('수정 완료!!');
      //상세페이지로 이동
      nav(`/detail/${boardNum}`);
    })
    .catch(e => console.log(e));
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
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>
                {/* value와 onChange 에서는 같은 데이터를 다루어야 한다. */}
                <input 
                  type="text" 
                  value={updateData.title}
                  name='title'
                  onChange={e => handleUpdateData(e)}
                />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea 
                  cols={50} rows={5} 
                  value={updateData.content}
                  name='content'
                  onChange={e => handleUpdateData(e)}
                ></textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button type='button'>뒤로가기</button>
        <button type='button' onClick={e => {updateBoard()}}>수정</button>
      </div>
    </div>
  )
}

export default UpdateForm