import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import aadhithimg from './assets/aadhith.png'
import './App.css'

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <div>
//         <a href="https://vite.dev" target="_blank">
//           <img src={viteLogo} className="logo" alt="Vite logo" />
//         </a>
//         <a href="https://react.dev" target="_blank">
//           <img src={reactLogo} className="logo react" alt="React logo" />
//         </a>
//       </div>
//       <h1>AADHITH</h1>
//       <div className="card">
//         <button onClick={() => setCount((count) => count + 1)}>
//           count is {count}
//         </button>
//         <p>
//           HI Aadhith WELCOME TO REACT APPLICATION BUILT WITH VITE
//         </p>
//       </div>
//       <p className="read-the-docs">
//         Click on the Vite and React logos to learn more
//       </p>
//       <div>
//         <img src="assets/aadhith.png" className="logo aadhith" alt="Aadhith logo" />
//       </div>
//     </>
//   )
// }

function App() {
  return (
    <div className="app">
      <h1>BUY ME A BMW</h1>
      {/* <img src={reactLogo} className="logo react" alt="React logo" /> */}
      <img src={aadhithimg} className="logo aadhith" alt="Aadhith logo" />
    </div>
  )
}

// function Car() {
//     return (
//     <>
//     <h2>BUY ME A BMW</h2>
//     </>
//     );
// }

// const MyComponent = () => { return ( <div> <img src={myImage} alt="My Image" /> </div> ); }

export default App
// export { Car }