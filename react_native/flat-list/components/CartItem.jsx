import { FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import CartList from './CartList'
import AntDesign from '@expo/vector-icons/AntDesign';

const CartItem = ({item}) => {

  return (
    <View style={styles.container}>
      <Text
        style={styles.title}
        >{item.item}</Text>
        <AntDesign 
          name="delete-row" 
          size={24} 
          color="black"
          style={styles.icon}
          onPress={item => {
            
          }}
           />
        <AntDesign 
        name="edit"
        size={24} 
        color="black"
        style={styles.icon}
         />
    </View>
  )
}

export default CartItem

const styles = StyleSheet.create({
  container:{
    flexDirection:'row',
    backgroundColor:'#eeeeee',
    paddingVertical: 10,
    paddingHorizontal:12,
    alignItems:'center'
  },
  title:{
    width:'80%',
    fontSize:24
  },
  icon:{
    width:'10%'
  }
})