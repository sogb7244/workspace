import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import CarManager from './pages/CarManager'
import SellInfoReg from './pages/SellInfoReg'
import HeaderLayout from './layout/HeaderLayout'
import CarSaleList from './pages/CarSaleList'
import CarHome from './pages/CarHome'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <Routes>
          <Route path='/' element={<HeaderLayout/>}>
            <Route path='/' element={<CarHome/>}/>
            <Route path='car-info' element={<CarManager/>}/>
            <Route path='sale-Info' element={<SellInfoReg/>}/>
            <Route path='sale-list' element={<CarSaleList/>}/>
          </Route>
        </Routes>   
    </>
  )
}

export default App
