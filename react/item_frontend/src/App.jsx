import { Route, Routes } from 'react-router-dom'
import './App.css'
import ItemList from './components/ItemList'
import ItemsDetail from './components/ItemsDetail'
import ItemUpdate from './components/ItemUpdate'
import InsertData from './components/InsertData'
function App() {

  return (
    <div>

    <Routes>
      <Route path='/' element={<ItemList/>}></Route>
      <Route path='detail/:itemNum' element={<ItemsDetail/>}></Route>
      <Route path='update/:itemNum' element={<ItemUpdate/>}></Route>
      <Route path='insert' element={<InsertData/>}></Route>
    </Routes>

    </div>
  )
}

export default App
