import React, { useState } from 'react'
import './Test4.css'
const Test4 = () => {
  //스프레드(spread) 연산자
  // -> 배열, 객체에 저장된 데이터 각각을 흩뿌린다..
  // const array1 = [4,5];
  // const array2 = [1,2,array1];//데이터의 갯수 3개 [1,2,[4,5]]
  // const array3 = [1,2,...array1];//[1,2,4,5]
  const [arr,setArr] = useState([0,0,0]);

  //div 클릭 시 실행하는 함수
  const changeNum = (index) => {
    const copyArr = [...arr];
      copyArr[index] = copyArr[index] +1;
      setArr(copyArr);

  };
 
  return (
   <div className='test4_container'>
    <div onClick={() => changeNum(0)}>{arr[0]}</div>
    <div onClick={() => changeNum(1)}>{arr[1]}</div>
    <div onClick={() => changeNum(2)}>{arr[2]}</div>
   </div>
  )
}

export default Test4