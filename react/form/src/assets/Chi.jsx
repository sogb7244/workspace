import React, { useState } from 'react'

const Chi = () => {
  const[data,setA] = useState({
    select : 'A',
    much : 0,
    date : '',
    question : ''
  })

  const changeA = (e) => {
    setA({
    ...data,
    [e.target.name] :e.target.value
  })}
  console.log(data);
  
  return (
   <div>
      치킨 종류와 상관없이 무조건 만원
      <br />

      <input 
        type="radio"
        name='select'
        value='A'
        checked = {data.select === 'A'}
        onChange={e => changeA(e)
          
         } />후라이드치킨
      <input
        type="radio"
        name='select'
        value='B'
        checked = {data.select === 'B'}
        onChange={e => changeA(e) }  />양념치킨
      <input
        type="radio"
        name='select'
        value='C'
        checked = {data.select === 'C'}
        onChange={e => changeA(e)}  />간장치킨
      <input  
        type="radio"
        name='D'
        checked = {data.select === 'D'}
        value={data.select}
        onChange={e => changeA(e) }  />고추바사삭
      <input 
        type="radio"
        name='E'
        checked = {data.select === 'E'}
        value={data.select}
        onChange={e => changeA(e) } />뿌링클
      <input  
        type="radio"
        name='F'
        checked = {data.select === 'F'}
        value={data.select}
        onChange={e => changeA(e) }  />매운핫치킨
      <br />

      몇마리<input 
                type='number'
                size={10}
                name='much'
                value={data.much}
                onChange={e => changeA(e)} 
              />
      주문일 <input 
                type="date"
                size={10}
                name='date'
                value={data.date}
                onChange={e => changeA(e)} 
              />
      <br />

      요청사항
      <br />
      <textarea
         name="question"
         value={data.question}
         onChange={e => changeA(e)}
         ></textarea>
    

   </div>
  )
}

export default Chi