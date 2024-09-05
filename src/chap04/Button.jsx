import React from "react";

function Button(b){
    return(
        <button className={`c-${b.asdfasdfasdf}`}>
            <b>
                {b.children}
            </b>
        </button>
    )
}

export default Button;

