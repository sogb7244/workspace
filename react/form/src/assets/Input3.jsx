import React, { useState } from 'react'

const Input3 = () => {



  const [data, setData] = useState({
    id : '',
    pw : '',
    name : ''
  }
);
  console.log(data);

  //data 변수 변경 함수
  const handleData = (e) => {
      console.log(e.target.name);

    setData({...data,
        [e.target.name]: e.target.value}
        ); 
  };

  return (
    <>
    아이디
    <input 
      type="text"
      name='id'
      value={data.id}
      onChange={e => handleData(e)}

    />
    <br />

    비밀번호
    <input 
      type="password" 
      name= 'pw'
      value={data.pw}
      onChange={e => handleData(e)}
    />
    <br />

    이름
    <input 
      type='text'
      name= 'name'
      value={data.name}
      onChange={e =>handleData(e)}
    />

    </>
  )
}

export default Input3