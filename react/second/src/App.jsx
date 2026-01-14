//이건 함수가 아님
//함수 형태인데 대문자로 시작 -> 컴포넌트

import Footer from "./assets/Footer";
import Header from "./Header";

//컴포넌트의 리턴문에 html 코드가 있으면 화면에 그려줌
function App() {
  let str = 'hi';
  let num = 10;
  let num2 =5;
  //return 안의 html 코드는 반드시! 하나의 태그에 포함되어야 함
  return (
    <div>
      <Header />      
      <div>
        <div>{str}</div>
        <div>{num}</div>
        <div>{num-num2}</div>
      </div>
      <Footer />
    
      <input type="text" />
   </div>
  )
}




export default App
