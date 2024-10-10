import React, {useState} from 'react';
import button from "../chap04/Button";
import {isDisabled} from "@testing-library/user-event/dist/utils";

function ConfirmButton3(props){
    const[isConfirmed,setIsConfirmed] = useState(false);

    function handleConfirm(){
        setIsConfirmed(prevIsConfirmed => !prevIsConfirmed);
    }

    return(
        <button onClick={handleConfirm} disabled={isConfirmed}>
            {isConfirmed ? "확인됨" : "확인하기"}
        </button>
    )

}


export default ConfirmButton3