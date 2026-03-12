import React from 'react'
import HeaderLayout from '../layout/HeaderLayout'

const CarHome = () => {
  return (
    <div>
      <HeaderLayout/>
       <div>
        <h3>차량 등록</h3>
        <div>
          <div>
            <p>제조사</p>
            <select name="선택" id=""></select>
          </div>
          <div>
            <p>모델명</p>
            <input type="text" />
          </div>
          <div>
            <p>차량가격</p>
            <input type="text" />
          </div>
        </div>
      </div>
      <div><button>등록</button></div>
    </div>
  )
}

export default CarHome