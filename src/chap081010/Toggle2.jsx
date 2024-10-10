import React, {useState} from "react";
import button from "../chap04/Button";

function Toggle2(){
    const [isToggleOn,setIsToggleOn]= useState(true);

    //첫 번째 방법 : 이벤트 발생 시 함수 컴포넌트 내에서 함수로 정의하는 방법
    // function handleClick() {
    //     setIsToggleOn((isToggleOn)=> !isToggleOn)
    // }
    //arrow 함수(익명 함수)
    const handleClick = () => {
        setIsToggleOn((isToggleOn)=> !isToggleOn)
    }
    return(
        <button onClick={handleClick} >
            함수형 컴포넌트2 {isToggleOn ? "켜짐" : "꺼짐"}
        </button>
    )
}

export default Toggle2