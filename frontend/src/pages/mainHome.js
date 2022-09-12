import { Container } from "@mui/material";
import {useEffect} from "react";

const MainHome = () => {

    // server 통신 확인용 코드
    // useEffect(() => {
    //     (async () => {
    //         let data = await fetch("/strList").then(data => data.json());
    //         console.log(data)
    //     })();
    // }, []);

  return (
    <Container>
      <p>mainHome</p>
    </Container>
  );
};

export { MainHome };
