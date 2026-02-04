import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ReplyInfo = ({boardNum}) => {
  //댓글 목록 조회 데이터를 저장할 state 변수
  const [replyList, setReplyList] = useState([]);
  //입력 내용, Spring으로 전달할 데이터를 저장하는 state 변수
  console.log(replyList)
  const [replyData, setreplyData] = useState({
    //앞에 있는 키값 보드넘은 글자, 뒤에는 넘어온 데이터
    'boardNum' : boardNum,
    content : '',
    writer : ''
  });
  const deleteReply =(replyNum) => {
    const result = confirm('삭제하겠습니까?')
    if(result){
      axios.delete(`http://localhost:8080/replies/${replyNum}`)
    .then(response => {
      //댓글 다시 조회
      getReplyList();
    })
    .catch(e => console.log(e));
    }
  }

  //값 입력 시 실행 함수
  const handleReply = (e) => {
    setreplyData({
      ...replyData,
      [e.target.name] : e.target.value
    })
  }
  console.log(replyData)
  //마운트 시 댓글 목록 조회
  useEffect(() => {
   getReplyList();
  } , []);
  //댓글 목록 조회 함수
  const getReplyList = () => {
     axios.get(`http://localhost:8080/replies/${boardNum}`)
    .then(response => {
      console.log(response.data);
      setReplyList(response.data);//state변경함수는 다시그려줌
    })
    .catch(e => console.log(e));
  }
  //댓글 등록 api 호출 메서드
  const regReply = () => {
  //작성자 혹은 댓글 내용이 입력되지 않았으면..
    if(replyData.writer === '' || replyData.content === '') {
      alert('작성자 및 내용은 필수입력입니다.');
      return;
    }

    axios.post('http://localhost:8080/replies',replyData)
    .then(response => {
      getReplyList();//댓글 목록 조회
      //input 태그 초기화
      setreplyData({
        ...regReply,
        writer : '',
        content : ''
      })
    })
    .catch(e => {console.log(e)})

  }
  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex',
        gap : '10px'
      }}>
        <input
          style={{width : '20%'}} 
          type="text" 
          name='writer'
          value={replyData.writer}
          onChange={e => {
           handleReply(e)
          }}
          />
        
        <input 
          style={{width : '70%'}} 
          type="text"
          name='content'
          value={replyData.content}
          onChange={e => {
            handleReply(e)
            
          }}
        />
        <button 
          style={{width : '10%'}} 
          type='button'
          onClick={e => {regReply()}}
        >댓글등록</button>
      </div>
      <div style={{marginTop : '16px'}}>
      {
        replyList.map((reply, i) => {
          return (
            <div key={i}>
              <div style={{display : 'flex', gap : '8px', alignItems : 'center'}}>
                <img 
                  style={{
                    background : '1px solid lightgray',
                    borderRadius : '50%',
                    width : '30px'
                  }}
                  src="/face-03.jpg"
                />
                <div>
                  <p>{reply.writer}</p>
                  <p style={{color : 'gray'}}>{reply.regDate}</p>
                </div>
              </div>
              <div style={{display:'flex', justifyContent: 'space-between'}}>
                <p>{reply.content}</p>
                <button 
                type='button'
                onClick={(e) => {
                 deleteReply(reply.replyNum) 
                }
              }
                >삭제</button>
              </div>
            </div>
          )
        })
      }  
      </div>
    </div>
  )
}

export default ReplyInfo