import React, { useState } from 'react'

const Testt = () => {
  const [post, setPost] = useState({
    title: '',
    writer: '',
    content: ''
  });
  const handlePost = (e) => {
      
    setPost({
      ...post,
      [e.target.name] : e.target.value
    })
  };

  console.log(post);
  return (
   <div>
    <h1>게시글 작성</h1>
    제목 : <input type="text" name='title' onChange={handlePost} /><br/>
    작성자 : <input type="text" name='writer' onChange={handlePost} /><br/>
    내용 : <br/>
    <textarea name="content" onChange={handlePost}></textarea>

    <hr />
    <h3>미리보기</h3>
    <p>제목 : {post.title}</p>
    <p>작성자 : {post.writer}</p>
    <p>내용 : {post.content}</p>
   </div>
  )
}

export default Testt