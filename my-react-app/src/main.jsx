import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'

// createRoot(document.getElementById('root')).render(
//   <StrictMode>
//     <App />
//   </StrictMode>,
// )

function Car() {
  const brand = 'BMW';
  const model ="M3";
  return (
    <>
    <h2>{brand} {model}</h2>
    </>
  );
}

createRoot(document.getElementById('root2')).render(<Car />
)
//   <li>BENZ</li>
// </ul>
// );
// createRoot(document.getElementById('root')).render(myElement
// )

// createRoot(document.getElementById('root2')).render(
//   <StrictMode>
//     <App />
//   </StrictMode>,
// )



// createRoot(document.getElementById('root')).render(
//     <StrictMode>
//         <Car />
//     </StrictMode>,
// )