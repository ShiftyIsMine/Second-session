import React,{useState} from "react";
import Toolbar from "./Toolbar";

function LandingPage(props){
    const [isLoggedIn,setIsLoggedIn] = useState(false);

    const onClickLogin=()=>{
        setIsLoggedIn(true);
    };

    const onClickLogout=()=>{
        setIsLoggedIn(false);
    };

    return(
        <div>
            <Toolbar
                isLoggedIn={isLoggedIn}
                onClickLogin={onClickLogin}
                onClickLogout={onClickLogout}/>
            <div style={{padding:16,color:"mistyrose",fontSize:60,fontWeight:"bolder",backgroundColor:"tan"}}>인공지능소프트웨어과</div>
        </div>
    );
}
export default LandingPage;