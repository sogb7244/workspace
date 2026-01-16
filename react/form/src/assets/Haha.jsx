import React, { useState } from 'react'

const Haha = () => {
  const[name, setName] = useState({
    name: '',
    age:'',
    grade : "1",
    gender : 'F',
    intro : ''    
  });

  const handleData = (e) =>{
    setName({...name,
            [e.target.name] : e.target.value
    
  })
}
  console.log(name);


  return (
    <div>
      이름 : <input 
        type='text'
        name='name'
        value={name.name}
        onChange={e => handleData(e)}
          
      /> 
      <br />
      나이 : <input 
        type="text"
        name='age'
        value={name.age}
        onChange={e => handleData(e)}
       
        
       />
      <br />
      학년 : 
      <select 
         name='grade'
        value={name.grade}
        onChange={e => handleData(e)}
          
        
        >
       <option value="1">1학년</option>
       <option value="2">2학년</option>
       <option value="3">3학년</option>
      </select> 
      <br />

      성별 <input 
            name='gender'
            type="radio"
            value='M'
            checked={name.gender ==='M'}
             onChange={e => handleData(e)}
            /> 남
           <input 
            name='gender'
            type="radio"
            value='F'
            checked={name.gender ==='F'}
            onChange={e => handleData(e)}
           /> 여
      <br />
      소개말 <textarea 
               
               name='intro'
               value={name.intro}
               onChange={e => handleData(e)}
            ></textarea>
    </div>
  )
}

export default Haha