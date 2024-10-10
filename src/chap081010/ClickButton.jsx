import React, {useState} from "react";
import {render} from "@testing-library/react";
import button from "../chap04/Button";
//기본적인 클릭 이벤트 처리
//버튼을 클릭하면 알림창이 표시되게 합니다.

function ClickButton(){
    function clickK(){
        alert("열림");
    }
    return(
        <button onClick={clickK}>
            버튼
        </button>
    )
}

export default ClickButton


