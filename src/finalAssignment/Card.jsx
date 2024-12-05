import React from 'react';


function Card(props){
    const {title,className,children} = props;

    return(
        <div className={`card ${className}`}>
            {title && <h1>{title}</h1>}
            {children}
        </div>
    );
}

export default Card;