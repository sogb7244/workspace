import React from 'react'
import stlyes from './HeaderLayout.module.css'
import { useNavigate } from 'react-router-dom'

const HeaderLayout = () => {
  const nav = useNavigate();
  return (
    <div>
      <div>
      <table>
        <thead>
          <tr className={stlyes.homeList}>
            <td
              onClick={ e =>nav('/')}>홈</td>
            <td>차량관리</td>
            <td>판매정보등록</td>
            <td>판매목록조회</td>
          </tr>
        </thead>
      </table>
      </div>
     </div>
  )
}

export default HeaderLayout