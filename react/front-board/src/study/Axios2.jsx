import axios from 'axios'
import React, { useState } from 'react'

const Axios2 = () => {
  //조회한 학생 정보를 저장한 state 변수
  const [stuInfo, setStuInfo] = useState({

  });
  //학생의 상세정보 조회 및 점수 조회
  const getData = () => {}
    //학번이 1001번인 학생의 정보를 조회
    axios.get('http://localhost:8080/students/1001')
    .then(response => {
      setStuInfo(response.data); //성적번호 : 5
        //조회한 학생의 성적 정보 조회
      axios.get(`http://localhost8080/grades/${stuInfo.gradeNum}`)
      .then()
      .catch();

    })
    .catch();
    console.log(1)
  
  return (
    <div>

    </div>
  )
}

export default Axios2