import axios from 'axios';
import React, { useState } from 'react'

const Axios4 = () => {
  //셀렉트 태그에서 선택한 사번을 저장할 state 변수
  const [empNo ,setNo] = useState('0');

  //선택 시 사원 정보 조회
  const [empInfo, setEmpInfo] =useState({});
  //클릭시 조회하는 함수
  const getEmpInfo = (a) =>{
    axios
    .get(`http://localhost:8080/emp/${a}`)
    .then(response => {
      setEmpInfo(response.data);
    })
    .catch((e) => {console.log(e)});
  }

  return (
    <>
      <h3>조회할 사번 선택</h3>


      <select
       name="data"
       value={empNo}
       onChange={(e) => {
        setNo(e.target.value);
        getEmpInfo(e.target.value);
        
        }}     >
        <option value='0'>사번선택</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
      </select>
      <div>
        <p>조회한 사원 정보입니다.</p>
        <p>사번 : {empInfo.empNum} </p>
        <p>사원명 : {empInfo.empName}</p>
        <p>직급 : {empInfo.empClass}</p>
        <p>급여 : {empInfo.empSale}</p>
        <p>부서명 : {empInfo.empPart}</p>
      </div>
    </>
  )
}

export default Axios4