import React from 'react'
import { useParams } from 'react-router-dom'

const First = () => {
  //url parameter로 전달되는 데이터 받기
  const {age} = useParams();
  console.log(age);
  return (
    <div>
      <h3>first컴포넌트입니다</h3>
      <p>/first url을 입력하면 컴포넌트가 보입니다.</p>
      <p>{age}</p>
    </div>
  )
}

export default First