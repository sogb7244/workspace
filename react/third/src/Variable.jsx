
import React from 'react'
//jsx에서는 변수를 html로 표현할 수 있음
const Variable = () => {
  const num = 10;
  const name = 'kim'
  const arr = [1,2,'str']
  const flag = true;
  const data = null;
  //undefined :정의되지않음
  //변수는 있지만 초기값이 없을 때
  //변수 선언이 되지 않았을 대
  const data2 = undefined;
  const num1 = 10;
  console.log(num1);
  const num2 = 20;
  console.log(num2);
  //객체 전체를 화면에 출력하면 오류발생
  const person = {
    name : "kim",
    age : 20
  };

  return (
    <>
    <div>{num}</div>
    <div>{name}</div>
    <div>{arr}</div>
    <div>{arr[2]}</div>
    <div>flag = {flag}</div>
    <div>data = {data}</div>
    <div>{person.name}</div>
    
    <div>data2 = {data2}</div>
    </>
  )
}


//export 하지 않으면 다른 파일에서 import 불가
export default Variable