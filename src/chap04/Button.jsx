import React from "react";

function Button(b){
    return(
        <button className={`bg-${b.a}`}>
            <b>
                {b.children}
            </b>
        </button>
    )
}

export default Button;