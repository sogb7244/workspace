import AntDesign from '@expo/vector-icons/AntDesign';
import { useState } from 'react';
import { Pressable, StyleSheet, Text, TextInput, View } from 'react-native';
import { dummyD_data } from '../data/dummy';

const CartItem = ({item,ondo}) => {
  //현재 수정중인지 상태를 파악하기 위한 state 변수
  const [isEditing,setIsediting] = useState(false);
  //리스트
  const [cartList, setCartList] = useState(dummyD_data);
  const [inputData,setInputData] =useState(item.item);

  const postdata = () => {
    // cartList에서 item을 업데이트
    const updatedList = cartList.map(cartItem => 
      cartItem.id === item.id 
        ? { ...cartItem, item: inputData } 
        : cartItem
    );
    setCartList(updatedList);
    setIsediting(false);  
  };
 
  

  console.log(inputData);
  return (
    <View style={styles.container}>
      {
        isEditing 
        ? 
        <>
          <TextInput 
            style={styles.input}
            value={inputData}
            onChangeText={(text) => {
              setInputData(text);
            }}
            //textInput에 자동으로 커서가 위치함
            autoFocus={true}
            //return이나 확인 눌렀을 때 함수 실행
            onSubmitEditing={(e) => {
              postdata()
            }}
            //포커스를 잃어버릴 때 실행되는 이벤트
            onBlur={(e) => {
              setIsediting(false)
            }}
          />
        </>
        : 
        <>
          <Text
            style={styles.title}
            >{inputData}
          </Text>
          <Pressable onPress={() => {
            setIsediting(true);
            }}
            style={styles.itemContainer}>
            <AntDesign 
              name="edit"
              size={24} 
              color="black"
              style={styles.icon}
            />  
          </Pressable>
          <Pressable
            onPress={() =>{
              ondo(item.id)
            }}
            style={styles.itemContainer}>
            <AntDesign 
              name="delete-row" 
              size={24} 
              color="black"
              style={styles.icon}
            />
          </Pressable>
        </>
      }
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

  },
  itemContainer:{
    width:'10%',
    alignItems : 'center',
    justifyContent : 'center'
  },
  input:{
    borderWidth:1,
    width:'100%'
  }
})