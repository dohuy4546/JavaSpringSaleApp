import './App.css';
import { Header } from './layout/Header';
import APIs, { endpoints } from './config/APIs';
import React from 'react';
import { Container } from 'react-bootstrap';

function App() {
  const [categories, setCategories] = React.useState([]);

  const loadCates = async () => {
    try {
      let res = await APIs.get(endpoints['category']);
      setCategories(res.data);
    } catch (ex) {
      console.error(ex);
    }
  }

  React.useEffect(() => {
    loadCates();
  }, []);

  return (
    <>
      <Header />
      <Container>
        <ul>
        {categories.map((c) => <li key={c.id}>{c.name}</li> )}
        </ul>
      </Container>
    </>
  );
}

export default App;
