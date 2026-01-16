import React, { useState } from 'react'

const Select = () => {
      const [data ,setData] = useState('5');

  
  return (
    //select 태그에서 선택한 데이터를 저장할 state변수
    //선택한 option 태그의 value 값을 저장하는거임
    //select의 value 속성값과 일치하는 option 태그의 value를 가진 태그가 화면에 보임

    //select는 눈에 보이는 글자를 저장하는게 아니라,
    //초기값은 화면에 표현한 option태그의 value값을 지정

    <div>
      <select
         value={data}
         onChange={e =>{setData(e.target.value)}}      
      >
        <option value='1'>java</option>
        <option value='5'>python</option>
        <option value='7'>javascript</option>
      </select>
    </div>
  )
}

export default Select