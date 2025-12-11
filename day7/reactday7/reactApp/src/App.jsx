import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import aadhithimg from './assets/aadhith.png'
import aadhith2 from './assets/aadhith2.jpg'

function App() {
  return (
    <>
      <div>
        <img src={aadhithimg} className="logo aadhith" alt="Aadhith logo" height={200} width={300} />
        <img src={aadhith2} className="logo aadhith" alt="Aadhith logo" height={200} width={300} />
      </div>
      <div className="aadhi">
        <h1>I am Aadhith</h1>
      </div>
    </>
  )
}

export default App
