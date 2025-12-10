import { StrictMode } from 'react'
import { useState } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
// import App from './App.jsx'

function FavoriteCar() {
  const [car, setCar] = useState('BMW');
  return (
  <>
  <h1>My favorite car is {car}</h1>
  <button type="button" onClick={() => setCar('Audi')}>Change to Audi</button>
  <br />
  <br></br>
  <button type="button" onClick={() => setCar('Kundith motorsport')}>suprise</button>
  </>
  );
}
const root = createRoot(document.getElementById('root'));
createRoot(document.getElementById('root')).render(<FavoriteCar />)