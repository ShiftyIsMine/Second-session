import React,{useState,useEffect} from 'react';
import useCounter from './useCounter';

function Accommodate(props){
    const [isFull,setIsFull]=useState(false);
    const [count,inC,deC]=useCounter(0);

    const MAX_CAPACITY=10;
    useEffect(()=>{
        console.log(`${isFull}`);
    })
    useEffect(()=>{
        setIsFull(count >= MAX_CAPACITY);
        console.log(`${count}`);

    })
}