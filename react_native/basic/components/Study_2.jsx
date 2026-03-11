import { View, Text, TextInput, Pressable, StyleSheet } from 'react-native'
import React, { useState } from 'react'

const Study_2 = () => {
  const [loginData, setLoginData] = useState({
    id : '',
    pw : ''
  });

  const handleData = (name,text) => {
    setLoginData({
      ...loginData,
      [name] : text
    });
  };
  const[isShow,setIsShow] = useState(false);
  console.log(loginData)
  return (
    <View style={styles.container}>
      <TextInput
        style={styles.inputID}
        placeholder='Input Your ID'
        value={loginData.id}
        onChangeText={text=> handleData('id',text)}
        />
     
      <TextInput
        secureTextEntry={true}
        style={styles.inputPW}
        placeholder='Input Your PW'
        value={loginData.pw}
        onChangeText={text=> handleData('pw',text)}/>
      <Pressable
        onPress={e => {
          setIsShow(true)
        }}
        style={styles.btnContainer}
        >
        <Text
          style={styles.btn}>
         로그인
        </Text>
      </Pressable>
      {
        isShow &&
        <View>
          <Text>입력한 정보
          </Text>
          <Text>아이디 :{loginData.id}</Text>
          <Text>비번: {loginData.pw}</Text>
        </View>
      }
      
      
    </View>
  )
}

export default Study_2

const styles = StyleSheet.create({
  container:{
    backgroundColor:'white',
    width:'100%',
    gap:20
  },
  inputID:{
    borderWidth:1,
    borderRadius:6,
  },
  inputPW:{
    borderWidth: 1,
    borderRadius:6,
  },
  btnContainer:{
    backgroundColor:'blue',
    justifyContent:'center',
    alignItems:'center',
    height:34,
    borderRadius:6
  },
  btn:{
    color:'white'
  }
})