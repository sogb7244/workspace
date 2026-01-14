import React, { useState } from 'react'
import './Test1.css'


// ./ -> 현재 파일 위치를 기준으로
const Test1 = () => {
  const[num, setNum] = useState(0);

  return (
   <>
   <div className='red_rect'>{num}</div>
   <button type='button' onClick={() => {
    //num값을 1증가
    setNum(num + 1);
   }}>클릭</button>
   </> 
  )
}

export default Test1