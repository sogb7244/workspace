import React, { useState } from 'react'

const Test1 = () => {
  const [data, setData] =useState({
    name : '',
    han : 0,
    eng : 0

  }
);
//data 변수
  const handleData = a =>{
    setData({...data,
      [a.target.name] :a.target.value
    })
  }

  return (
  <>
  이름
   <input 
    type="text"
    name='name'
    value={data.name}
    onChange={e => 
    handleData(e)}
  />
  <br />

  국어점수
  <input 
    type="text"
    name='han'
    value={data.han}
    onChange={e => 
    handleData(e)}
  />
  <br />
  영어점수
  <input 
    type="text"
    name='eng'
    value={data.eng}
    onChange={e => 
    handleData(e)}
  />

  <div>
    입력한 학생 정보입니다.
    
    <br />
    이름 :   {data.name}
    국어점수 :  {data.han}
    영어점수 :  {data.eng}
    총점 :   {Number(data.han) + Number(data.eng)}
    
  </div>

  </>

  )
}

export default Test1