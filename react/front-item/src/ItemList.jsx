import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemList = () => {
  const[itemList, setItemList] =useState([]);
  
  //마운트 되면 spring에서 상품목록을 조회 후 데이터를 가져온다
  useEffect(() =>{
    axios
    .get('http://localhost:8080/items') //두번째 매개변수는 풋,포스트
    .then(response => {
      console.log(response.data);
      setItemList(response.data);
    })
    .catch(e => console.log(e));
    }
  ,[]);

  return (
      <>
      <h2>상품목록</h2>
        <table border={1}>
          <thead>
          <tr>
            <td>상품번호</td>
            <td>상품명</td>
            <td>가격</td>
            <td>등록일</td>
          </tr>
          </thead>

          <tbody>
          {
            itemList.length != 0 
            ?
             itemList.map((item,i) =>{
              return (
                <tr key={i}>
                  <td>{item.itemNum}</td>
                  <td>{item.itemName}</td>
                  <td>{item.itemPrice}원</td>
                  <td>{item.regDate}</td>
                </tr>
              )
            })
            :
            <tr>
              <td colSpan={4}>조회된 상품이 없습니다</td>
            </tr>
          }  
          </tbody>

        </table>
  
      
      </>
  )
}

export default ItemList