import React,{useState} from 'react';

function useCounter(I){
    const[count,setCount] = useState(I);

    const inC = () => ((count)+1);
    const deC = () => (Math.max(count-1,0));
    return(
        [count,inC,deC]
    );

}

export default useCounter;