import axios from 'axios';
import React, { useState } from 'react'

const ItemForm = () => {
  //입력한 데이터를 저장할 state변수
  const [itemData,setData] = useState({
    itemName : '',
    itemPrice : '',
    itemIntro : ''
  });
  const handleData = e =>{
      setData({
        ...itemData,
        [e.target.name] : e.target.value
      })
  }
  console.log(itemData);

  return (
  <>
    상품명
    <input 
      type="text" 
      name="itemName"
      value={itemData.itemName}
      onChange={e =>handleData(e)}
    />
    <br />
    가격
    <input 
      type="text"
      name="itemPrice"
      value={itemData.itemPrice}
      onChange={e => handleData(e)} />
    <br />

    상품소개
    <textarea 
      name="itemIntro"
      value={itemData.itemIntro}
      onChange={e => handleData(e)}></textarea>
    <br />
    <button type='button'
      onClick={() => {
        axios
        .post('http://localhost:8080/items',itemData)
        .then(response => alert("등록완료"))
        .catch(e => console.log(e));
      }}>등록</button>
  </>
  )
}

export default ItemForm