import React from 'react'
import HeaderLayout from '../layout/HeaderLayout'
import { Outlet } from 'react-router-dom'

const CarHome = () => {
  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      <h1>차량 판매 관리 시스템</h1>
      <p style={{ marginTop: '20px', color: '#666' }}>차량 정보 등록, 판매 정보 등록, 판매 목록 조회를 관리하는 시스템입니다.</p>
    </div>
  )
}

export default CarHome