import React, {useState} from 'react';
import button from "../chap04/Button";
import {isDisabled} from "@testing-library/user-event/dist/utils";

class ConfirmButton2 extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            isConfirmed: false,
        };
    }

    handleConfirm2 = ()=>{
        this.setState((prevState)=>({
            isConfirmed : !prevState.isConfirmed,
        }))
    }
    render() {
        return(
            <button onClick={this.handleConfirm} disabled={this.state.isConfirmed}>
                {this.state.isConfirmed ? "확인됨" : "확인하기"}
            </button>
        )
    }
}

export default ConfirmButton2