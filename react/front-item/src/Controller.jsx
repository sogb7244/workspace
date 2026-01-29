import React from 'react'

const Controller = ({cnt,setCnt}) => {
  //console.log(props); =>{aaa : setCnt()}
  // setCnt();
  return (
   <div style={{
      backgroundColor : 'lightgray',
      padding :'12px',
      margin :'12px 0px'
    }}>
      <button 
        type='button'
        onClick={e =>{setCnt(cnt -10)}}>-10</button>
      <button 
        type='button'
        onClick={e =>{setCnt(cnt -1)}}>-1</button>
      <button
        type='button'
        onClick={e =>{setCnt(props.cnt +1)}}>+1</button>
      <button 
        type='button'
        onClick={e =>{props.setCnt(props.cnt +10)}}>+10</button>
    </div>
  )
}

export default Controller