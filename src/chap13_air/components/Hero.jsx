import React from 'react';
import bgImage from '../imgs/OIP.jpg'

function Hero(){
    return(
        <div className="hero" style={{backgroundImage : `url(${bgImage})`}}>
            <h1>특별한 숙소를 예약하세용.</h1>
            <p>에어비앤비에서 독특한 숙소를 찾아 보아라.</p>
        </div>
    );
}

export default Hero;