import axios from "axios"

export const getCategories = () => {
  try{
    const response =axios.get('http://localhost:8080/cars/categories')
      return response
  } catch(e){
    console.log("카테고리 api 오류",e)
  } 
}
