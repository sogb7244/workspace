import React from 'react'

const Button = ({
  title='button'
  ,...props
}) => {
  return (
    <button
      {...props}>
        {title}
    </button>
  )
}

export default Button