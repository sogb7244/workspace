import axios from "axios";

export const detail = async(item) => {
try {
  const response = await axios.get(`http://localhost:8080/items/${item}`)
  return response;
} catch(e){
 console.log(e)
}
} 
    