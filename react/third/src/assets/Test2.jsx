import React, { useState } from 'react'
import './Test2.css'

const Test2 = () => {
  const[display, setDisplay] = useState('ON');
  const[btn, setBtn] = useState('OFF');


  return (
  <>
  <h2>{display}</h2>

<button type='button' onClick={() =>
  {
    setDisplay(display === 'ON' ? 'OFF' : 'ON');
    setBtn(btn === 'ON' ? 'OFF' : 'ON');
  }
}>{btn}</button>
  </>
  )
}

export default Test2