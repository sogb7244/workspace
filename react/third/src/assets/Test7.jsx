import React, { useState } from 'react'

const Test7 = () => {
//TRUTHY -> true는 아닌데 true와 같은 결과로 판단
//FALSY -> false는 아닌데 false처럼 판단
//truthy
//1. 0이 아닌 숫자
//2. 빈 문자열이 아닌 문자열

//falsy
//1. 0
//2. 빈 문자열
//3. null
//4. undefined
//5. NaN (Not a Number) console.log('java' * 10)

//단락평가 : 논리연산에서 사용(&&, ||)




  //div 보여줌 여부를 결정하는 변수
  const[isShow,setIsShow] = useState(false);



  return (
    <>
    <div 
    style={{
      width:'300px',
      height:'60px',
      backgroundColor:'red'
    }}
    onMouseEnter={() => setIsShow(true)}
    onMouseLeave={() => setIsShow(false)}
    >
    마우스를 올리면 숨겨진 글자가 보여요
    </div>

    {
      isShow && //단락평가(자바스크립트 문법)
      <div style={
      {
        border:'1px solid black',
        width:'300px',
        height:'60px'
      }
      }
      >
      Hello React!
      </div>
     
    }
    
    <div>

    </div>
    </>  
  )
}

export default Test7