import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'

// createRoot(document.getElementById('root')).render(
//   <StrictMode>
//     <App />
//   </StrictMode>,
// )
const myElement = (<ul>
  <li>BMW</li>
  <li>AUDI</li>
  <li>BENZ</li>
</ul>
);
createRoot(document.getElementById('root')).render(myElement
)

createRoot(document.getElementById('root2')).render(
  <StrictMode>
    <App />
  </StrictMode>,
)