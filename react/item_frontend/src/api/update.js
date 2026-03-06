import axios from "axios";

export const updateDetail = async(items) => {
     try{
       const response = await axios.put(`http://localhost:8080/items/update`,items)
       return response.data;
     } catch(e){
        console.log("업뎃오류",e)
     }
}