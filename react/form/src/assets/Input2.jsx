import React, { useState } from 'react'

const Input2 = () => {
 const[data,setData] = useState('');  
 const[data1,setData1] = useState('');

  return (
    <>
      <input type="text"
       value = {data}
       onChange={(e) =>{
        setData(e.target.value);
        console.log(e.target.value);
        }
       }
    
      />
      <input type="text"
       value = {data1}
       onChange={(a) =>{
        setData1(a.target.value);
        console.log(a.target.value);
        }
       } 
      />
    </>
  )
}

export default Input2