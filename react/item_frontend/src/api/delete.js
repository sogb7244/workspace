import axios from "axios";

export const deleteDetail = async(itemNum) => {
try{
const response = await axios.delete(`http://localhost:8080/items/detail/${itemNum}`)
return response;
}catch(e){
    console.log(e)
}
}