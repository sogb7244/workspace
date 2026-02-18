import axios, { Axios } from 'axios'
import React, { useEffect, useState } from 'react'
import { detail } from '../api/detail';
import { useNavigate } from 'react-router-dom';
import { insertData } from '../api/insert';

const ItemList = () => {
  
  const [item,setitem] = useState([]);
  const nav = useNavigate();
 

useEffect(() => {
  axios.get('http://localhost:8080/items')
  .then(
    response => {
      setitem(response.data);
      console.log(response.data)
    }
  )
  .catch(e => console.log(e))
},[])
  
  const click = async(itemNum) => {
    const response = await detail(itemNum)
    return response.data;
  }

  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>가격</td>
            <td>상품등록자</td>
            <td>등록일</td>
            <td>소개</td>
          </tr>
        </thead>
        <tbody>
         {
          item.map((item,i)=>{
            return(
              <tr key={i}>
                <td>{item.itemNum}</td>
                <td
                  onClick={() => {
                    click(item.itemNum);
                    nav(`/detail/${item.itemNum}`);
                  }} >{item.itemName}</td>
                <td>{item.price}</td>
                <td>{item.itemRegName}</td>
                <td>{item.itemRegDate}</td>
                <td>{item.itemIntro}</td>
              </tr>
            )
          })
         }
        </tbody>
      </table>
      <div>
        <button 
          type='button'
          onClick={() => {
            nav('/insert')
          }}
          >등록</button>
      </div>
    </div>
  )
}

export default ItemList