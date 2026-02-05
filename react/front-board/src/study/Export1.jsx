import React from 'react'
//js 파일의 변수 및 함수 import 방식 1
import { age , test1 } from '../Util/myMath'
//js 파일의 변수 및 함수 import 방식 2
//myMath파일에 있는 모든 함수,변수를 가져오는건 *
//객체.변수로 쓸 수 있음
import * as fun from '../Util/myMath'

const Export1 = () => {
  const data1 = age;
  test1();
  console.log(fun.name);
  fun.test2();
  return (
    <div>Export1</div>
  )
}
// './xxxx.jsx' 에서 .은 현재경로
// '../ 상위폴더로
// ../../  상위폴더로 2번
export default Export1