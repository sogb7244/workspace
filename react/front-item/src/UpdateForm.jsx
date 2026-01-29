import axios from 'axios';
import React, { useState } from 'react'

const UpdateForm = () => {
  //인풋태그에 입력한 정보를 저장하는 state 변수
  const [data, setData] = useState({
    //입력받은 데이터 저장 (키값이랑 같아야함)
    itemNum : '',
    itemName : '',
    itemPrice : ''
  });
  //수정함수
  const updateItem = () =>{
    axios.put(`http://localhost:8080/items/${data.itemNum}`,data)
    .then(response => alert('수정완료'))
    .catch(e => console.log(e));
  }
 
  //데이터 변경함수
  const inputChange = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
    console.log(data);
  
  return (
  <div>
    상품번호
    <input 
      type="text"
      value={data.itemNum}
      name='itemNum'
      onChange = {e => inputChange(e)}/>
    <br />
    상품명
    <input 
      type="text"
      name="itemName"
      value={data.itemName}
      onChange= {e => inputChange(e)}
      />
    <br />
    가격
    <input 
      type="text"
      value={data.itemPrice}
      name='itemPrice'
      onChange = {e => inputChange(e)} />
    <br />
    <button
     type='button'
     style={
     {
      backgroundColor : 'blue'
     }}
     onClick={(e) => updateItem(e)}
      >
      수정
    </button>
  </div>
  )
}

export default UpdateForm