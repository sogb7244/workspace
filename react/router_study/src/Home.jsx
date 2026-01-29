import React from 'react'
import { useNavigate } from 'react-router-dom'

const Home = () => {
  //useNavigate hook은 실행결과 함수를 리턴
  //useNavigate 결과를 전달받은 변수는 함수처럼 사용하면 됨
  const nav = useNavigate(); //nav();
  return (
    <>
    <h2>메인페이지</h2>
    <p>본 컴포넌트는 메인페이지라서 프로젝트 시작과 동시에 보입니다.</p>
    <button 
    type='button'
    onClick={e=>{nav('/first')}}
    >클릭하면 first 페이지로 이동</button>
    </>
  )
}

export default Home