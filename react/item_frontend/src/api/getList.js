import axios from "axios";



export const getList = async() =>{
  try{
    const response = await axios.get('http://localhost:8080/items');
    return response;
  }catch(e){
    console.log('조회오류',e);
  }
}