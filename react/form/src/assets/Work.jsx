import React, { useState } from 'react'

const Work = () => {
  const[data,setA] =useState({
    grade : '대졸',
    school : '학교명',
    select : '신입',
    justy : '',
    date : '',
    insti : '',
    cmpn : '',
    work : '',
    long : '',
    long2 : '',
    introduce : ''
  });
  const changeA = e => setA({
    ...data,
    [e.target.name] : e.target.value
  })
  console.log(data);
  return (
    <div>
      학력
      <br />
      <select
         name="grade"
         value={data.grade}
         onChange={e => changeA(e)}
      >
        <option 
          value="대졸">대졸</option>
        <option value="대학졸업예정">대학졸업예정</option>
        <option value="전문대졸">전문대졸</option>
        <option value="고졸">고졸</option>
      </select>
      <input 
        name='school'
        type="text"
        value={data.school}
        onChange={e => changeA(e)}
      />
      <br />
      지원구분
      <input 
        type="radio"
        name='select'
        value='신입'
        checked={data.select === '신입'}
        onChange={e => changeA(e)} /> 신입
      <input 
        type="radio"
        name='select'
        value='경력'
        checked={data.select === '경력'}
        onChange={e => changeA(e)} /> 경력
        <br />

        자격정보
        <br />
        자격증명 취득일자 발행기관
        <br />
        <input 
           size={4}
          type="text"
          name='justy'
          value={data.justy}
          onChange={e => changeA(e)}
        />
         <input 
          size={4}
          type="date"
          name='date'
          value={data.date}
          onChange={e => changeA(e)}
        />
         <input 
          size={4}
          type="text"
          name='insti'
          value={data.insti}
          onChange={e => changeA(e)}
        />
        <br />
        경력정보
        <br />
        회사명 담당업무 경력기간
        <br />
        <input
          type="text"
          size={3}
          value={data.cmpn}
          name='cmpn'
          onChange={e => changeA(e)}
         />
        <input
          type="text"
          size={3}
          value={data.work}
          name='work'
          onChange={e => changeA(e)}
         />
        <input
          type="text"
          size={3}
          value={data.long}
          name='long'
          onChange={e => changeA(e)}
        />
        년
           <input
          type="text"
          size={3}
          value={data.long2}
          name='long2'
          onChange={e => changeA(e)}
        />개월
        <br />
        자기소개
        <br />
        <textarea
          name="introduce"
          value={data.introduce}
          onChange={e => changeA(e)}           
        ></textarea>














    </div>
  )
}

export default Work