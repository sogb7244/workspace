import { Link, Route, Routes } from "react-router-dom"
import First from "./First"
import Home from "./Home"


function App() {


  return (
    <>
      <h2>라우팅 연습</h2>
      
      <div>
        <Link to={""}>home</Link>
        <br />
        <Link to={"/first"}>first</Link> 
        {/* path랑 일치시켜야함 */}
        <br />
        <Link to={"second"}>second</Link>
        <br />
        home
        first
        second
      </div>

      <Routes>
        <Route 
          path="" 
          element={<Home />}
        />
        <Route 
          path="/first/:age" 
          element={<First />}
        />
        <Route 
          path="/second" 
          element={<div>두번째 페이지</div>}
        />
        <Route 
          path="/third" 
          element={<div>세번째 페이지</div>}
        />
         <Route 
          path="*"  //잘못된 url 입력시 뜨는 페이지
          element={<div>없는 페이지입니다</div>}
        />
      </Routes>
    </>
  )
}

export default App
