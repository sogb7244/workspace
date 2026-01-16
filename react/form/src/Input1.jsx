import React, { useState } from 'react'

const Input1 = () => {
  //input태그의 초기값 && input태그에 입력한 내용을 저장할 변수
  const [data,setData] = useState('');

  return (
    <div>
      <input
        id='abc'
        type="text" 
        value={data} 
        //e -> 이벤트에 대한 모든 정보가 들어가 있음
        onChange={(e) =>{
          //e.target => 이벤트가 발생한 태그
          console.log(e.target);
          console.log(e.target.type);
          console.log(e.target.id);
          console.log(e.target.value);

          setData(e.target.value);
        }}
      />
    </div>
   
  )
}

export default Input1