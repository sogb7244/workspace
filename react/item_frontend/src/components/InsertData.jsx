import axios from 'axios';
import React, { useState } from 'react'
import { insertData } from '../api/insert';
import Btn from '../common/Btn';

const InsertData = () => {
    const [insertdt,setInsertdt] =useState({
        itemName : '',
        price : '',
        itemRegName : '',
        itemIntro : '',
    });

    const items = async() => {
        if(!window.confirm("등록하시겠습니까?")) {
            return;
        }
            {
                await insertData(insertdt);
            }
        }

    const handleData = (e) => {
        setInsertdt({
            ...insertdt,
            [e.target.name] : e.target.value
        })
    }

  return (
    <div>
        <p>상품명</p>
        <input type="text"
            name='itemName'
            value={insertdt.itemName}
            onChange={(e) => {
                handleData(e);
            }}/>
        <p>가격</p>
        <input 
            type="text"
            name='price'
            value={insertdt.price}
            onChange={(e) => {
                  setInsertdt({
            ...insertdt,
            [e.target.name] : e.target.value
        })
            }}
        />
        <p>등록자</p>
        <input 
            type="text"
            name='itemRegName'
            value={insertdt.itemRegName}
            onChange={(e) => {
                handleData(e);
            }}
        />
        <p>상품소개</p>
        <input 
            type="text"
            name='itemIntro'
            value={insertdt.itemIntro}
            onChange={(e) => {
                handleData(e);
            }}/>
            <p><Btn
                title='등록'
                onClick={e => {
                    items();
                    console.log(insertdt)
                }}/></p>
            
    </div>
  )
}

export default InsertData