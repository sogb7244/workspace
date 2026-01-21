import axios from 'axios';
import React, { useState } from 'react'
//객체
const Axios_put = () => {
  const [emp, setEmp] =useState({
    empNum : 0,
    empSale : '',
    empPart : '개발부'
  })
  //데이터 입력함수
  const handleEmpData = e =>{
    setEmp({
      ...emp,
      [e.target.name] :e.target.value
    })
  }
  console.log(emp);
//
  ;
  return (
    <>
      <h3>사원 정보 수정</h3>
      <div>
        사번
        <input
        name='empNum' 
        type="text"
        onChange={(e) => 
        handleEmpData(e)}
        value={emp.empNum}
         />
      </div>
      <div>
        수정할 부서명
        <select
          name="empPart"
          value={emp.empPart}
          onChange={e => {
            handleEmpData(e)
          }}
          >
          <option value='개발부'>개발부</option>
          <option value="영업부">영업부</option>
          <option value="인사부">인사부</option>
        </select>
      </div>
      <div>
        수정할 급여
        <input type="text"
        name='empSale'
        value={emp.empSale}
        onChange={
          e =>handleEmpData(e)
        }
        />
      </div>
      <div>
        <button type='button'
        onClick={() => {
         axios
         .put(`http://localhost:8080/emp/${emp.empNum}`,emp)
         .then(response => alert('수정완료'))
         .catch(e => {console.log(e)})
        }}
        >수정</button>
      </div>
    
       
    </>
  )
}

export default Axios_put