import axios, { Axios } from 'axios'
import React, { useEffect, useState } from 'react'

const ItemList = () => {
  const [item,setitem] = useState([]);

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
          </tr>
        </thead>
        <tbody>
         
        </tbody>
      </table>
    </div>
  )
}

export default ItemList