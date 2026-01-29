import React, { useState } from 'react'
import Title from './Title'
import Display from './Display'
import Controller from './Controller'

const Test6 = () => {
//현재 숫자를 저장할 state 변수
const[cnt,setCnt] =useState(0);

  return (
    <>
    <Title />
    <Display cnt = {cnt} />
    <Controller 
      setCnt = {setCnt}
      cnt={cnt}/>
    </>
  )
}

export default Test6