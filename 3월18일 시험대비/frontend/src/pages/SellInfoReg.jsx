import React, { useEffect, useState } from 'react'
import Input from '../components/common/Input';
import Button from '../components/common/Button';
import styles from './SellInfoReg.module.css'
import Select from '../components/common/Select';
import { getModelName } from '../api/Car';
import { getColor, regCarSale } from '../api/carSale';
import { useNavigate } from 'react-router-dom';



const SellInfoReg = () => {
  const nav = useNavigate();
  const [regCarSales,setRegCarsales] = useState({
    modelNum: '',
    color: '',
    buyerTel:'',
    buyerName:''
  })

  const [modelName,setModelName] =useState([])
  const [colors,setColor] =useState([])

  useEffect(() =>{
    regCarAPI()
    getColorList()
  },[])
  //모델명 조회
  const regCarAPI = async() => {
    const response = await getModelName();
    setModelName(response.data);
  }
  //색상 조회
  const getColorList = async() => {
    const response = await getColor();
      setColor(response.data);
    }
  
  //판매정보등록
  const carSaleReg = async() => {
    const isValid = validation()
    if(!isValid){
      return
    }
    else
    await regCarSale(regCarSales)
    nav('/sale-list')

  }
  const handleCarSales = (e) => {
    setRegCarsales((prev) => ({
      ...prev,
      [e.target.name] : e.target.value
    }))
  }
  const [blankerrors,setblankError] =useState({
      buyerName:'',
      color:'',
      carModel:'',
      phoneNum:''
    })
  const validation = () => {
    //오류 메세지를 저장할 변수
    let isValid = true
    const errors = ({
      buyerName:'',
      color:'',
      carModel:'',
      phoneNum:''
    })
    if(regCarSales.buyerName === ''){
      errors.buyerName = '구매자명을 입력하세요'
      isValid = false
    }
      const telcheck = /^010-\d{4}-\d{4}$/;
    if (regCarSales.buyerTel=== '') {
      errors.phoneNum = '연락처를 입력하세요.'
      isValid = false;
    }
      else if (!telcheck.test(regCarSales.buyerTel)) {
        errors.phoneNum = '연락처 형식이 올바르지 않습니다'
        isValid = false;
      }
    if(regCarSales.modelNum === '' || regCarSales.modelNum === '0'){
      errors.carModel = '모델명을 선택하세요'
      isValid = false
    }
    if(regCarSales.color === '' || regCarSales.color === '0'){
      errors.color = '색상을 선택하세요'
      isValid = false
    }
    setblankError(errors)
    return isValid;
  }
  console.log(regCarSales)
  return (
    <div className={styles.container}>
      <div>
        <p>구매자명</p>
        <Input
          name='buyerName'
          value={regCarSales.buyerName}
          onChange={e => {
            handleCarSales(e)
          }}/>
        <p className={styles.error_text}>
          {blankerrors.buyerName ? blankerrors.buyerName : ''}
        </p>
      </div>
      <div className={styles.input_modules}>
        <div>
          <p>색상</p>
          <Select
            name='color'
            value={regCarSales.color}
            onChange={(e)=>{
              handleCarSales(e)
            }}
            >
            <option value=''>선택</option>  
            {
              colors.map((color,i)=>{
                return(
                  <option 
                    value={color.color}
                    key={i}>{color.color}</option>
                )
              })
            }
          </Select>
          <p className={styles.error_text}>
            {blankerrors.color ? blankerrors.color : ''}
          </p>
        </div>
        <div>
          <p>모델</p>
          <Select
            name='modelNum'
            value={regCarSales.modelNum}
            onChange={(e) => {
              handleCarSales(e);
            }}>
              <option value='0'>선택</option>
              {
                modelName.map((moname, i)=>{
                  return(
                    <option 
                      value={moname.modelNum}
                      key={i}>
                        {moname.modelName}
                    </option>
                  )
                }) 
              }
          </Select>
          <p className={styles.error_text}>
          {blankerrors.carModel ? blankerrors.carModel : ''}
          </p>
        </div>
      </div>
      <div>
        <p>연락처</p>
        <Input
          name='buyerTel'
          value={regCarSales.buyerTel}
          onChange={e => {
            handleCarSales(e)
          }}/>
          <p className={styles.error_text}>
          {blankerrors.phoneNum ? blankerrors.phoneNum : ''}
          </p>
      </div>
      <div className={styles.sale_btn_container}>
        <Button
          title='등록'
          onClick={e => {
            carSaleReg(e)
          }}
          className={styles.sale_btn}/>
      </div>
    </div>
  )
}

export default SellInfoReg