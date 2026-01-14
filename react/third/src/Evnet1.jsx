import React from 'react'

const Evnet1 = () => {
 

 
  function aaa(){
    alert(2);
  }
  const bbb = num => alert(num);
  

  return (
    <>
    <div>Evnet1</div>
    <hr />
    <button type = 'button' onClick={() => {
      alert(1);
    }}>클릭</button>
    <button type='button' onClick={() => {
      console.log('hi');
      console.log('hello');
    }}>클릭2</button>
    <input type="text" onChange={() => {
      alert(2);
    }} />
    <input type="text" onChange={() =>{
      {aaa()};
    }} />
    <input type="text" onChange={() =>{bbb(5)}} />
    </>
  )
}

export default Evnet1