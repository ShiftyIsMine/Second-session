import React from "react";
import Button from "./Button";

function ConfirmDialog(b){
    return(
        <div>
            <p>내용을 확인하셨으면 확인 버튼을 눌러주세요.</p>
            <Button a='green'>확인</Button>
            <Button a='blue'>취소</Button>
            <Button a='red'>reset</Button>
        </div>
    )
}



export default ConfirmDialog;