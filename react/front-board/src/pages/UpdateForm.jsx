import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const UpdateForm = () => {
  //마운트 되면 기존 내용이 보여야한다
  // -> 기존 내용을 DB에서 조회한다
  //URL Parameter로 전달된 데이터 받기
const {boardNum} = useParams();
  //조회한 게시글 정보를 저장할 state 변수
const [boardInfo, setBoardInfo] = useState({});

  //수정한 내용을 저장할 변수 state
const[updateData, setUpdateData] =useState({
  title : '',
  content : ''
});
const nav = useNavigate();

//입력할 때마다 입력한 값을 저장하는 함수
const handleUpdateData = (e) => {
  setUpdateData({
    ...updateData,
    [e.target.name] : e.target.value
  })
}
useEffect(() => {
    axios
    .get(`http://localhost:8080/boards/update/${boardNum}`)
    .then(response => {
      console.log(response.data)
      setBoardInfo(response.data)
    })
    .catch(e => console.log(e))
  },[])
  //마운트 시 실행x boardInfo 값이 변경될 때만 실행
  //boardInfo의 데이터를 updateData에 저장
  useEffect(() => {
    //boardInfo가 빈객체가 아닐때만.. -> 객체의 키가 0개가 아닐 때
    if(Object.keys(boardInfo).length !== 0){
        //boardInfo 객체에 저장된 title, content 값을 updateData에 저장
        setUpdateData({
          title : boardInfo.title,
          content : boardInfo.content
        });
    }
    // [boardInfo]는 boardInfo의 값이 변경될 때만 실행
  }, [boardInfo]);
    //수정 함수
  const updateBoard = () => {
    axios
    //두번째 매개변수로 데이터를 전달할 수 있다.(put,post)
    .put(`http://localhost:8080/boards/${boardNum}`, updateData)
    .then(response => {
      alert('수정완료');
      //상세페이지로 이동
      nav(`/detail/${boardNum}`);
    })
    .catch(e => console.log(e))
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
                {/* value 와 onChange 에서는 같은 데이터를 다루어야 한다 */}
                <input 
                  type="text"
                  value={updateData.title}
                  name='title'
                  onChange={e => handleUpdateData(e)}/>
                </td>
            </tr>
              <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea
                 name="content"
                 cols={50} row={5}
                 onChange={e => handleUpdateData(e)}
                 value={updateData.content}>
                </textarea>
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