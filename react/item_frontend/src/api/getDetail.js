import axios from "axios";


export const getDetailList = async () =>{
  try{
    const response = await axios.get('http://localhost:8080/items/detail')
    return response;
  } catch(e){
    console.log("상세조회 실패",e)
  }
  
   
}
