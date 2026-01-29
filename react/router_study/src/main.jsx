import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'

import App from './App.jsx'
import { BrowserRouter } from 'react-router-dom'

createRoot(document.getElementById('root')).render(
<BrowserRouter> 
    <App />
</BrowserRouter>
// 브라우저 라우팅 사용하기 위한 컴포넌트
)
