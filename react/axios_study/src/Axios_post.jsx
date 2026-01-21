import axios from 'axios';
import React, { useState } from 'react'

const Axios_post = () => {
  //입력한 데이터를 저장할 state 변수
  const [empData, setEmpData] = useState({
    empNum : 0,
    empName : '',
    empPart: '',
    empSale : '',
    empClass: ''
  });
  //데이터 입력 함수
  const handleEmpData = e =>{
    setEmpData({
      ...empData,
      [e.target.name] : e.target.value
    })
  }
  console.log(empData);
  //등록 버튼 클릭 시 spring으로 요청을 보내는 함수
  //post 함수의 두번째 매개변수는 spring으로 전달할 데이터이다.
  //전달할 데이터는 객체 형태로 보내야 함
  const regEmp = () => {
    axios
    .post('http://localhost:8080/emp',empData)
    .then(response => {alert('통신성공')})
    .catch(e => {console.log(e)})
  }
 
  return (
   <>
    <h3>입력 데이터 spring으로 전달하기</h3>
    <div>
      사번
      <input type="text" 
      onChange={(e) => handleEmpData(e)} 
      value={empData.empNum}
      name='empNum'
      />
    </div>
    <div>
      사원명
      <input 
      type="text" 
      onChange={(e) => handleEmpData(e)} 
      value={empData.empName}
      name='empName'
      />
    </div>
    <div>
      부서명
      <input type="text"
      onChange={(e) => handleEmpData(e)} 
      value={empData.empPart}
      name='empPart'
       />
    </div>
    <div>
      급여
      <input type="text"
      onChange={(e) => handleEmpData(e)} 
      value={empData.empSale}
      name='empSale' />
    </div>
    <div>
      직급
      <input type="text"
      onChange={(e) => handleEmpData(e)} 
      value={empData.empClass}
      name='empClass' />
    </div>
    <div>
      <button type='button'
      onClick={() => regEmp()}>등록</button>
    </div>
   </>
  )
}

export default Axios_post