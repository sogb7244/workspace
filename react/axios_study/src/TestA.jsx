import axios from 'axios'
import React, { useEffect, useState } from 'react'

const TestA = () => {
  //조회한 사원 목록 정보를 저장할 변수
  //변수의 초기값은 저장될 데이터 형태와 일치해야함
  const [empList,setEmpList] =useState([
  ]);  

  //마운트 시점에 사원 목록을 조회한다
useEffect(() =>{
  axios
.get('http://localhost:8080/emp')
.then(response => {
  setEmpList(response.data);
})
.catch(e => {console.log(e)})

},[])


  return (
    <>
      <table border={1}>
        <thead>
          <tr>
            <td>사원번호</td>
            <td>사원명</td>
            <td>부서</td>
            <td>급여</td>
            <td>직위</td>
          </tr>
        </thead>
        <tbody>
          {
            empList.map((e,i) => {
              return(
                <tr key={i}>
                  <td>{e.empNum}</td>
                  <td>{e.empName}</td>
                  <td>{e.empPart}</td>
                  <td>{e.empSale}</td>
                  <td>{e.empClass}</td>
                </tr>
              )
            })
          
          }
        </tbody>



      </table>

    </>
  )
}

export default TestA