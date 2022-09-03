import { createTheme } from "@mui/material";
import { grey } from "@mui/material/colors";

// material ui의 기본 컴포넌트들의 스타일 지정
// 자유롭게 변경 가능
const CustomMuiTheme = createTheme({
  breakpoints: {
    keys: ["xs", "sm", "md", "lg", "xl"],
    values: {
      xs: 0,
      sm: 600,
      md: 960,
      lg: 1280,
      xl: 1920,
    },
  },
  status: {
    danger: "#e53e3e",
  },
  palette: {
    primary: {
      main: "#0971f1",
      dark: "#085ec9",
    },
    neutral: {
      main: "#64748B",
      contrastText: "#fff",
    },
    secondary: grey,
  },
  typography: {
    fontFamily: "Hubba",
    fontWeightLight: 400,
    fontWeightMedium: 500,
    fontWeightRegular: 600,
    fontWeightBold: 700,
  },
});

export default CustomMuiTheme;
