import React from 'react'


const Variable2 = () => {
  const num = 4;
  //num이 짜굿면 1을 출력, 홀수면 2를 출력
  let result = num % 2 === 0 ? 1:2
  // == : 값만 비교, 자료형은 비교하지 않음
  // === : 값과 자료형 모두 비교

  return (
    <>    
    <div>Variable2</div>
    <div>{result}</div>
    <div>{num % 2 === 0 ? 1:2}</div>
    </>
  )
}
  
export default Variable2