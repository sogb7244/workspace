import React from 'react'
import stlyes from './HeaderLayout.module.css'
import { Outlet, useNavigate } from 'react-router-dom'

const HeaderLayout = () => {
  const nav = useNavigate();
  return (
    <div>
      <table>
        <thead>
          <tr className={stlyes.homeList}>
            <td
              onClick={e=>nav('/')}>홈</td>
            <td
              onClick={ e =>nav('/car-info')}>차량관리</td>
            <td
              onClick={ e =>nav('/sale-info')}>판매정보등록</td>
            <td
              onClick={ e =>nav('/sale-list')}>판매목록조회</td>
          </tr>
        </thead>
      </table>
    <Outlet/>
    </div>
  )
}

export default HeaderLayout