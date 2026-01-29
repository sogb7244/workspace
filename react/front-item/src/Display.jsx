import React, { useState } from 'react'

const Display = (props) => {
//console.log(props); => {cnt:0}
  return (
    <div style={{
      backgroundColor : 'lightgray',
      padding :'12px',
      margin :'12px 0px'
    }}>
      <p>현재 카운트 :</p>
    <h3>{props.cnt}</h3>
    </div>
  )
 
}

export default Display