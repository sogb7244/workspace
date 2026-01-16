import React, { useState } from 'react'

const Radio = () => {
  //radio는 name 속성값이 같아야 세트로 판단!
  //radio에서 선택한 데이터를 저장할 변수
  //초기값은 최초로 선택될 라디오의 value값을 지정
  const[data, setData] = useState('Y');
  

  return (
    <div>
      <input 
        type="radio" 
        name='aa' 
        value={'Y'} 
        checked={data === 'Y'}
        onChange={e =>{
          setData(e.target.value)
        }}
      />예
      <input 
        type="radio" 
        name='aa' 
        value={'N'}
        onChange={e => {
          setData(e.target.value)
        }}
      />아니오

    </div>
  )
}

export default Radio