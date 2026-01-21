import React from 'react'

const ForEach2 = () => {
  const arr = [1, 5.5, 'react']
  return (
    <>
    {
    arr.map((e,i) => {
      return (
        <div key={i}>{e}</div>
      )
    })
    }
    </>
  )
}

export default ForEach2