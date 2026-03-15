import { useState } from 'react'
import { StyleSheet } from 'react-native'
import { SafeAreaView } from 'react-native-safe-area-context'
import Study_1 from '../components/Study_1';
import Study_2 from '../components/Study_2';

//프로젝트 실행 시 최초 실행 파일(폰에서 최초로 보이는 화면)
//최초 실행 파일 순서 _layout.js -> index.js 
//파일의 이름은 통상적으로 HomeScreen으로 작성 함
//리액트 네이티브는 파일명과 컴포넌트 명이 같지 않는 경우가 많음

//<View> -> html의 div와 같은 역할
//react native에서는 문자 작성 시 반드시 <Text> 컴포넌트로 감싸야 함
const HomeScreen = () => {
  //TextInput에 입력한 데이터를 저장할 state 변수
  const [id, setId] = useState('');
  return (
    //폰화면에서 툴바영역을 제외한 나머지 영역만 사용할때작성
    <SafeAreaView style={styles.container}>
      {/* <Study_1/> */}
      <Study_2/>
    </SafeAreaView>
  )
}

export default HomeScreen

//디자인 중요 사항!
//react native의 모든 컴포넌트는 전부 flex가 기본 적용되어 있음
//컴포넌트의 기본 디자인 - display:flex, flex-direction : column
const styles = StyleSheet.create({
  container:{
    borderWidth:3,
    borderColor:'red',
    flex:1 //세로 화면 꽉 채우기
  }
})