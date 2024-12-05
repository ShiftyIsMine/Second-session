import React from 'react';
import Card from './Card';
import cray from '../imgs/짱구1.jpg';
import fearr from '../imgs/fearrr.jpg';


const listings = [
    {
        id: 1,
        title:"서울의 아늑한 아파트",
        price: 1000000,
        rating : 5.0,
        imageUrl : `${cray}`
    },
    {
        id: 2,
        title:"서울의 누추한 아파트",
        price: 1000000,
        rating : 4.0,
        imageUrl : `${cray}`
    },
    {
        id: 3,
        title:"서울의 무너질 것 같은 아파트",
        price: 1000000,
        rating : 3.0,
        imageUrl : `${fearr}`
    },
];

function CardContainer(){
    return(
        <div className="card-container">
            {listings.map(listing => (
                <Card key={listing.id}{...listing}/>
            ))}
        </div>
    );
}

export default CardContainer;