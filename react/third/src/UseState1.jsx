import React, { useState } from 'react'

const UseState1 = () => {
  

  //useState는 2개의 데이터를 갖는 배열이다
  //0변째 요소에는 매개변수로 전달한 데이터가 들어있음
  //1번째 요소에는 함수가 들어있음
  //1번째 함수는 변수의 값을 변경하는 기능을 제공하는 함수 
  //결론! 데이터의 값 변경이 화면에 반영되려면
  //해당 데이터는 반드시 useState로 선언해야함
  //useState를 사용해 만들어진 변수(title)를 state 변수라 함
  //useState를 사용해 만들어진 함수(setTitle)를 state 변경 변수라 함
  //state 변경함수가 실행되면 컴포넌트를 리렌더링한다
  //리렌더링 : 컴포넌트의 처음부터 끝까지 다시 
  //실행된다.
  //스테이트 변수는 리렌더링 되더라도 초기화 되지 않는다!


 
  const [kk,setTitle] = useState('hello');
  console.log(5);

  return (
    <>
    <div>UseState1</div>
    <h2>{kk}</h2>
    <button type='button' onClick={() =>{
      setTitle(10); //a변수의 값을 10으로 변경하는 코드
    }}>클릭</button>
    </>
  )
}

export default UseState1
