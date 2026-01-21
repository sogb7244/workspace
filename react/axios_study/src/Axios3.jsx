import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios3 = () => {
  //빽틱, 문자열과 변수를 편하게 함께 사용하는 문법
  const name = 'kim';
  const age = 20;

console.log(`내이름은 ${name}이고 , 나이는 ${age}살이며...`);

 //input 태그에 입력한 사번을 저장할
  const [empNo, setEmpNo] = useState('');
    console.log(empNo);
 //조회한 사원정보를 저장할 state 변수
  const [empInfo, setEmpInfo] = useState({});
 //버튼 클릭 시 사원 정보를 조회하는 함수
 const getEmpInfo = () => {
axios
      .get(`http://localhost:8080/emp/${empNo}`)
      .then(response => {
        console.log(response.data);
        setEmpInfo(response.data);
            })
      .catch((e) => console.log(e));
      //spring에서 사원정보를 조회한다.
 };
  
   
  return (
    <>
    <h3>아래 input태그에 입력한 사번을 가진 사원의 모든 정보를 버튼 클릭 시 출력</h3>
    <input type="text" placeholder='사번 입력'
    value={empNo}
    onChange={e => setEmpNo(e.target.value)}/>
    <button type='button' onClick={() => 
      getEmpInfo()
    }>조회</button>

    <div>
      <p>조회 정보입니다</p>
      <p>사번 : {empInfo.empNum}  </p>
      <p>사원명 :{empInfo.empName}</p>
      <p>급여 : {empInfo.empSale}</p>
      <p>부서명 :{empInfo.empPart} </p>
      <p>직급 :{empInfo.empClass} </p>
    </div>
    </>
  )
}

export default Axios3