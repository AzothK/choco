import {
  AppBar,
  Box,
  Container,
  Toolbar,
  Typography,
} from "@mui/material";

const Header = () => {
  return (
    <AppBar position="static">
      <Container maxWidth="xl">
        <Toolbar
          disableGutters
          sx={{ justifyContent: "space-between", display: "flex" }}
        >
          <Typography
            variant="h6"
            noWrap
            component="a"
            href="/"
            sx={{
              mr: 2,
              display: { xs: "none", md: "flex" },
              fontFamily: "monospace",
              fontWeight: 700,
              letterSpacing: ".3rem",
              color: "inherit",
              textDecoration: "none",
            }}
          >
            우동터
          </Typography>

          <Box sx={{ display: { xs: "flex", md: "none" } }}>ASDASD</Box>
          <Typography
            variant="h5"
            noWrap
            component="a"
            href=""
            sx={{
              mr: 2,
              display: { xs: "flex", md: "none" },
              fontFamily: "monospace",
              fontWeight: 700,
              letterSpacing: ".3rem",
              color: "inherit",
              textDecoration: "none",
            }}
          >
            LOGO
          </Typography>
          <Box sx={{ display: { xs: "none", md: "flex" } }}>
            <p>...</p>
          </Box>

          <Box>
            <p>...</p>
          </Box>
        </Toolbar>
      </Container>
    </AppBar>
  );
};

export { Header };
