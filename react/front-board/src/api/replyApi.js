import axios from "axios";

/**
 * 댓글 목록조회
 * @param {*} boardNum 
 * @returns 
 */
export const getList = async(boardNum) => {
  try{
   const response = await axios.get(`http://localhost:8080/replies/${boardNum}`);
   return response;
  } catch(e){
    console.log('댓글 목록 조회중 에러');
    console.log(e);
  }
}

/**
 * 댓글등록
 * @param {Object} replyData 등록할 댓글 정보
 * @param {string} replyData.writer 등록할 작성자
 * @param {string} replyData.content
 * @param {number} replyData.boardNum 
 */
export const save = async(replyData) => {
  try{
  const response = await axios.post('http://localhost:8080/replies',replyData);
  }catch(e){
    console.log('댓글 목록 등록중 에러');
    console.log(e);
  }
}
/**
 * 댓글 삭제
 * @param {number} replyNum 삭제할 댓글 번호
 */
export const delReply = async (replyNum) => {
  try{
    await axios.delete(`http://localhost:8080/replies/${replyNum}`)
  } catch (e){
    console.log('댓글 목록 삭제중 에러');
    console.log(e);
  }
}