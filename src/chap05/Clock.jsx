import React from "react";

function Clock(props){
    return(
        <div>
            <h1>Clock Test</h1>
            <div className={'aa'}>It is {new Date().toLocaleTimeString()}</div>
        </div>
    )
}


export default Clock;