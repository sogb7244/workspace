import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemDetail = () => {
  const[itemData, setData] = useState ({
    itemNum : 0,
    itemName : '',
    itemPrice : '',
    regDate : '',
    itemIntro : ''
  });
  console.log(itemData)
   
    
  return (
    <>
    <div>
    상품번호
    <input 
      type="text"
      name="itemNum"
      value={itemData.itemNum}
      onChange={(e) =>{
        setData({
          ...itemData,
          [e.target.name] : e.target.value
        })
      }
        
      }
      />
      <button 
        type='button'
        onClick={()=>{
         axios
      .get('http://localhost:8080/items')
      .then(response=>{
       
        console.log(response.data)
      })
      .catch(e => console.log(e))
        }}
        >조회</button>
    </div>
      
    <div>
      조회한 상품정보입니다.
      <br />
      상품번호 :
      <br />
      상품명 :
      <br />
      가격 : 
      <br />
      등록일 :
      <br />
      상품소개 : 
    </div>
    </>
  )
}

export default ItemDetail