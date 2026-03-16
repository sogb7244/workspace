import { Keyboard, StyleSheet, Text, TextInput, TouchableNativeFeedback, View } from 'react-native'
import React, { useState } from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import CartList from '../components/CartList'
import { dummyD_data } from '../data/dummy'

const HomeScreen = () => {
  //새롭게 입력한 장 볼 물품을 저장할 state 변수
  const [newItem,setNewItem] = useState('');
  const [cartList, setCartList] = useState(dummyD_data);
  //장 목록 추가
  const addCart = () => {
    //추가할 id
    //Math.max([1,2,3]) => 3
    const idList = cartList.map((item,i) => item.id)
    const newData = {
      id : cartList.length === 0 ? 1 : Math.max(idList)+1 ,
      item : newItem
    }
    
    //추가할 데이터를 cartList에 저장
    setCartList([...cartList,newData]);
    //TextInput 초기화
    setNewItem('');
  }

  return (
    // 빈 곳 터치 시 키보드 숨김 기능
    // 아이폰은 accessible={false} props 속성이 필요함
    <TouchableNativeFeedback onPress={Keyboard.dismiss} accessible={false}>
      <SafeAreaView style={styles.container}>
        <TextInput 
        style={styles.input}
        value={newItem}
        onChangeText={text => setNewItem(text)}
        //터치 키보드의 ok, 선택,엔터,return 터치시 실행하는 이벤트
        //입력한 데이터를 cartList에 추가
        onSubmitEditing={() => addCart()}
        />
        <CartList cartList={cartList}/>
      </SafeAreaView>
    </TouchableNativeFeedback>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  container: {
    flex : 1,
  },  
  input : {
    borderWidth : 1
  }
})