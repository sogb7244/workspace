import axios from 'axios';
import React, { useState } from 'react'
import styles from './RegForm.module.css'
import { useNavigate } from 'react-router-dom';
const RegForm = () => {
  const nav = useNavigate();
  
  
  //입력할 게시글 정보 저장할 state변수
  
  const [data, setData] = useState({
    title : '',
    writer : '',
    content : ''
  }

  );
    const handleData = e =>{
      setData({
        ...data,
        [e.target.name] : e.target.value
      })
    }

  return (
   <div>
    제목
    <input
      type="text"
      name='title'
      value={data.title}
      onChange={e => {
        handleData(e)
      }}
       />
       <br />
      작성자
      
    <input
      type="text"
      name='writer'
      value={data.writer}
      onChange={e => {
        handleData(e)
      }} />
      <br />
      내용
    <input
      type="text"
      name='content'
      value={data.content}
      onChange={e => {
        handleData(e)
      }} />
      <div>
        <button 
          type='button'
          onClick={() => {
            if(
              data.title === '' ||
              data.writer
              === ''
            ){
              alert('제목과 작성자는 필수입력입니다');
              return;//리턴 데이터는 없다 -> 실행 시 함수 종료
            }
            else
            axios
            .post('http://localhost:8080/boards',data)
            .then(response =>{
                // 제목과 작성자를 입력하지 않으면 함수 종료
            
              alert('등록완료')
            }
            )
            // 글등록 
            .catch(e => console.log(e))
          }}>
          글등록
          </button>
      </div>
   </div>
   
  )
}

export default RegForm