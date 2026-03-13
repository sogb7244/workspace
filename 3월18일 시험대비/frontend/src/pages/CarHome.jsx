import React, { useEffect, useState } from 'react'
import HeaderLayout from '../layout/HeaderLayout'
import styles from './CarHome.module.css'
import { getCarsList, regCarList } from '../api/Car';
import Select from '../components/common/Select';
import { getCategories } from '../api/cate';
import Input from '../components/common/Input';
import Button from '../components/common/Button';

const CarHome = () => {
  //등록된 차량을 list로 받아오는 함수
  const [regedCar, setRegedCar] =useState([]);
  //spring으로 전달할 변수
  const [regCars,setRegCars] =useState({
    brand: '',
    modelName : '',
    price : '',
  });
  const [cate, setCate] = useState([]); 
  //카테고리
  const categories = async() => {
    const response = await getCategories();
    setCate(response.data)
  }
  const handleRegCars = (e) => 
        setRegCars((prev) => {
      return{
        ...prev,
        [e.target.name] : e.target.value
      }
    }
  )
  const [blacnkError,setblankError] = useState({
    brand:'',
    modelName:'',
    price:''
  })

  const validation = () => {
    let isValid = true;

    const blankError = {
      brand:'',
      modelName: '',
      price: ''
    } 
    if(regCars.brand === ''|| regCars.brand ==='0'){
      blankError.brand = '제조사를 골라주세요'
      isValid = false;
    }
     if(regCars.modelName == ''){
      blankError.modelName = '차량모델을 골라주세요'
      isValid = false;
    }
     if(regCars.price == ''){
      blankError.price = '가격을 정해주세요'
      isValid = false;
    }
    setblankError(blankError)
    return isValid;
  }
      useEffect(() => {
    carsList()
    categories()
  },[regedCar.length])
  //등록된 차량 리스트 조회
  const carsList = async() => {
    const response = await getCarsList()
          setRegedCar(response.data);
  }
  //차량 등록 
  const regcarLists = async() => {
    //유효성 검사 실행
    const isValid = validation();

    if(!isValid){
      return;
    }
    else await regCarList(regCars);
    setRegCars({
      brand: '',
      modelName: '',
      price: ''
    })
    
  }
  console.log(regedCar)
  console.log(cate)
  return (
    <div className={styles.container}>
      <HeaderLayout/>
      <div className={styles.carReg}>
        <div className={styles.header}>
          <h4>차량등록</h4>
          <div className={styles.inputer}>
            <div>
              <p>제조사</p>
              <Select
                name='brand'
                value={regCars.brand}
                onChange={e => {
                  handleRegCars(e)
                }}>
                <option value='0'>선택</option> 
                {
                  cate.map((cates,i) => {
                    return(
                      <option key={cates.cateNum} value={cates.cateName}>
                        {cates.cateName}
                      </option>
                    )
                  })
                }
              </Select>
              {blacnkError.brand && <p>{blacnkError.brand}</p>}
            </div>
            <div>
              <p>모델명</p>
              <Input
                type='text'
                name='modelName'
                value={regCars.modelName}
                onChange={e=>{
                  handleRegCars(e)
                }}>
              </Input>
              {blacnkError.modelName && <p>{blacnkError.modelName}</p>}
            </div>
            <div>
              <p>차량가격</p>
              <Input
                type='text'
                name='price'
                value={regCars.price}
                onChange={e=>{
                  handleRegCars(e)
                }}>
              </Input>
              {blacnkError.price && <p>{blacnkError.price}</p>}
            </div>
          </div>
        </div>
        <div className={styles.btn}>
          <Button
            type='button'
            onClick={(e) => {
              regcarLists(e)
            }}
            title='등록'>
          </Button>
        </div>
      </div>
    <div>
      <p>등록된 차량 목록</p>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>모델번호</td>
            <td>모델명</td>
            <td>제조사</td>
          </tr>
        </thead>
        <tbody>
         {
          regedCar.map((cars,i)=>{
            return(
              <tr key={i}>
                <td>{regedCar.length}</td>
                <td>{cars.modelNum}</td>
                <td>{cars.modelName}</td>
                <td>{cars.brand}</td>
              </tr>
            )
          })
         }
        </tbody>
      </table>
    </div>
  </div>
  )
}

export default CarHome