import React from 'react'

const Btn = ({
    //초기값
  title = '제목',
  disabled = false,

  ...props
}) => {
  return (
    <button
      {...props}
      >
    {title}</button>
  )
}

export default Btn