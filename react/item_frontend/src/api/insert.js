import axios from "axios";

export const insertData = async(items) => {
    try{
     const response =await axios.post('http://localhost:8080/items/reg',items)
     return response;
    }catch(e) {
        console.log("등록오류",e)
    }
}