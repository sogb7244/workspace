import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import { detail } from '../api/detail';
import { updateDetail } from '../api/update';


const ItemUpdate = () => {
    const {itemNum} =useParams();
    const nav = useNavigate();
    const [items,setItems] = useState({
        itemName : '',
        itemIntro : '',
        itemRegName : '',
        price : ''
    });

    useEffect(() => {
        const aaa =async() =>{
            const res = await detail(itemNum)
            setItems(res.data);
        };
        aaa();
        
    },[itemNum])

    const handleData =(e) => {
        setItems({
            ...items,
            [e.target.name] : e.target.value
        })
    }
    const handleupdate = async() => {
        const result = await updateDetail(items);
        if(result){
            alert("수정완료ㅕ")
            nav(`/detail/${itemNum}`)
        }
    }
    return (
      <div>
        <p>상품명</p>
        <input 
          type="text"
          name='itemName'
          value={items.itemName}
          onChange={(e) => {
            handleData(e);
          }}
          />
        <p>소개</p>
        <textarea 
            name="itemIntro"
            value={items.itemIntro}
            onChange={e => {
                handleData(e);
            }}/>
        <p>등록자</p>
        <input 
            type="text"
            name="itemRegName"
            value={items.itemRegName}
            onChange={e => {
                handleData(e);
            }}/>
        <p>가격</p>
        <input
          type="text"
          name="price"
          value={items.price}
          onChange={e => {
            handleData(e);
            }}/>
            <button 
                type='button'
                onClick={e => {
                    handleupdate(e);
                }}
                >
                수정
            </button>
      </div>
    )
};

export default ItemUpdate;