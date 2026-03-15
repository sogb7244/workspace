import axios from "axios"

export const regCarList = async(regCar) => {
  try{
    const response = await axios.post('http://localhost:8080/cars',regCar)
      return response
  } catch(e){
    console.log("차량 등록 api 오류",e)
  } 
}

export const getCarsList = async() => {
  try{
    const response = await axios.get('http://localhost:8080/cars/list')
      return response
  } catch(e){
    console.log("차량 리스트 api 오류",e)
  } 
}


export const getModelName = async() => {
  try{
    const response = await axios.get('http://localhost:8080/cars/model-name')
      return response
  } catch(e){
    console.log("모델명 조회 api 오류",e)
  } 
}


