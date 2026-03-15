import React from 'react'
import styles from './Button.module.css'
const Button = ({
  title='button'
  ,...props
}) => {
  return (
    <button
      {...props}
        className={`${styles.btn} ${props.className ||''}`}
      >
        {title}
    </button>
  )
}

export default Button