import axios from "axios"

export const regCarSale = async(regCar) => {
  try{
    const response = await axios.post('http://localhost:8080/cars/sale',regCar)
      return response
  } catch(e){
    console.log("판매정보등록 api 오류",e)
  } 
}

export const getColor = async() => {
  try{
    const response = await axios.get('http://localhost:8080/cars/color')
    return response
  } catch(e){
    console.log("색상 조회 api 오류",e)
  } 
}

export const getSaleList = async() => {
  try{
    const response = await axios.get('http://localhost:8080/cars/sale-list')
      return response
  } catch(e){
    console.log("판매목록조회 api 오류",e)
  } 
}
