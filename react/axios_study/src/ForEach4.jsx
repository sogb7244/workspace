import React from 'react'

const ForEach4 = () => {
      const stuList =[
{
  stuNum : 1,
  name : 'kim',
  score :80
},
{
  stuNum :2,
  name : 'lee',
  score :90
},
{
  stuNum :3,
  name : 'park',
  score:100
}

    ]
  return (
  <>
    <table>
      <tr>
      
        <td>학번</td>
        <td>이름</td>
        <td>점수</td>
        
      </tr>
      <tbody>
        {
          stuList.map((e,i) => {
            return(
              <tr key={e.stuNum}>
                <td>{e.stuNum}</td>
                <td>{e.stuName}</td>
                <td>{e.score}</td>
              </tr>
          
            )
          })
        }
      </tbody>
    </table>
  </>
  )
}

export default ForEach4