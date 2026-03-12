import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import CartList from '../components/CartList'
import { dummyD_data } from '../data/dummy'

const HomeScreen = () => {
  
  return (
    <SafeAreaView>
      <CartList/>
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})