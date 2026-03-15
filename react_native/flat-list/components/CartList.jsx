import { FlatList, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { dummyD_data } from '../data/dummy';
import CartItem from './CartItem';
import AntDesign from '@expo/vector-icons/AntDesign';

const CartList = () => {
  const [cartList, setCartList] = useState(dummyD_data);
  return (
    <View>
      <Text>
        To do List
      </Text>
      <View style={styles.listContainer}>
        <FlatList
          //반복할 데이터
          data={cartList}
          //반복해서 그릴 그림
          renderItem={({item}) => <CartItem item={item}/>}
          //map합수의 key속성과 동일
          keyExtractor={item => item.id}
          //반복적으로 그려지는 컴포넌트를 감싸는 전체 영역 디자인
          contentContainerStyle={{gap:10}}
          />

      </View>
    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
  
  listContainer:{
    width:'90%',
    marginHorizontal:'auto',
    padding:12,
    backgroundColor:'#dddddd'
  }
})