import React, { useState } from 'react'

const Test5 = () => {
const [man, setMan] = useState({
  //객체의 스프레드 연산자
  name : '김자바',
  age : 20,
  addr : '울산시'
});
  

  return (
    <>
    <div>
      <h2>{'이름 : ' + man.name}</h2>
      <h2>{'나이 : ' + man.age}</h2>
      <h2>{'주소 : ' + man.addr}</h2>
    <button type='button' onClick={() => {
     setMan({...man, name : '홍길동'});
    }}>{'이름 홍길동으로 변경'}</button>
    <button type='button' onClick={() =>{
     setMan({...man, age : 30})
    }}>{'나이를 30으로 변경'}</button>
    <button onClick={() =>{
     setMan({...man, addr : '서울시'})
    }}>{'주소를 서울시로 변경'}</button>
    </div>
    </>
  )
}

export default Test5