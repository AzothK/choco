import "./App.css";
import { Container, CssBaseline, ThemeProvider } from "@mui/material";
import CustomMuiTheme from "./styles/theme";
import { MainHome } from "./pages/mainHome";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Header } from "./components/header";

function App() {
  return (
    <ThemeProvider theme={CustomMuiTheme}>
      <CssBaseline />
      <Container maxWidth="xl">
        <Header />
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<MainHome />} />
          </Routes>
        </BrowserRouter>
      </Container>
    </ThemeProvider>
  );
}

export default App;
