import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { detail } from '../api/detail';
import { deleteDetail } from '../api/delete';

const ItemsDetail = () => {
    const { itemNum } = useParams();
    const [item, setItem] = useState({});
    const nav = useNavigate();

    useEffect(() => {
        const getDetailData = async () => {
            const response = await detail(itemNum);
            setItem(response.data)
            console.log(response.data);
        };
        getDetailData();
    }, [itemNum]);
    
    const deleteData = async() => {
       if(!window.confirm("정말로 삭제하시겠습니까?")){
        return;
       }
       {
            try{
                 await deleteDetail(itemNum);
                 alert("삭제되었습니다.")
                 nav('/')
            }catch(e){
                console.log("삭제실패",e);
            }
       } 
    }

    return (
        <>
            <div>
                <div>
                    <p>상품명</p>
                    <p>{item.itemName}</p>
                </div>
                <div>
                    <p>상품소개</p>
                    <p>{item.itemIntro}</p>
                </div>
                <button 
                    type='button'
                    onClick={() =>{
                        deleteData();
                    }}
                    >삭제</button>
                <button 
                    type='button'
                    onClick={()=>{
                        nav(`/update/${item.itemNum}`)
                    }}>수정</button>
            </div>
        </>
    );
};

export default ItemsDetail;