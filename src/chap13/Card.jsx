import React from 'react';

function Card(props){
    const {title,backgroundColor,children} = props;

    return(
        <div style={{
            margin: 8,
            padding: 10,
            borderRadius : 40,
            boxShadow: "0px 0px 0px 1px grey",
            backgroundColor : backgroundColor || "aquamarine",
        }}>
            {title && <h1>{title}</h1>}
            {children}
        </div>
    );
}

export default Card;