import React from 'react'
import styles from './CarHome.module.css'

const CarHome = () => {
  return (
    <div className={styles.container}>
      <h1>차량 판매 관리 시스템</h1>
      <p>차량 정보 등록, 판매 정보 등록, 판매 목록 조회를 관리하는 시스템입니다.</p>
    </div>
  )
}

export default CarHome