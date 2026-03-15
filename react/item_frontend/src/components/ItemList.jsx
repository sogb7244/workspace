import axios, { Axios } from 'axios'
import React, { useEffect, useState } from 'react'
<<<<<<< HEAD
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
  
=======
<<<<<<< HEAD
import { getList } from '../api/getList';
=======
import { detail } from '../api/detail';
import { useNavigate } from 'react-router-dom';
import { insertData } from '../api/insert';
>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f

const ItemList = () => {
  
  const [item,setitem] = useState([]);
  const nav = useNavigate();
 

//마운트,리렌더링할때
useEffect(() => {
   getLists();
},[])
<<<<<<< HEAD
//axios로 받아온 item목록
const getLists = async() => {
    const response = await getList();
    setitem(response.data)
    console.log(response.data)
  }
//상세페이지
const getDetail = async() => {
  const response = await getDetail();
  console.log(response.data)
}
=======
  
>>>>>>> 6c53abf47fccca4bf8612a0d001ade5478be7ea3
  const click = async(itemNum) => {
    const response = await detail(itemNum)
    return response.data;
  }

>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
          {
            item.map((items,i) =>{
              return(
                <tr key={items.itemNum}>
                  <td>{items.itemNum}</td>
                  <td 

                    onClick={e => {getDetail(i.items);}}>{items.itemName}</td>
                  <td>{items.price}</td>
                  <td>{items.itemRegName}</td>
                  <td>{items.itemRegDate}</td>
                </tr>
              )
            })
          }
=======
>>>>>>> 6c53abf47fccca4bf8612a0d001ade5478be7ea3
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
<<<<<<< HEAD
=======
>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f
>>>>>>> 6c53abf47fccca4bf8612a0d001ade5478be7ea3
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