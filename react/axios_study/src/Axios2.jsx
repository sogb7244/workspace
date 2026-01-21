import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios2 = () => {
  //spring에서 린턴받은 데이터를 저장하기 위해 state 변수의 초기값은
  //최종 데이터 자료형을 따라간다.
  const [data, setData] = useState(null);

  //마운트 시에만 실행
  useEffect(() => {
    axios
     .get('http://localhost:8080/emp/1')
     .then((response) => {
      console.log(response.data);
        setData(response.data);
     })
      .catch((e) => {});
  },[]);
  
  return (
<div>
  {data && data.empName} 
  
</div>
  )
}

export default Axios2