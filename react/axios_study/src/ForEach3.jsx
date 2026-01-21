import React from 'react'

const ForEach3 = () => {
  const options = ['c++','java','python'];
  return (
    <>
    <select>
      <option>과목선택</option>
      {
        options.map((e, i) => {
          return (
            <option key={i}>{e}</option>
          )
        })
      }
    </select>
    </>
  )
}

export default ForEach3