import React, { useState } from 'react'

const Test3 = () => {
  const [btn,setA] = useState('광고 닫음');
  const [display,setB] = useState(true);



  

  return (
    <>

    {
      display
      ?
      <h2>100퍼센트 할인</h2>
      : 
      null

    }
    <button type='button' onClick={() =>
      {
        setA(btn === '광고 닫음' ? '광고  보임' : '광고 닫음');
        setB(!display);

       
      }
    }>{btn}</button>
    </>
  )
}

export default Test3