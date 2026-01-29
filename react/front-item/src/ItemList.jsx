import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ItemList = () => {
  const[itemList, setItemList] =useState([]);
  //재조회를 위한 state 변수 (배열이나 객체)
  const [cnt ,setCnt] = useState({});

  //마운트 되면 spring에서 상품목록을 조회 후 데이터를 가져온다
  //마운트 + cnt값이 변경되어서 리렌더링 될 경우
  useEffect(() =>{
    axios
    .get('http://localhost:8080/items') //두번째 매개변수는 풋,포스트
    .then(response => {
      console.log(response.data);
      setItemList(response.data);
    })
    .catch(e => console.log(e));
    }
  ,[cnt]);
  const deleteItem = (itemNum) => {
    axios //delete는 겟이랑 같음
    .delete(`http://localhost:8080/items/${itemNum}`)
    .then(response => 
      //1.방금 삭제한 데이터는 표에서 삭제해 주세요.
      //2.상품 목록을 다시 조회해서 표를 그리세요(ㅇ)
      setCnt({})
  )
    .catch(e => console.log(e));
  }

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
            <td>삭제</td>
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
                  <td><button 
                  type='button'
                  onClick={e => deleteItem(item.itemNum)}
                  >삭제</button></td>
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