import React, { useState } from 'react'

const Test6 = () => {
  const [num,setA] = useState(0);
  //-1 ~ +100까지 버튼 변수 만들고 
  //누를 때 마다 카운트 변경
  
  
  

  return (
    <>
    <div>
      <h1>{num}</h1>
      <button type='button' onClick={() => {
       setA(num -1)
      }}>-1</button>
      <button type='button' on onClick={() => {
        setA(num -10)
      }}>-10</button>
      <button type='button' on onClick={() => {
        setA(num-100)
      }}>-100</button>
      <button type='button' on>+100</button>
      <button type='button' on>+10</button>
      <button type='button' on>+1</button>
      
    </div>
    </>
  )
}

export default Test6