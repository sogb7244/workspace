import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import CarHome from './pages/CarHome'
import SellInfoReg from './pages/SellInfoReg'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <Routes>
          <Route path='/' element={<CarHome/>}>
          <Route path='/sell-Info' element={<SellInfoReg/>}/>
          </Route>
        </Routes>   
    </>
  )
}

export default App
