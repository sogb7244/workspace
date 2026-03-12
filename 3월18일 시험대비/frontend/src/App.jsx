import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import CarHome from './pages/CarHome'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <Routes>
          <Route path='/' element={<CarHome/>}>
          </Route>
        </Routes>   
    </>
  )
}

export default App
