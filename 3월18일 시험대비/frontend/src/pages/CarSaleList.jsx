import React, { useEffect, useState } from 'react'
import { getSaleList } from '../api/carSale';
import  styles from './CarSaleList.module.css'

const CarSaleList = () => {
  const [SaleList,setSaleList] =useState([]);
  
  useEffect(()=>{
    getList()
  },[])
  const getList = async() => {
    const response = await getSaleList()
    setSaleList(response.data);
  }

  console.log(SaleList)
  return (
    <div className={styles.allContainer}>
      <table 
        className={styles.container}
      >
        <thead 
          className={styles.header}
          >
          <tr>
            <td rowSpan='2'>No</td>
            <td colSpan='4'>구매자 정보</td>
            <td colSpan='2'>차량정보</td>
          </tr>
          <tr>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>가격</td>
            </tr>
        </thead>
        <tbody>
            {
              SaleList.map((list,i)=>{
                return(
                  <tr key={i}>
                    <td>{SaleList.length-i}</td>
                    <td>{list.BUYER_NAME}</td>
                    <td>{list.BUYER_TEL}</td>
                    <td>{list.SALES_DATE.split('T')[0]}</td>
                    <td>{list.COLOR}</td>
                    <td>{list.MODEL_NAME}</td>
                    <td>{list.PRICE.toLocaleString()}원</td>
                  </tr>
                )
              })
            }
        </tbody>
      </table>
    </div>
  )
}

export default CarSaleList