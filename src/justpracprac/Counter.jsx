import React, {useState,useEffect} from 'react';

function Counter(props){
    const [isClicked,setIsClicked]= useState(false);
    return(
        <div>
            <button onClick={setIsClicked ? "클릭됨" : "클릭하세여"}>
                버튼
            </button>
        </div>
    )
}

export default Counter;